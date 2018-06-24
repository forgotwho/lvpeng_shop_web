package com.lvpeng.customer.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.customer.bean.Layout;
import com.lvpeng.customer.bean.LayoutPageBean;
import com.lvpeng.customer.common.ResultBean;

@RestController
@RequestMapping("/layout")
public class LayoutController {

	@RequestMapping(value = "/pages/:id", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean pages(Integer id) {
		ResultBean result = new ResultBean();
		try {
			LayoutPageBean layoutPageBean = new LayoutPageBean();
			Layout layout = new Layout();
			result.setData(layoutPageBean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
