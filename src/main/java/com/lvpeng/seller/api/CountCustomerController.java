package com.lvpeng.seller.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.bean.OrderCustomerCountBean;
import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.repository.MemberRepository;

@RestController
@RequestMapping("/count/customer")
public class CountCustomerController {

	@Autowired
	private MemberRepository memberRepository;


	/**
	 * 分页方法
	 */
	@RequestMapping(value = "/price", method = RequestMethod.GET)
	public ResultBean countCustomerPrice(@RequestHeader("shop_id") int shopId,
			String from, String limit,String sort) {
		ResultBean result = new ResultBean();
		List<OrderCustomerCountBean> beanList = new ArrayList<>();
		result.setCode(0);
		result.setData(beanList);
		return result;
	}

	/**
	 * 分页方法
	 */
	@RequestMapping(value = "/time", method = RequestMethod.GET)
	public ResultBean countCustomerTime(@RequestHeader("shop_id") int shopId,
			String from, String limit,String sort) {
		ResultBean result = new ResultBean();
		List<OrderCustomerCountBean> beanList = new ArrayList<>();
		result.setCode(0);
		result.setData(beanList);
		return result;
	}

	/**
	 * 分页方法
	 */
	@RequestMapping(value = "/times", method = RequestMethod.GET)
	public ResultBean countCustomerTimes(@RequestHeader("shop_id") int shopId,
			String from, String limit,String sort) {
		ResultBean result = new ResultBean();
		List<OrderCustomerCountBean> beanList = new ArrayList<>();
		result.setCode(0);
		result.setData(beanList);
		return result;
	}

}
