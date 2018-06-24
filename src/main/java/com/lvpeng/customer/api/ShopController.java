package com.lvpeng.customer.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.customer.bean.ShopFullBean;
import com.lvpeng.customer.common.ResultBean;
import com.lvpeng.customer.dal.model.ShopStatusInfo;
import com.lvpeng.customer.dal.repository.GoodsInnerCategoryRepository;
import com.lvpeng.customer.dal.repository.MemberCardRepository;
import com.lvpeng.customer.dal.repository.MemberRepository;
import com.lvpeng.customer.dal.repository.NoticeRepository;
import com.lvpeng.customer.dal.repository.ShopChargeLimitRepository;
import com.lvpeng.customer.dal.repository.ShopRepository;
import com.lvpeng.customer.dal.repository.ShopStatusInfoRepository;

@RestController
@RequestMapping("/shops")
public class ShopController {

	@Autowired
	private ShopRepository shopRepository;

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
			ShopFullBean shopFullBean = new ShopFullBean();
			shopFullBean.setCampaignCoupon(null);
			shopFullBean.setCustomPageId(1);
			shopFullBean.setGoodsInnerCategories(goodsInnerCategoryRepository.findAll());
			shopFullBean.setHomePageConfig(null);
			shopFullBean.setHomePageId(2);
			shopFullBean.setMember(null);
			shopFullBean.setMemberCard(null);
			shopFullBean.setNotices(noticeRepository.findAll());
			shopFullBean.setReduceRules(null);
			shopFullBean.setShop(null);
			shopFullBean.setShopChargeLimit(null);
			shopFullBean.setShopStatusInfo(null);
			result.setData(shopFullBean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(value = "/status", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean status(String login_code) {
		ResultBean result = new ResultBean();
		try {
			ShopStatusInfo shopStatusInfo = new ShopStatusInfo();
			result.setData(shopStatusInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
