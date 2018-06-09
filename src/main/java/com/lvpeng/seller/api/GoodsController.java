package com.lvpeng.seller.api;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.Goods;
import com.lvpeng.seller.dal.model.GoodsStock;
import com.lvpeng.seller.dal.repository.GoodsRepository;

@RestController
@RequestMapping("/goods")
public class GoodsController {

	@Autowired
	private GoodsRepository goodsRepository;


	/**
	 * 分页方法
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ResultBean getGoodsList(@RequestHeader("shop_id") int shopId, String from, String limit, String goods_status,
			Integer category_id) {
		ResultBean result = new ResultBean();
		List<Goods> beanList = goodsRepository.findByShopId(shopId);
		result.setCode(0);
		result.setData(beanList);
		return result;
	}
	
	/**
	 * 商品详情
	 */
	@RequestMapping(value = "/{goodsId}", method = RequestMethod.GET)
	public ResultBean getGoods(@PathVariable int goodsId) {
		ResultBean result = new ResultBean();
		Goods bean = goodsRepository.findById(goodsId);
		result.setCode(0);
		result.setData(bean);
		return result;
	}

	/**
	 * 新增商品
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResultBean createGoods(@RequestHeader("shop_id") int shopId, @RequestBody Goods data) {
		ResultBean result = new ResultBean();
		int id = (int) goodsRepository.count() + 1;
		data.setId(id);
		data.setUuid(UUID.randomUUID().toString());
		data.setShopId(shopId);
		int totalStock = 0;
		if(data.getGoodsStocks()!=null){
			for(GoodsStock goodsStock: data.getGoodsStocks()){
				totalStock += goodsStock.getStock();
			}
		}
		data.setTotalStock(totalStock);
		data.setCreateTime(new Date());
		goodsRepository.save(data);
		result.setCode(0);
		return result;
	}

	/**
	 * 更新商品
	 */
	@RequestMapping(value = "/{goodsId}", method = RequestMethod.PUT)
	public ResultBean updateGoods(@PathVariable int goodsId, @RequestBody Goods data) {
		ResultBean result = new ResultBean();
		Goods bean = goodsRepository.findById(goodsId);
		BeanUtils.copyProperties(data, bean, new String[] { "id", "createTime", "shopId","totalStock" });
		int totalStock = 0;
		if(data.getGoodsStocks()!=null){
			for(GoodsStock goodsStock: data.getGoodsStocks()){
				totalStock += goodsStock.getStock();
			}
		}
		bean.setTotalStock(totalStock);
		bean.setUpdateTime(new Date());
		goodsRepository.save(bean);
		result.setCode(0);
		return result;
	}

	/**
	 * 删除商品
	 */
	@RequestMapping(value = "/{goodsId}", method = RequestMethod.DELETE)
	public ResultBean remove(@PathVariable int goodsId) {
		ResultBean result = new ResultBean();
		goodsRepository.delete(goodsRepository.findById(goodsId));
		result.setCode(0);
		return result;
	}

	/**
	 * 商品上架
	 */
	@RequestMapping(value = "/{goodsId}/on_sale", method = RequestMethod.PUT)
	public ResultBean onSale(@PathVariable int goodsId) {
		ResultBean result = new ResultBean();
		Goods bean = goodsRepository.findById(goodsId);
		bean.setStatus(1);
		bean.setUpdateTime(new Date());
		goodsRepository.save(bean);
		result.setCode(0);
		return result;
	}

	/**
	 * 商品下架
	 */
	@RequestMapping(value = "/{goodsId}/off_sale", method = RequestMethod.PUT)
	public ResultBean offSale(@PathVariable String goodsId) {
		ResultBean result = new ResultBean();
		Goods bean = goodsRepository.findById(goodsId).get();
		bean.setStatus(0);
		bean.setUpdateTime(new Date());
		goodsRepository.save(bean);
		result.setCode(0);
		return result;
	}

	/**
	 * 获取商品库存
	 */
	@RequestMapping(value = "/{goodsId}/stock", method = RequestMethod.GET)
	public ResultBean stock(@PathVariable String goodsId, String sku) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}
	
	/**
	 * 客户常购商品
	 */
	@RequestMapping(value = "/customers/{customerId}/order_goods_list", method = RequestMethod.GET)
	public ResultBean oftenGoodsPage(@PathVariable String customerId, int from, int limit) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 分页方法
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResultBean page(@RequestHeader("shop_id") int shopId, String from, String limit, String goods_status,
			String category_id) {
		ResultBean result = new ResultBean();
		List<Goods> beanList = goodsRepository.findByShopId(shopId);
		result.setCode(0);
		result.setData(beanList);
		return result;
	}

}
