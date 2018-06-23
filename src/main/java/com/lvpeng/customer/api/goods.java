package com.lvpeng.customer.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.customer.bean.GoodsBean;
import com.lvpeng.seller.common.ResultBean;

@RestController
@RequestMapping("/shops")
public class goods {

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean list(Integer from, Integer limit, Integer category_id) {
		ResultBean result = new ResultBean();
		try {
			GoodsBean goodsBean = new GoodsBean();
			result.setData(goodsBean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
