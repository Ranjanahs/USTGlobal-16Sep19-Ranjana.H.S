package com.ustglobal.springmvc.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class ProductBean {
	@Id
	@Column
	@GeneratedValue	
private int pid;
	@Column
private String pname;
	@Column
private int pprice;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="oid",nullable=false)
private OrderBean order;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="",joinColumns = @JoinColumn(name="pid"),
	    inverseJoinColumns = @JoinColumn(name="id") )
	private RetailerBean ret;
	
public OrderBean getOrder() {
	return order;
}
public void setOrder(OrderBean order) {
	this.order = order;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getPprice() {
	return pprice;
}
public void setPprice(int pprice) {
	this.pprice = pprice;
}
	
}
