package com.lvpeng.seller.api;

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
import com.lvpeng.seller.dal.model.Notice;
import com.lvpeng.seller.dal.repository.NoticeRepository;

@RestController
@RequestMapping("/notices")
public class NoticeController {

	@Autowired
	private NoticeRepository noticeRepository;

	/**
	 * 分页方法
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResultBean getNotcieList(@RequestHeader("shop_id") int shopId, String from, String limit, String status) {
		ResultBean result = new ResultBean();
		List<Notice> beanList = null;
		if("SHOW".equals(status)){
			beanList = noticeRepository.findByShopIdAndIsShow(shopId, 1);
		}else if("HIDE".equals(status)){
			beanList = noticeRepository.findByShopIdAndIsShow(shopId, 2);
		}else{
			beanList = noticeRepository.findByShopId(shopId);
		}
		result.setCode(0);
		result.setData(beanList);
		return result;
	}

	/**
	 * 创建公告
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResultBean createNotice(@RequestHeader("shop_id") int shopId, @RequestBody Notice data) {
		ResultBean result = new ResultBean();
		data.setShopId(shopId);
		data.setCreateTime(new Date());
		noticeRepository.save(data);
		result.setCode(0);
		return result;
	}

	/**
	 * 删除公告
	 */
	@RequestMapping(value = "/{noticeId}", method = RequestMethod.DELETE)
	public ResultBean removeNotice(@PathVariable String noticeId, @RequestHeader("shop_id") int shopId) {
		ResultBean result = new ResultBean();
		noticeRepository.deleteById(noticeId);
		result.setCode(0);
		return result;
	}

	/**
	 * 单条信息
	 */
	@RequestMapping(value = "/{noticeId}", method = RequestMethod.GET)
	public ResultBean getNotice(@PathVariable String noticeId) {
		ResultBean result = new ResultBean();
		Notice bean = noticeRepository.findById(noticeId).get();
		result.setCode(0);
		result.setData(bean);
		return result;
	}

	/**
	 * 编辑公告
	 */
	@RequestMapping(value = "/{noticeId}", method = RequestMethod.PUT)
	public ResultBean updateNotice(@PathVariable String noticeId, @RequestBody Notice data) {
		ResultBean result = new ResultBean();
		Notice bean = noticeRepository.findById(noticeId).get();
		BeanUtils.copyProperties(data, bean, new String[] { "id", "createTime", "shopId" });
		bean.setUpdateTime(new Date());
		noticeRepository.save(bean);
		result.setCode(0);
		return result;
	}

}
