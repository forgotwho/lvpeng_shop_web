package com.lvpeng.customer.api;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.customer.bean.FavoriteGoodsBatchBean;
import com.lvpeng.customer.bean.FavoriteGoodsCheckBean;
import com.lvpeng.seller.common.ResultBean;

@RestController
@RequestMapping("/favorite_goods")
public class favorite_goods {

	@RequestMapping(value = "/check", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean check(Integer goodsId) {
		ResultBean result = new ResultBean();
		try {
			FavoriteGoodsCheckBean favoriteGoodsCheckBean = new FavoriteGoodsCheckBean();
			result.setData(favoriteGoodsCheckBean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(value = "/batch", method = RequestMethod.POST)
	@ResponseBody
	public ResultBean batch(List<FavoriteGoodsBatchBean> beanList) {
		ResultBean result = new ResultBean();
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public ResultBean list(Integer from, Integer limit) {
		ResultBean result = new ResultBean();
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
