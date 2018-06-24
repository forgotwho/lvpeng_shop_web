package com.lvpeng.customer.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.customer.bean.CommentCountBean;
import com.lvpeng.customer.common.ResultBean;
import com.lvpeng.customer.dal.model.Comment;

@RestController
@RequestMapping("/comments")
public class CommentController {

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
	public ResultBean goodsList(Integer from, Integer limit, String status, Integer goods_id) {
		ResultBean result = new ResultBean();
		try {
			List<Comment> commentList = new ArrayList<Comment>();
			result.setData(commentList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean myList(Integer from, Integer limit, String status) {
		ResultBean result = new ResultBean();
		try {
			List<Comment> commentList = new ArrayList<Comment>();
			result.setData(commentList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
