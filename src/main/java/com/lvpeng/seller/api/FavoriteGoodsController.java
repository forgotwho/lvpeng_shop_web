package com.lvpeng.seller.api;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.bean.FavoriteGoodsCheckBean;
import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.FavoriteGoods;

@RestController
@RequestMapping("/favorite_goods")
public class FavoriteGoodsController {

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
	public ResultBean batch(List<FavoriteGoods> beanList) {
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
