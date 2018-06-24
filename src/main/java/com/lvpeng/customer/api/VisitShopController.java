package com.lvpeng.customer.api;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.customer.common.ResultBean;

@RestController
@RequestMapping("/visit_shops")
public class VisitShopController {

	@RequestMapping(value = "/form_id", method = RequestMethod.POST)
	@ResponseBody
	public ResultBean form_id(List<String> formIds) {
		ResultBean result = new ResultBean();
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
