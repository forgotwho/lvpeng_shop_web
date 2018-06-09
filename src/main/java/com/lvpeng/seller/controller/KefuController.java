package com.lvpeng.seller.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;

@RestController
@RequestMapping("/kefu")
public class KefuController {

	/**
	 * 聊天记录
	 */
	@RequestMapping(value = "/chat_history", method = RequestMethod.GET)
	public ResultBean chatHistory(String open_id) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 客服列表
	 */
	@RequestMapping(value = "/chat_list`", method = RequestMethod.GET)
	public ResultBean chatList() {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

}
