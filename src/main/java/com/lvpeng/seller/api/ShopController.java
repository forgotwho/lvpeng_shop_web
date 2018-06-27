package com.lvpeng.seller.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.bean.ShopFullBean;
import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.AppConfig;
import com.lvpeng.seller.dal.model.GoodsInnerCategory;
import com.lvpeng.seller.dal.model.Layout;
import com.lvpeng.seller.dal.model.Member;
import com.lvpeng.seller.dal.model.MemberCard;
import com.lvpeng.seller.dal.model.Notice;
import com.lvpeng.seller.dal.model.Shop;
import com.lvpeng.seller.dal.model.ShopChargeLimit;
import com.lvpeng.seller.dal.model.ShopStatusInfo;
import com.lvpeng.seller.dal.model.UserToken;
import com.lvpeng.seller.dal.repository.AppConfigRepository;
import com.lvpeng.seller.dal.repository.GoodsInnerCategoryRepository;
import com.lvpeng.seller.dal.repository.LayoutRepository;
import com.lvpeng.seller.dal.repository.MemberCardRepository;
import com.lvpeng.seller.dal.repository.MemberRepository;
import com.lvpeng.seller.dal.repository.NoticeRepository;
import com.lvpeng.seller.dal.repository.PluginRepository;
import com.lvpeng.seller.dal.repository.ShopChargeLimitRepository;
import com.lvpeng.seller.dal.repository.ShopRepository;
import com.lvpeng.seller.dal.repository.ShopStatusInfoRepository;
import com.lvpeng.seller.dal.repository.UserTokenRepository;

@RestController
@RequestMapping("/shops")
public class ShopController {

	@Autowired
	private UserTokenRepository userTokenRepository;

	@Autowired
	private AppConfigRepository appConfigRepository;

	@Autowired
	private ShopRepository shopRepository;
	
	@Autowired
	private LayoutRepository layoutRepository;

	@Autowired
	private PluginRepository pluginRepository;

	@Autowired
	private GoodsInnerCategoryRepository goodsInnerCategoryRepository;

	@Autowired
	private ShopChargeLimitRepository shopChargeLimitRepository;

	@Autowired
	private ShopStatusInfoRepository shopStatusInfoRepository;

	@Autowired
	private NoticeRepository noticeRepository;

	@Autowired
	private MemberCardRepository memberCardRepository;

	@Autowired
	private MemberRepository memberRepository;

	@RequestMapping(value = "/full", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean full(@RequestHeader("login_code") String login_code) {
		ResultBean result = new ResultBean();
		try {

			Date expireTime = new Date();
			UserToken userToken = userTokenRepository.findByLoginCodeAndExpireTimeGreaterThan(login_code, expireTime);
			if (userToken == null) {
				result.setCode(-1);
				return result;
			}

			AppConfig appConfig = appConfigRepository.findByAppCode(userToken.getAppCode());

			Shop shop = shopRepository.findById(appConfig.getShopId());

			ShopStatusInfo shopStatusInfo = shopStatusInfoRepository.findByShopId(shop.getId());

			ShopChargeLimit shopChargeLimit = shopChargeLimitRepository.findByShopId(shop.getId());

			List<String> reduceRules = new ArrayList<>();

			List<Notice> notices = noticeRepository.findByShopId(shop.getId());

			Member member = memberRepository.findByShopId(shop.getId());

			MemberCard memberCard = memberCardRepository.findByShopId(shop.getId());

			List<GoodsInnerCategory> goodsInnerCategory = goodsInnerCategoryRepository.findByShopId(shop.getId());

			Layout homeLayout = layoutRepository.findByShopIdAndType(shop.getId(), "HOME");
			Layout customLayout = layoutRepository.findByShopIdAndType(shop.getId(), "CUSTOM");

			ShopFullBean shopFullBean = new ShopFullBean();
			shopFullBean.setCampaignCoupon(null);
			shopFullBean.setHomePageConfig(null);
			shopFullBean.setCustomPageId(customLayout.getId());
			shopFullBean.setHomePageId(homeLayout.getId());

			shopFullBean.setGoodsInnerCategories(goodsInnerCategory);
			shopFullBean.setMember(member);
			shopFullBean.setMemberCard(memberCard);
			shopFullBean.setNotices(notices);
			shopFullBean.setReduceRules(reduceRules);
			shopFullBean.setShop(shop);
			shopFullBean.setShopChargeLimit(shopChargeLimit);
			shopFullBean.setShopStatusInfo(shopStatusInfo);
			result.setData(shopFullBean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(value = "/status", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean status(@RequestHeader("login_code") String login_code) {
		ResultBean result = new ResultBean();
		try {
			Date expireTime = new Date();
			UserToken userToken = userTokenRepository.findByLoginCodeAndExpireTimeGreaterThan(login_code, expireTime);
			if (userToken == null) {
				result.setCode(-1);
				return result;
			}

			AppConfig appConfig = appConfigRepository.findByAppCode(userToken.getAppCode());
			ShopStatusInfo shopStatusInfo = shopStatusInfoRepository.findByShopId(appConfig.getShopId());
			result.setData(shopStatusInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}