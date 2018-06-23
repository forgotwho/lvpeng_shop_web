package com.lvpeng.seller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.bean.OrderNoteBean;
import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.repository.FileRepository;
import com.lvpeng.seller.dal.repository.SellerRepository;
import com.lvpeng.seller.dal.repository.ShopCategoryRepository;

@RestController
public class CommonController {

	@Autowired
	private FileRepository fileRepository;

	@Autowired
	private SellerRepository sellerRepository;

	@Autowired
	private ShopCategoryRepository shopCategoryRepository;

	@RequestMapping("/orders/{orderId}/note")
	public ResultBean orderNote(int orderId, String sellerNote) {
		ResultBean result = new ResultBean();
		OrderNoteBean bean = new OrderNoteBean();

		result.setCode(0);
		result.setData(bean);

		return result;
	}

}
