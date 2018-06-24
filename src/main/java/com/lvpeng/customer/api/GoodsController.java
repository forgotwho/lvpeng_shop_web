package com.lvpeng.customer.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.customer.common.ResultBean;
import com.lvpeng.customer.dal.model.Goods;

@RestController
@RequestMapping("/goods")
public class GoodsController {

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean list(Integer from, Integer limit, Integer category_id,String by,String sort,String content) {
		ResultBean result = new ResultBean();
		try {
			List<Goods> goodsList = new ArrayList<Goods>();
			result.setData(goodsList);
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
			Goods goods = new Goods();
			result.setData(goods);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
