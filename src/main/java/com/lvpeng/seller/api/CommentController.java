package com.lvpeng.seller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.Comment;
import com.lvpeng.seller.dal.repository.CommentRepository;

@RestController
@RequestMapping("/comments")
public class CommentController {

	@Autowired
	private CommentRepository commentRepository;

	/**
	 * 分页方法
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResultBean getCommentList(@RequestHeader("shop_id") int shopId, String from, String limit, String status) {
		ResultBean result = new ResultBean();
		List<Comment> beanList = commentRepository.findAll();
		result.setCode(0);
		result.setData(beanList);
		return result;
	}

	/**
	 * 创建
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResultBean create(@RequestHeader("shop_id") int shopId, @RequestBody Comment data) {
		ResultBean result = new ResultBean();
		commentRepository.save(data);
		result.setCode(0);
		return result;
	}

	/**
	 * 评价统计
	 */
	@RequestMapping(value = "/count", method = RequestMethod.GET)
	public ResultBean count(@RequestHeader("shop_id") int shopId, String goodsId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

}
