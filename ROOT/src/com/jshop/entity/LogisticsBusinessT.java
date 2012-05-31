package com.jshop.entity;

// Generated 2012-5-31 15:44:56 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * LogisticsBusinessT generated by hbm2java
 */
public class LogisticsBusinessT implements java.io.Serializable {

	private String logisticsid;
	private String logisticsname;
	private String address;
	private String contractor;
	private String telno;
	private String faxno;
	private String email;
	private String receiver;
	private String bankaddress;
	private String bankaccount;
	private Date createtime;
	private String creatorid;
	private String des;
	private String insure;
	private String isCod;
	private String visible;
	private String state;
	private String city;
	private String website;

	public LogisticsBusinessT() {
	}

	public LogisticsBusinessT(String logisticsid, String logisticsname,
			String contractor, String receiver, Date createtime,
			String creatorid, String state) {
		this.logisticsid = logisticsid;
		this.logisticsname = logisticsname;
		this.contractor = contractor;
		this.receiver = receiver;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.state = state;
	}

	public LogisticsBusinessT(String logisticsid, String logisticsname,
			String address, String contractor, String telno, String faxno,
			String email, String receiver, String bankaddress,
			String bankaccount, Date createtime, String creatorid, String des,
			String insure, String isCod, String visible, String state,
			String city, String website) {
		this.logisticsid = logisticsid;
		this.logisticsname = logisticsname;
		this.address = address;
		this.contractor = contractor;
		this.telno = telno;
		this.faxno = faxno;
		this.email = email;
		this.receiver = receiver;
		this.bankaddress = bankaddress;
		this.bankaccount = bankaccount;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.des = des;
		this.insure = insure;
		this.isCod = isCod;
		this.visible = visible;
		this.state = state;
		this.city = city;
		this.website = website;
	}

	public String getLogisticsid() {
		return this.logisticsid;
	}

	public void setLogisticsid(String logisticsid) {
		this.logisticsid = logisticsid;
	}

	public String getLogisticsname() {
		return this.logisticsname;
	}

	public void setLogisticsname(String logisticsname) {
		this.logisticsname = logisticsname;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContractor() {
		return this.contractor;
	}

	public void setContractor(String contractor) {
		this.contractor = contractor;
	}

	public String getTelno() {
		return this.telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	public String getFaxno() {
		return this.faxno;
	}

	public void setFaxno(String faxno) {
		this.faxno = faxno;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getReceiver() {
		return this.receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getBankaddress() {
		return this.bankaddress;
	}

	public void setBankaddress(String bankaddress) {
		this.bankaddress = bankaddress;
	}

	public String getBankaccount() {
		return this.bankaccount;
	}

	public void setBankaccount(String bankaccount) {
		this.bankaccount = bankaccount;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getInsure() {
		return this.insure;
	}

	public void setInsure(String insure) {
		this.insure = insure;
	}

	public String getIsCod() {
		return this.isCod;
	}

	public void setIsCod(String isCod) {
		this.isCod = isCod;
	}

	public String getVisible() {
		return this.visible;
	}

	public void setVisible(String visible) {
		this.visible = visible;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

}
