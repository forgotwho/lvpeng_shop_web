/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.customer.dal.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 * Auto-generated: 2018-06-23 22:17:23
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Layout {

	@Id
	private int id;
	private String name;
	private String type;
	private int shopId;
	@DBRef
	private List<Plugin> plugins;
	@DBRef
	private List<Component> components;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public void setPlugins(List<Plugin> plugins) {
		this.plugins = plugins;
	}

	public List<Plugin> getPlugins() {
		return plugins;
	}

	public void setComponents(List<Component> components) {
		this.components = components;
	}

	public List<Component> getComponents() {
		return components;
	}

}