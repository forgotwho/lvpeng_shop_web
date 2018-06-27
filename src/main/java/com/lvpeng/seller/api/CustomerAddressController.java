package com.lvpeng.seller.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.CustomerAddress;
import com.lvpeng.seller.dal.model.Delivery;
import com.lvpeng.seller.dal.repository.AddressRepository;
import com.lvpeng.seller.dal.repository.DeliveryRepository;

@RestController
@RequestMapping("/addresses")
public class CustomerAddressController {

	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private DeliveryRepository deliveryRepository;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public ResultBean list(Integer from, Integer limit) {
		ResultBean result = new ResultBean();
		try {
			List<CustomerAddress> addressList = addressRepository.findAll();
			result.setCode(0);
			result.setData(addressList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public ResultBean add(@RequestBody CustomerAddress address) {
		ResultBean result = new ResultBean();
		try {
			List<CustomerAddress> addressList = addressRepository.findAll();
			if (addressList == null || addressList.isEmpty()) {
				address.setIsDefault(1);
			} else {
				address.setIsDefault(0);
			}
			addressRepository.save(address);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(value = "/available", method = RequestMethod.POST)
	@ResponseBody
	public ResultBean available(CustomerAddress address) {
		ResultBean result = new ResultBean();
		try {
			List<CustomerAddress> addressList = addressRepository.findAll();
			List<Delivery> deliveryInfoDetail = deliveryRepository.findAll();
			for(CustomerAddress temp :addressList){
				temp.setDeliveryInfoDetail(deliveryInfoDetail);
			}
			result.setData(addressList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseBody
	public ResultBean edit(@PathVariable String id, @RequestBody CustomerAddress address) {
		ResultBean result = new ResultBean();
		try {
			CustomerAddress queryAddress = addressRepository.findById(id).get();
			BeanUtils.copyProperties(address, queryAddress, new String[] { "id" });
			queryAddress.setAvailable(true);
			addressRepository.save(queryAddress);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(value = "/{id}/default", method = RequestMethod.PUT)
	@ResponseBody
	public ResultBean setDefault(@PathVariable String id) {
		ResultBean result = new ResultBean();
		try {
			List<CustomerAddress> addressList = addressRepository.findAll();
			for(CustomerAddress temp: addressList){
				temp.setIsDefault(0);
				if(temp.getId().equals(id)){
					temp.setIsDefault(1);
				}
			}
			addressRepository.saveAll(addressList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public ResultBean delete(@PathVariable String id) {
		ResultBean result = new ResultBean();
		try {
			addressRepository.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean detail(@PathVariable String id) {
		ResultBean result = new ResultBean();
		try {
			CustomerAddress address = addressRepository.findById(id).get();
			result.setData(address);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
