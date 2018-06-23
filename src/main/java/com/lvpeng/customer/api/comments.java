package com.lvpeng.customer.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.customer.bean.CommentBean;
import com.lvpeng.customer.bean.CommentCountBean;
import com.lvpeng.seller.common.ResultBean;

@RestController
@RequestMapping("/comments")
public class comments {

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean count(Integer goods_id) {
		ResultBean result = new ResultBean();
		try {
			CommentCountBean commentCountBean = new CommentCountBean();
			result.setData(commentCountBean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public ResultBean list(Integer from, Integer limit, String status, Integer goods_id) {
		ResultBean result = new ResultBean();
		try {
			List<CommentBean> commentBeanList = new ArrayList<CommentBean>();
			result.setData(commentBeanList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
