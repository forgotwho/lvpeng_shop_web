package com.lvpeng.customer.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.customer.bean.ShopFullBean;
import com.lvpeng.customer.bean.ShopStatusInfo;
import com.lvpeng.seller.common.ResultBean;

@RestController
@RequestMapping("/shops")
public class shops {

	@RequestMapping(value = "/full", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean full(String login_code) {
		ResultBean result = new ResultBean();
		try {
			ShopFullBean shopFullBean = new ShopFullBean();
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
