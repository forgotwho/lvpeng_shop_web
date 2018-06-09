package com.lvpeng.seller.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.bean.BonusDetailBean;
import com.lvpeng.seller.bean.OrderCustomerCountBean;
import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.Customer;
import com.lvpeng.seller.dal.model.Member;
import com.lvpeng.seller.dal.model.MemberCard;
import com.lvpeng.seller.dal.repository.CustomerRepository;
import com.lvpeng.seller.dal.repository.MemberCardRepository;
import com.lvpeng.seller.dal.repository.MemberRepository;
import com.lvpeng.seller.util.RandomUtils;

@RestController
@RequestMapping("/members")
public class MemberController {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private MemberRepository memberRepository;
	
	@Autowired
	private MemberCardRepository memberCardRepository;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ResultBean getMemberlist(@RequestHeader("shop_id") int shopId, String from, String limit, String level) {
		ResultBean result = new ResultBean();
		List<Member> memberList = memberRepository.findAll();
		List<OrderCustomerCountBean> beanList = new ArrayList<>();
		for (Member member : memberList) {
			OrderCustomerCountBean bean = new OrderCustomerCountBean();
			Customer customer = customerRepository.findByPhone(member.getPhone());
			bean.setCustomer(customer);
			bean.setMember(member);
			bean.setCountValue(member.getTotalCost());
			beanList.add(bean);
		}

		result.setCode(0);
		result.setData(beanList);
		return result;
	}

	/**
	 * 卖家为用户开通会员卡
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResultBean addMember(@RequestHeader("shop_id") int shopId, @RequestBody Member data) {
		ResultBean result = new ResultBean();

		Customer customer = customerRepository.findByPhone(data.getPhone());
		if (customer == null) {
			result.setCode(-1);
			return result;
		}

		int id = (int) memberRepository.count() + 1;
		data.setMemberId(id);
		data.setShopId(shopId);
		data.setCustomerId(customer.getId());
		data.setMemberNumber(RandomUtils.memberNumber());
		data.setAcceptTime(new Date());
		data.setNickName(customer.getNickName());
		memberRepository.save(data);
		result.setCode(0);
		return result;
	}

	/**
	 * 获取买家会员数据
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResultBean getMember(String customer_id) {
		ResultBean result = new ResultBean();
		if (StringUtils.isEmpty(customer_id)) {
			List<Member> beanList = memberRepository.findAll();
			result.setData(beanList);
		} else {
			Member bean = memberRepository.findByCustomerId(Integer.parseInt(customer_id));
			result.setData(bean);
		}

		result.setCode(0);

		return result;
	}
	
	/**
	 * 获取会员信息
	 */
	@RequestMapping(value = "/number", method = RequestMethod.GET)
	public ResultBean getMemberByNumber(String number) {
		ResultBean result = new ResultBean();
		Member bean = memberRepository.findByMemberNumber(number);
		bean.setLevel(1);
		result.setCode(0);
		result.setData(bean);
		return result;
	}

	/**
	 * 获取买家会员数据
	 */
	@RequestMapping(value = "/{customerId}/detail_info", method = RequestMethod.GET)
	public ResultBean getCustomer(@PathVariable int customer_id) {
		ResultBean result = new ResultBean();
		Customer bean = customerRepository.findById(customer_id);
		result.setCode(0);
		result.setData(bean);
		return result;
	}

	

	/**
	 * 增加积分信息
	 */
	@RequestMapping(value = "/bonus_detail", method = RequestMethod.POST)
	public ResultBean memberAdd(BonusDetailBean bean) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 历史积分信息
	 */
	@RequestMapping(value = "/bonus_detail", method = RequestMethod.GET)
	public ResultBean bonusPage(String by, String sort, String customer_id) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 获取买家会员卡数据
	 */
	@RequestMapping(value = "/memberCards", method = RequestMethod.GET)
	public ResultBean cardInfo() {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 编辑自定义折扣
	 */
	@RequestMapping(value = "/custom_discount", method = RequestMethod.POST)
	public ResultBean customDiscount() {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

}
