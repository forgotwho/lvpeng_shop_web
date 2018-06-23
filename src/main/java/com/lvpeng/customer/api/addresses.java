package com.lvpeng.customer.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.customer.bean.AddressBean;
import com.lvpeng.customer.common.ResultBean;

@RestController
@RequestMapping("/addresses")
public class addresses {

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public ResultBean list(Integer from, Integer limit) {
		ResultBean result = new ResultBean();
		try {
			List<AddressBean> addressBeanList = new ArrayList<AddressBean>();
			result.setData(addressBeanList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public ResultBean add(AddressBean addressBean) {
		ResultBean result = new ResultBean();
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseBody
	public ResultBean edit(Integer id, AddressBean addressBean) {
		ResultBean result = new ResultBean();
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public ResultBean delete(Integer id) {
		ResultBean result = new ResultBean();
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean detail(Integer id) {
		ResultBean result = new ResultBean();
		try {
			AddressBean addressBean = new AddressBean();
			result.setData(addressBean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
