package com.lvpeng.seller.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.AppConfig;
import com.lvpeng.seller.dal.model.Component;
import com.lvpeng.seller.dal.model.Goods;
import com.lvpeng.seller.dal.model.GoodsInnerCategory;
import com.lvpeng.seller.dal.model.GoodsStock;
import com.lvpeng.seller.dal.model.Image;
import com.lvpeng.seller.dal.model.Layout;
import com.lvpeng.seller.dal.model.Notice;
import com.lvpeng.seller.dal.model.Plugin;
import com.lvpeng.seller.dal.model.Shop;
import com.lvpeng.seller.dal.model.ShopChargeLimit;
import com.lvpeng.seller.dal.model.ShopStatusInfo;
import com.lvpeng.seller.dal.repository.AppConfigRepository;
import com.lvpeng.seller.dal.repository.ComponentRepository;
import com.lvpeng.seller.dal.repository.GoodsInnerCategoryRepository;
import com.lvpeng.seller.dal.repository.GoodsRepository;
import com.lvpeng.seller.dal.repository.GoodsStockRepository;
import com.lvpeng.seller.dal.repository.LayoutRepository;
import com.lvpeng.seller.dal.repository.MemberCardRepository;
import com.lvpeng.seller.dal.repository.MemberRepository;
import com.lvpeng.seller.dal.repository.NoticeRepository;
import com.lvpeng.seller.dal.repository.PluginRepository;
import com.lvpeng.seller.dal.repository.ShopChargeLimitRepository;
import com.lvpeng.seller.dal.repository.ShopRepository;
import com.lvpeng.seller.dal.repository.ShopStatusInfoRepository;
import com.lvpeng.seller.dal.repository.UserRepository;
import com.lvpeng.seller.dal.repository.UserTokenRepository;
import com.lvpeng.seller.util.RandomUtils;

@RestController
@RequestMapping("/init")
public class InitController {

	@Autowired
	private AppConfigRepository appConfigRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserTokenRepository userTokenRepository;

	@Autowired
	private ShopRepository shopRepository;

	@Autowired
	private GoodsInnerCategoryRepository goodsInnerCategoryRepository;

	@Autowired
	private ShopChargeLimitRepository shopChargeLimitRepository;

	@Autowired
	private ShopStatusInfoRepository shopStatusInfoRepository;

	@Autowired
	private MemberCardRepository memberCardRepository;

	@Autowired
	private MemberRepository memberRepository;

	@Autowired
	private LayoutRepository layoutRepository;

	@Autowired
	private PluginRepository pluginRepository;

	@Autowired
	private ComponentRepository componentRepository;

	@Autowired
	private GoodsRepository goodsRepository;

	@Autowired
	private GoodsStockRepository goodsStockRepository;

	@Autowired
	private NoticeRepository noticeRepository;

	/**
	 * 初始化数据
	 */
	@RequestMapping()
	public ResultBean init() {
		ResultBean result = new ResultBean();
		initApp();
		initShop();
		initShopStatusInfo();
		initShopChargeLimit();
		initGoodsInnerCategory();
		initMember();
		initMemberCard();
		initLayout();
		initGoods();
		initNotice();
		result.setCode(0);
		return result;
	}

	public void initApp() {
		appConfigRepository.deleteAll();

		AppConfig appConfig = new AppConfig();
		appConfig.setAppCode("owVHb1gHrvktni80kjMlFMzSDJDWY0xR");
		appConfig.setShopId(1);
		appConfig.setShopType("1");
		appConfig.setWxappId("wxff51f4b76fd7dc3c");
		appConfig.setWxappSecret("3204bc29422f5d77c86856d1eda0cf09");
		appConfig.setCreateTime(new Date());
		appConfig.setUpdateTime(new Date());
		appConfigRepository.save(appConfig);
	}

	public void initShop() {
		shopRepository.deleteAll();

		Shop shop = new Shop();
		shop.setId(1);
		shop.setName("十堰饭来张口");
		shop.setCategoryId(1);
		shop.setCategoryName("餐饮");
		shop.setDescribe("留住你的胃");
		shop.setAddress("十堰人民路");
		shop.setPhone("13816638520");
		shop.setExpiredTime("2018-12-31 23:59:59");
		shop.setCreateTime(new Date());
		shop.setUpdateTime(new Date());
		shop.setLatitude("31.23037");
		shop.setLongitude("121.4737");
		shop.setAvatar("http://ostb6zm4z.bkt.clouddn.com/SMGZJ.png");
		shop.setAutoOrder(0);
		shop.setLeArea(0l);
		shop.setOffPay(0);
		shop.setDetailAddress("十堰人民路56号");
		shop.setInShop(0);
		shop.setSupportMember(0);
		shop.setIsDelete(0);
		List<String> images = new ArrayList<>();
		images.add("http://ostb6zm4z.bkt.clouddn.com/SMGZJ.png");
		images.add("http://ostb6zm4z.bkt.clouddn.com/SMGZJ.png");
		images.add("http://ostb6zm4z.bkt.clouddn.com/SMGZJ.png");
		shop.setImages(images);
		shop = shopRepository.save(shop);
	}

	public void initShopStatusInfo() {
		shopStatusInfoRepository.deleteAll();

		ShopStatusInfo shopStatusInfo = new ShopStatusInfo();
		shopStatusInfo.setShopId(1);
		shopStatusInfo.setBeginTime("00:00");
		shopStatusInfo.setEndTime("23:59");
		shopStatusInfo.setOpen(true);
		shopStatusInfo.setStatus("NORMAL");
		shopStatusInfo.setCreateTime(new Date());
		shopStatusInfo.setUpdateTime(new Date());
		shopStatusInfo = shopStatusInfoRepository.save(shopStatusInfo);
	}

	public void initShopChargeLimit() {
		shopChargeLimitRepository.deleteAll();

		ShopChargeLimit shopChargeLimit = new ShopChargeLimit();
		shopChargeLimit.setShopId(1);
		shopChargeLimit.setChargeVersion("1");
		shopChargeLimit.setCouponLimit(-1);
		shopChargeLimit.setMemberLimit(-1);
		shopChargeLimit.setMpLimit(-1);
		shopChargeLimit.setOrderLimit(-1);
		shopChargeLimit.setSmsLimit(-1);
		shopChargeLimit.setCreateTime(new Date());
		shopChargeLimit.setUpdateTime(new Date());
		shopChargeLimit = shopChargeLimitRepository.save(shopChargeLimit);
	}

	public void initGoodsInnerCategory() {
		goodsInnerCategoryRepository.deleteAll();

		GoodsInnerCategory goodsInnerCategory = new GoodsInnerCategory();
		goodsInnerCategory.setId(1);
		goodsInnerCategory.setShopId(1);
		goodsInnerCategory.setPid(0);
		goodsInnerCategory.setIsDelete(0);
		goodsInnerCategory.setIsShow(1);
		goodsInnerCategory.setName("卷纸");
		goodsInnerCategory.setSeq(1);
		goodsInnerCategory.setType("CUSTOM");
		goodsInnerCategory.setCreateTime(new Date());
		goodsInnerCategory.setUpdateTime(new Date());
		goodsInnerCategory = goodsInnerCategoryRepository.save(goodsInnerCategory);

		goodsInnerCategory = new GoodsInnerCategory();
		goodsInnerCategory.setId(2);
		goodsInnerCategory.setShopId(1);
		goodsInnerCategory.setPid(0);
		goodsInnerCategory.setIsDelete(0);
		goodsInnerCategory.setIsShow(1);
		goodsInnerCategory.setName("抽纸");
		goodsInnerCategory.setSeq(2);
		goodsInnerCategory.setType("CUSTOM");
		goodsInnerCategory.setCreateTime(new Date());
		goodsInnerCategory.setUpdateTime(new Date());
		goodsInnerCategory = goodsInnerCategoryRepository.save(goodsInnerCategory);

		goodsInnerCategory = new GoodsInnerCategory();
		goodsInnerCategory.setId(3);
		goodsInnerCategory.setShopId(1);
		goodsInnerCategory.setPid(0);
		goodsInnerCategory.setIsDelete(0);
		goodsInnerCategory.setIsShow(1);
		goodsInnerCategory.setName("生巾");
		goodsInnerCategory.setSeq(3);
		goodsInnerCategory.setType("CUSTOM");
		goodsInnerCategory.setCreateTime(new Date());
		goodsInnerCategory.setUpdateTime(new Date());
		goodsInnerCategory = goodsInnerCategoryRepository.save(goodsInnerCategory);
	}

	public void initMember() {
		memberRepository.deleteAll();

		// Member member = new Member();
		// member.setMemberId(1);
		// member.setShopId(1);
		// member.setAcceptTime(new Date());
		// member.setAddress(null);
		// member.setAppOpenid(appOpenid);
		// member.setBalance(balance);
		// member.setBirthday(birthday);
		// member.setBonus(bonus);
		// member.setCardId(cardId);
		// member.setCodeUrl(codeUrl);
		// member.setCustomDiscount(customDiscount);
		// member.setCustomerId(customerId);
		// member.setLevel(level);
		// member.setMemberId(memberId);
		// member.setMemberNumber(memberNumber);
		// member.setMemberPresentDetails(memberPresentDetails);
		// member.setMpOpenid(mpOpenid);
		// member.setName(name);
		// member.setNote(note);
		// member.setOfflineCard(offlineCard);
		// member.setPhone(phone);
		// member.setRemarkName(remarkName);
		// member.setSex(sex);
		// member.setTotalCost(totalCost);
		// member.setUpdateTime(new Date());
		// member = memberRepository.save(member);
	}

	public void initMemberCard() {
		memberCardRepository.deleteAll();
	}

	public void initLayout() {
		layoutRepository.deleteAll();
		pluginRepository.deleteAll();
		componentRepository.deleteAll();
		Layout layout = new Layout();
		layout.setId(2);
		layout.setName("首页（日用品）");
		layout.setType("HOME");
		layout.setShopId(1);

		List<Plugin> plugins = new ArrayList<>();
		Plugin plugin = new Plugin();
		plugin.setId(1);
		plugin.setPageId(2);
		plugin.setShopId(1);
		plugin.setType("SKU_SLIDE_PANEL");
		plugin.setIsUse(true);
		plugin.setCreateTime(new Date(0));
		plugin.setUpdateTime(new Date());
		plugins.add(plugin);

		plugin = new Plugin();
		plugin.setId(2);
		plugin.setPageId(2);
		plugin.setShopId(1);
		plugin.setType("CART_WIDGET");
		plugin.setIsUse(true);
		plugin.setCreateTime(new Date(0));
		plugin.setUpdateTime(new Date());
		plugins.add(plugin);

		plugins = pluginRepository.saveAll(plugins);

		List<Component> components = new ArrayList<>();
		Component component = new Component();
		component.setId(1);
		component.setPageId(2);
		component.setShopId(1);
		component.setType("SEARCH_BAR");
		component.setIsUse(true);
		component.setSeq(1);
		component.setTitle("搜索栏");
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("isContact", true);
		param.put("border", "none");
		component.setParam(JSON.toJSONString(param));
		Map<String, Object> data = new HashMap<String, Object>();
		component.setData(JSON.toJSONString(data));
		component.setCreateTime(new Date());
		component.setUpdateTime(new Date());
		components.add(component);

		components = componentRepository.saveAll(components);

		layout.setPlugins(plugins);
		layout.setComponents(components);
		layout = layoutRepository.save(layout);

		layout = new Layout();
		layout.setId(1);
		layout.setName("个人（日用品）");
		layout.setType("CUSTOM");
		layout.setShopId(1);

		components = new ArrayList<>();
		component = new Component();
		component.setId(2);
		component.setPageId(1);
		component.setShopId(1);
		component.setType("VIP_CARD");
		component.setIsUse(true);
		component.setSeq(1);
		component.setTitle("会员卡");
		param = new HashMap<String, Object>();
		component.setParam(JSON.toJSONString(param));
		data = new HashMap<String, Object>();
		component.setData(JSON.toJSONString(data));
		component.setCreateTime(new Date());
		component.setUpdateTime(new Date());
		components.add(component);

		components = componentRepository.saveAll(components);

		layout.setComponents(components);

		layout = layoutRepository.save(layout);
	}

	public void initGoods() {
		goodsRepository.deleteAll();

		Goods goods = new Goods();
		goods.setId(1);
		goods.setShopId(1);
		goods.setBooking(null);
		goods.setDeliveryTemplateFee(null);
		goods.setDeliveryTemplateId(0);
		goods.setDeliveryTemplateName(null);
		goods.setFavoriteCount(0);
		goods.setGlobalCid(1);
		goods.setGoodsDetails(null);
		goods.setGoodsSkuInfo(null);
		List<GoodsStock> goodsStocks = new ArrayList<>();
		GoodsStock goodsStock = new GoodsStock();
		goodsStock.setGoodsId(1);
		goodsStock.setSku(null);
		goodsStock.setStock(100);
		goodsStocks.add(goodsStock);
		goodsStocks = goodsStockRepository.saveAll(goodsStocks);
		goods.setGoodsStocks(goodsStocks);
		List<Image> images = new ArrayList<>();
		Image image = new Image();
		image.setId(1);
		image.setUrl("http://img.leshare.shop/FhhjJ66nbzHgfkNEJJBUKIAZe2hC");
		image.setCreateTime(new Date());
		images.add(image);
		goods.setImages(images);
		goods.setInnerCategoryName("卷纸");
		goods.setInnerCid(1);
		goods.setIsDeleted(0);
		goods.setIsRecommend(1);
		goods.setName("波斯猫金装系列无芯卷筒纸3层180节*10卷");
		goods.setOriginalPrice(19.9);
		goods.setPostFee(0);
		goods.setPostType(0);
		goods.setSalesVolume(148);
		goods.setSellPrice(19.9);
		goods.setStatus(0);
		goods.setSubhead(null);
		List<String> tags = new ArrayList<>();
		goods.setTags(tags);
		goods.setTotalStock(100);
		goods.setType("goods");
		goods.setUuid(RandomUtils.uuid());
		goods.setCreateTime(new Date());
		goods.setUpdateTime(new Date());
		goods = goodsRepository.save(goods);
	}

	public void initNotice() {
		noticeRepository.deleteAll();

		Notice notice = new Notice();
		notice.setId(1);
		notice.setIsHome(1);
		notice.setIsShow(1);
		notice.setShopId(1);
		notice.setContent("新店开业了");
		notice.setCreateTime(new Date());
		notice.setUpdateTime(new Date());

		noticeRepository.save(notice);
	}
}
