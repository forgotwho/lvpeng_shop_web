package com.lvpeng.seller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.bean.FavoriteGoodsCheckBean;
import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.FavoriteGoods;
import com.lvpeng.seller.dal.model.Goods;
import com.lvpeng.seller.dal.repository.FavoriteGoodsRepository;
import com.lvpeng.seller.dal.repository.GoodsRepository;

@RestController
@RequestMapping("/favorite_goods")
public class FavoriteGoodsController {
	
	@Autowired
	private FavoriteGoodsRepository favoriteGoodsRepository;
	
	@Autowired
	private GoodsRepository goodsRepository;

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
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public ResultBean add(@RequestBody FavoriteGoods favoriteGoods) {
		ResultBean result = new ResultBean();
		try {
			Goods goods = goodsRepository.findById(favoriteGoods.getGoodsId());
			favoriteGoods.setCheck(true);
			favoriteGoods.setGoodsName(goods.getName());
			favoriteGoods.setGoodsImage(goods.getImages().get(0).getUrl());
			favoriteGoods.setGoodsNum(goods.getTotalStock());
			favoriteGoods.setGoodsPrice(goods.getSellPrice());
			favoriteGoods.setInnerCid(goods.getInnerCid());
			favoriteGoods.setOriginalPrice(goods.getOriginalPrice());
			favoriteGoodsRepository.save(favoriteGoods);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	@ResponseBody
	public ResultBean delete(@RequestBody FavoriteGoods favoriteGoods) {
		ResultBean result = new ResultBean();
		try {
			Goods goods = goodsRepository.findById(favoriteGoods.getGoodsId());
			favoriteGoodsRepository.deleteAll();
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
			List<FavoriteGoods> favoriteGoodsList =  favoriteGoodsRepository.findAll();
			result.setData(favoriteGoodsList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
