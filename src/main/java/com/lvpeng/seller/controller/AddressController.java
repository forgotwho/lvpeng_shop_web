package com.lvpeng.seller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.Address;
import com.lvpeng.seller.dal.repository.AddressRepository;

@RestController
@RequestMapping("/addresses")
public class AddressController {

	@Autowired
	private AddressRepository addressRepository;

	/**
	 * 查找买家默认地址
	 */
	@RequestMapping(value = "/default", method = RequestMethod.GET)
	public ResultBean getDefaultAddress(String customer_id) {
		ResultBean result = new ResultBean();
		List<Address> beanList = addressRepository.findAll();
		Address bean = null;
		if (beanList != null&&!beanList.isEmpty()) {
			bean = beanList.get(0);
		}
		result.setCode(0);
		result.setData(bean);
		return result;
	}

	/**
	 * 查找买家地址列表
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResultBean getAddressList(String customer_id, String from, String limit) {
		ResultBean result = new ResultBean();
		List<Address> beanList = addressRepository.findAll();
		result.setCode(0);
		result.setData(beanList);
		return result;
	}

	/**
	 * 上报FORM
	 */
	@RequestMapping(value = "/visit_shops/form_id", method = RequestMethod.GET)
	public ResultBean reportFormId(String formId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

}
