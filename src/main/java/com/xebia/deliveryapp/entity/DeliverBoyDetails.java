package com.xebia.deliveryapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DELBOYDETAILS")
public class DeliverBoyDetails implements Serializable {
	private static final long serialVersionUID = -1195414810373267704L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dboyid;
	@Column(name="DNAME")
	private String dboyname;
	@Column(name="DCONTACT")
	private String dboycontact;
	@Column(name="oidassigned")
	private String oidassigned;
	@Column(name="OSTATUS")
	private String ostatus;
	@Column(name="TIMESTART")
	private String timestart;
	@Column(name="TIMEEND")
	private String timeend;
	@Column(name="TIMETAKENTOCOMPLETE")
	private String timetakentocomplete;
	
	@Column(name="VEHICLENAME")
	private String vehiclename;
	@Column(name="VEHICLENUM")
	private String vehiclenum;
	
	public DeliverBoyDetails() {}
	public DeliverBoyDetails(int did, String dname, String dcontact, String oidassigned, String ostatus,
			String timestart, String timeend, String timetakentocomplete, String vehiclename, String vehiclenum) {
		this.dboyid = did;
		this.dboyname = dname;
		this.dboycontact = dcontact;
		this.oidassigned = oidassigned;
		this.ostatus = ostatus;
		this.timestart = timestart;
		this.timeend = timeend;
		this.timetakentocomplete = timetakentocomplete;
		this.vehiclename = vehiclename;
		this.vehiclenum = vehiclenum;
	}
	public int getDid() {
		return dboyid;
	}
	public String getDname() {
		return dboyname;
	}
	public String getDcontact() {
		return dboycontact;
	}
	public String getOidassigned() {
		return oidassigned;
	}
	public String getOstatus() {
		return ostatus;
	}
	public String getTimestart() {
		return timestart;
	}
	public String getTimeend() {
		return timeend;
	}
	public String getTimetakentocomplete() {
		return timetakentocomplete;
	}
	public String getVehiclename() {
		return vehiclename;
	}
	public String getVehiclenum() {
		return vehiclenum;
	}
	public void setDid(int did) {
		this.dboyid = did;
	}
	public void setDname(String dname) {
		this.dboyname = dname;
	}
	public void setDcontact(String dcontact) {
		this.dboycontact = dcontact;
	}
	public void setOidassigned(String oidassigned) {
		this.oidassigned = oidassigned;
	}
	public void setOstatus(String ostatus) {
		this.ostatus = ostatus;
	}
	public void setTimestart(String timestart) {
		this.timestart = timestart;
	}
	public void setTimeend(String timeend) {
		this.timeend = timeend;
	}
	public void setTimetakentocomplete(String timetakentocomplete) {
		this.timetakentocomplete = timetakentocomplete;
	}
	public void setVehiclename(String vehiclename) {
		this.vehiclename = vehiclename;
	}
	public void setVehiclenum(String vehiclenum) {
		this.vehiclenum = vehiclenum;
	}
}
