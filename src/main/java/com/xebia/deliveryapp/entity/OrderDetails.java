package com.xebia.deliveryapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMERORDER")
public class OrderDetails implements Serializable {
	private static final long serialVersionUID = 3956892787374040267L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oid;
	@Column(name="CUSTNAME")
	private String custname;
	@Column(name="CUSTCONTACT")
	private String custcontact;
	@Column(name="CUSTLOCPIN")
	private String custlocpin;
	@Column(name="CUSTORDDETAILS")
	private String custorddetails;
	@Column(name="ORDERTYPE")
	private String ordertype;
	
	@Column(name="ORDERTIME")
	private String ordertime;
	@Column(name="PRIORITY")
	private String priority;
	@Column(name="SHORTESTDIST")
	private String shortestdist;
	@Column(name="EXPTIMETOCOMPLETE")
	private int exptimetocomplete;
	
	@Column(name="UNITS")
	private int units;
	@Column(name="PRICE")
	private double price;
	@Column(name="TOTALPRICE")
	private double totalprice ;
	@Column(name="DELIVERYCHARGE")
	private double deliverycharge;
	@Column(name="PAYTYPE")
	private String paytype;
	@Column(name="PAYSTATUS")
	private String paystatus;
	@Column(name="CUSTRETURN")
	private String custreturn;
	@Column(name="REFAMOUNT")
	private double refamount;
	
	@Column(name="DELCENTNAMEADDRESS")
	private String delcentnameaddress;
	@Column(name="DELCENTEXEID")
	private String delcentexeid;
	@Column(name="DELCENTEXENAME")
	private String delcentexename;
	@Column(name="DELCENTCUSTDIST")
	private String delcentcustdist;
	@Column(name="DELSTATUS")
	private String delstatus;
	
	@Column(name="DELBOYIDASSIGNED")
	private int delboyidassigned;
	@Column(name="TASKASSIGNSTATUS")
	private String taskassignstatus;
	
	public OrderDetails() {}
	public OrderDetails(int oid, String custname, String custcontact, String custlocpin, String custorddetails,
			String ordertype, String ordertime, String priority, String shortestdist, int exptimetocomplete, int units,
			double price, double totalprice, double deliverycharge, String paytype, String paystatus, String custreturn,
			double refamount, String delcentnameaddress, String delcentexeid, String delcentexename,
			String delcentcustdist, String taskassignstatus, int delboyidassigned) {
		this.oid = oid;
		this.custname = custname;
		this.custcontact = custcontact;
		this.custlocpin = custlocpin;
		this.custorddetails = custorddetails;
		this.ordertype = ordertype;
		this.ordertime = ordertime;
		this.priority = priority;
		this.shortestdist = shortestdist;
		this.exptimetocomplete = exptimetocomplete;
		this.units = units;
		this.price = price;
		this.totalprice = totalprice;
		this.deliverycharge = deliverycharge;
		this.paytype = paytype;
		this.paystatus = paystatus;
		this.custreturn = custreturn;
		this.refamount = refamount;
		this.delcentnameaddress = delcentnameaddress;
		this.delcentexeid = delcentexeid;
		this.delcentexename = delcentexename;
		this.delcentcustdist = delcentcustdist;
		this.taskassignstatus = taskassignstatus;
		this.delboyidassigned = delboyidassigned;
	}
	public int getOid() {
		return oid;
	}
	public String getCustname() {
		return custname;
	}
	public String getCustcontact() {
		return custcontact;
	}
	public String getCustlocpin() {
		return custlocpin;
	}
	public String getCustorddetails() {
		return custorddetails;
	}
	public String getOrdertype() {
		return ordertype;
	}
	public String getOrdertime() {
		return ordertime;
	}
	public String getPriority() {
		return priority;
	}
	public String getShortestdist() {
		return shortestdist;
	}
	public int getExptimetocomplete() {
		return exptimetocomplete;
	}
	public int getUnits() {
		return units;
	}
	public double getPrice() {
		return price;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public double getDeliverycharge() {
		return deliverycharge;
	}
	public String getPaytype() {
		return paytype;
	}
	public String getPaystatus() {
		return paystatus;
	}
	public String getCustreturn() {
		return custreturn;
	}
	public double getRefamount() {
		return refamount;
	}
	public String getDelcentnameaddress() {
		return delcentnameaddress;
	}
	public String getDelcentexeid() {
		return delcentexeid;
	}
	public String getDelcentexename() {
		return delcentexename;
	}
	public String getDelcentcustdist() {
		return delcentcustdist;
	}
	public String getTaskassignstatus() {
		return taskassignstatus;
	}
	public int getDelboyidassigned() {
		return delboyidassigned;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public void setCustcontact(String custcontact) {
		this.custcontact = custcontact;
	}
	public void setCustlocpin(String custlocpin) {
		this.custlocpin = custlocpin;
	}
	public void setCustorddetails(String custorddetails) {
		this.custorddetails = custorddetails;
	}
	public void setOrdertype(String ordertype) {
		this.ordertype = ordertype;
	}
	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public void setShortestdist(String shortestdist) {
		this.shortestdist = shortestdist;
	}
	public void setExptimetocomplete(int exptimetocomplete) {
		this.exptimetocomplete = exptimetocomplete;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	public void setDeliverycharge(double deliverycharge) {
		this.deliverycharge = deliverycharge;
	}
	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}
	public void setPaystatus(String paystatus) {
		this.paystatus = paystatus;
	}
	public void setCustreturn(String custreturn) {
		this.custreturn = custreturn;
	}
	public void setRefamount(double refamount) {
		this.refamount = refamount;
	}
	public void setDelcentnameaddress(String delcentnameaddress) {
		this.delcentnameaddress = delcentnameaddress;
	}
	public void setDelcentexeid(String delcentexeid) {
		this.delcentexeid = delcentexeid;
	}
	public void setDelcentexename(String delcentexename) {
		this.delcentexename = delcentexename;
	}
	public void setDelcentcustdist(String delcentcustdist) {
		this.delcentcustdist = delcentcustdist;
	}
	public void setTaskassignstatus(String taskassignstatus) {
		this.taskassignstatus = taskassignstatus;
	}
	public void setDelboyidassigned(int delboyidassigned) {
		this.delboyidassigned = delboyidassigned;
	}
}
