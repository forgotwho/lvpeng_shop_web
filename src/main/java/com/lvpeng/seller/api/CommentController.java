package com.lvpeng.seller.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.bean.CommentCountBean;
import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.Comment;
import com.lvpeng.seller.dal.model.Goods;
import com.lvpeng.seller.dal.model.Order;
import com.lvpeng.seller.dal.repository.CommentRepository;
import com.lvpeng.seller.dal.repository.GoodsRepository;
import com.lvpeng.seller.dal.repository.OrderRepository;

@RestController
@RequestMapping("/comments")
public class CommentController {
	
	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired
	private GoodsRepository goodsRepository;

	
	@Autowired
	private OrderRepository orderRepository;
	
	@RequestMapping(value = "/count", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean count(Integer goods_id) {
		ResultBean result = new ResultBean();
		try {
			CommentCountBean commentCountBean = new CommentCountBean();
			Map<String,Integer> map = new HashMap<String,Integer>();
			map.put("BAD", commentCountBean.getBAD());
			map.put("ALL", commentCountBean.getALL());
			map.put("NORMAL", commentCountBean.getNORMAL());
			map.put("GOOD", commentCountBean.getGOOD());
			result.setData(map);
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
			commentList = commentRepository.findAll();
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
			commentList = commentRepository.findAll();
			result.setData(commentList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * 创建
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResultBean create(@RequestBody List<Comment> dataList) {
		ResultBean result = new ResultBean();
		for(Comment data: dataList){
			int id = (int)commentRepository.count()+1;
			data.setId(id);
			data.setShopId(1);
			data.setStatus("0");
			data.setCreateTime(new Date());
			Goods goods = goodsRepository.findById(data.getGoodsId());
			Order order = orderRepository.findByOrderId(data.getOrderId());
			order.setStatus(6);
			orderRepository.save(order);
			data.setGoods(goods);
			commentRepository.save(data);
		}
		result.setCode(0);
		return result;
	}

}
