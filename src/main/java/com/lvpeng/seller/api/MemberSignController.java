package com.lvpeng.seller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;

@RestController
@RequestMapping("/member_sign")
public class MemberSignController {

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public ResultBean sign(String member_id) {
		ResultBean result = new ResultBean();
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
