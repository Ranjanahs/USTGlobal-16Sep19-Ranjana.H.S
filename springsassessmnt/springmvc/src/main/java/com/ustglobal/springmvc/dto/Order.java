package com.ustglobal.springmvc.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="order")
public class Order {

	@Id
	@Column
	private int orderId;
	@Column
	private int quantity;
	@Column
	private double amountPayble;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id",nullable = false)
	private Retailer rt;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pid",nullable = false)
	private Product pr;
	

	
}
