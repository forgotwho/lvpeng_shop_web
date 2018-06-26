package com.lvpeng.customer.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.customer.common.ResultBean;
import com.lvpeng.customer.dal.model.Address;
import com.lvpeng.customer.dal.repository.AddressRepository;

@RestController
@RequestMapping("/addresses")
public class AddressController {

	@Autowired
	private AddressRepository addressRepository;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public ResultBean list(Integer from, Integer limit) {
		ResultBean result = new ResultBean();
		try {
			List<Address> addressList = addressRepository.findAll();
			result.setCode(0);
			result.setData(addressList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public ResultBean add(@RequestBody Address address) {
		ResultBean result = new ResultBean();
		try {
			List<Address> addressList = addressRepository.findAll();
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
	public ResultBean available(Address address) {
		ResultBean result = new ResultBean();
		try {
			List<Address> addressList = addressRepository.findAll();
			result.setData(addressList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseBody
	public ResultBean edit(@PathVariable String id, @RequestBody Address address) {
		ResultBean result = new ResultBean();
		try {
			Address queryAddress = addressRepository.findById(id).get();
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
			List<Address> addressList = addressRepository.findAll();
			for(Address temp: addressList){
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
			Address address = addressRepository.findById(id).get();
			result.setData(address);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
