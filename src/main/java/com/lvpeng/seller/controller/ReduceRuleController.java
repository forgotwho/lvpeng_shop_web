package com.lvpeng.seller.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.ReduceRule;
import com.lvpeng.seller.dal.repository.ReduceRuleRepository;

@RestController
@RequestMapping("/reduce_rule")
public class ReduceRuleController {

	@Autowired
	private ReduceRuleRepository reduceRuleRepository;

	/**
	 * 配送员列表
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResultBean listReduce(@RequestHeader("shop_id") int shopId, String from, String limit) {
		ResultBean result = new ResultBean();
		List<ReduceRule> beanList = reduceRuleRepository.findByShopId(shopId);
		result.setCode(0);
		result.setData(beanList);
		return result;
	}

	/**
	 * 创建
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResultBean create(@RequestHeader("shop_id") int shopId, @RequestBody ReduceRule data) {
		ResultBean result = new ResultBean();
		data.setShopId(shopId);
		data.setCreateTime(new Date());
		reduceRuleRepository.save(data);
		result.setCode(0);
		return result;
	}

	/**
	 * 删除
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResultBean remove(@PathVariable String id) {
		ResultBean result = new ResultBean();
		reduceRuleRepository.deleteById(id);
		result.setCode(0);
		return result;
	}

	/**
	 * 编辑公告
	 */
	@RequestMapping(method = RequestMethod.PUT)
	public ResultBean update(@RequestBody ReduceRule data) {
		ResultBean result = new ResultBean();
		data.setUpdateTime(new Date());
		reduceRuleRepository.save(data);
		result.setCode(0);
		return result;
	}

}
