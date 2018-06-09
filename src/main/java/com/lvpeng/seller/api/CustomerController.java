package com.lvpeng.seller.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.bean.CountCustomerInfo;
import com.lvpeng.seller.bean.CustomerBean;
import com.lvpeng.seller.bean.OrderCustomerCountBean;
import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.Customer;
import com.lvpeng.seller.dal.repository.CustomerRepository;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;

	/**
	 * 分页方法
	 */
	@RequestMapping(value = "/visit_list", method = RequestMethod.GET)
	public ResultBean visitList(@RequestHeader("shop_id") int shopId, String from, String limit) {
		ResultBean result = new ResultBean();
		List<OrderCustomerCountBean> beanList = new ArrayList<>();
		result.setData(beanList);
		result.setCode(0);
		return result;
	}

	/**
	 * 卖家获取用户列表
	 */
	@RequestMapping(value = "/sort_list", method = RequestMethod.GET)
	public ResultBean customerSortList(@RequestHeader("shop_id") int shopId, String from, String limit,
			String order_type, String sort, String show_condition) {
		ResultBean result = new ResultBean();
		List<OrderCustomerCountBean> beanList = new ArrayList<>();
		result.setData(beanList);
		result.setCode(0);
		return result;
	}

	/**
	 * 获取客户详细信息
	 */
	@RequestMapping(value = "/{customerId}/detail_info", method = RequestMethod.GET)
	public ResultBean getCustomer(@PathVariable int customerId) {
		ResultBean result = new ResultBean();
		Customer customer = customerRepository.findById(customerId);

		CustomerBean bean = new CustomerBean();
		bean.setCustomer(customer);
		bean.setCountCustomerInfo(new CountCustomerInfo());
		result.setCode(0);
		result.setData(bean);
		return result;
	}

	/**
	 * 卖家获取用户列表
	 */
	@RequestMapping(value = "/members/list", method = RequestMethod.GET)
	public ResultBean membersList(String selectedId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 分页方法
	 */
	@RequestMapping(value = "/order_list", method = RequestMethod.GET)
	public ResultBean hisPage(int from, int limit) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 分页方法
	 */
	@RequestMapping(value = "/visit_list", method = RequestMethod.POST)
	public ResultBean visitCreate() {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

}
