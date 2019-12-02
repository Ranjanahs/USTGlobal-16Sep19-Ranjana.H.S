package com.ustglobal.springmvc.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import net.bytebuddy.build.ToStringPlugin.Exclude;

@Entity
@Table(name="order")
public class OrderBean {
	@Id
	@Column
	@GeneratedValue	
private int oid;
	@Column
private int oquantity;
	@Column
	
private int amountPay;
	@Exclude
	@OneToMany(mappedBy="order")
	private List<ProductBean> product;

public int getOid() {
	return oid;
}
public void setOid(int oid) {
	this.oid = oid;
}
public int getOquantity() {
	return oquantity;
}
public void setOquantity(int oquantity) {
	this.oquantity = oquantity;
}
public int getAmountPay() {
	return amountPay;
}
public void setAmountPay(int amountPay) {
	this.amountPay = amountPay;
}

}
