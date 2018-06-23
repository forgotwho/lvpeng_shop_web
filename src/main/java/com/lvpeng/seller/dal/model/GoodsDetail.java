/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.seller.dal.model;

import org.springframework.data.annotation.Id;

/**
 * Auto-generated: 2018-06-07 13:29:37
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class GoodsDetail {

	@Id
	private int id;
	private int sequence;
	private String content;
	private int type;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public int getSequence() {
		return sequence;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}

}