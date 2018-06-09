package com.lvpeng.seller.api;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.MemberCard;
import com.lvpeng.seller.dal.repository.MemberCardRepository;

@RestController
@RequestMapping("/memberCards")
public class MemberCardController {

	@Autowired
	private MemberCardRepository memberCardRepository;

	/**
	 * 会员卡信息
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResultBean getShopMemberCard(@RequestHeader("shop_id") int shopId) {
		ResultBean result = new ResultBean();
		MemberCard memberCard = memberCardRepository.findByShopId(shopId);
		result.setData(memberCard);
		result.setCode(0);
		return result;
	}

	/**
	 * 添加会员卡
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResultBean createMemberCard(@RequestHeader("shop_id") int shopId, @RequestBody MemberCard data) {
		ResultBean result = new ResultBean();
		int id = (int) memberCardRepository.count() + 1;
		data.setId(id);
		data.setShopId(shopId);
		data.setCreateTime(new Date());
		memberCardRepository.save(data);
		result.setCode(0);
		return result;
	}

	/**
	 * 编辑会员卡
	 */
	@RequestMapping(method = RequestMethod.PUT)
	public ResultBean updateMemberCard(@RequestHeader("shop_id") int shopId, @RequestBody MemberCard data) {
		ResultBean result = new ResultBean();
		MemberCard bean = memberCardRepository.findByShopId(shopId);
		BeanUtils.copyProperties(data, bean, new String[] { "id", "createTime", "shopId" });
		bean.setUpdateTime(new Date());
		memberCardRepository.save(bean);
		result.setCode(0);
		return result;
	}

}
