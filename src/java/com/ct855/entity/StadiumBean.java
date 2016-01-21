package com.ct855.entity;

/*
-- Create table
create table STADIUM
(
  stadiumid LONG not null,
  active    INTEGER not null,
  name      VARCHAR2(20) not null,
  address   VARCHAR2(40),
  city      VARCHAR2(20),
  state     VARCHAR2(20),
  zip       VARCHAR2(20),
  country   VARCHAR2(20),
  capacity  NUMBER
)
tablespace OP_TBS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
*/
public class StadiumBean {

	@Override
	public String toString() {
		return "StadiumBean [stadiumID=" + stadiumID + ", Active=" + active
				+ ", Name=" + name + ", Address=" + address + ", City=" + city
				+ ", State=" + state + ", Zip=" + zip + ", Country=" + country
				+ ", Capacity=" + capacity + "]";
	}
	private long stadiumID
;	private boolean active;
	private String name;	  //名字
	private String address;	  //地址
	private String city;	  //城市
	private String state;	  //州
	private String zip;       //邮编
	private String country;   //国家
	private long capacity;     //容量
	
	public long getStadiumID() {
		return stadiumID;
	}
	public void setStadiumID(long stadiumID) {
		this.stadiumID = stadiumID;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getCapacity() {
		return capacity;
	}
	public void setCapacity(long capacity) {
		this.capacity = capacity;
	}
}
