package com.jshop.entity;

// Generated 2012-9-8 14:04:52 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * VirtualShippingAddressT generated by hbm2java
 */
public class VirtualShippingAddressT implements java.io.Serializable {

	private String virtualshippingaddressid;
	private String userid;
	private String username;
	private String mobile;
	private String email;
	private Date createtime;
	private String state;
	private String issend;
	private String orderid;

	public VirtualShippingAddressT() {
	}

	public VirtualShippingAddressT(String virtualshippingaddressid,
			String userid, String username, String mobile, String email,
			Date createtime, String state, String issend, String orderid) {
		this.virtualshippingaddressid = virtualshippingaddressid;
		this.userid = userid;
		this.username = username;
		this.mobile = mobile;
		this.email = email;
		this.createtime = createtime;
		this.state = state;
		this.issend = issend;
		this.orderid = orderid;
	}

	public String getVirtualshippingaddressid() {
		return this.virtualshippingaddressid;
	}

	public void setVirtualshippingaddressid(String virtualshippingaddressid) {
		this.virtualshippingaddressid = virtualshippingaddressid;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIssend() {
		return this.issend;
	}

	public void setIssend(String issend) {
		this.issend = issend;
	}

	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

}
