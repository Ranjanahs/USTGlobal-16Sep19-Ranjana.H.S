package com.ustglobal.springmvc.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;

@Data
@Entity
@Table(name="product")
public class Product {
	@Id
	@Column
   private int pid;
	@Column
   private String pName;
	@Column
   private double price;
	 
	@Exclude
     @OneToMany(mappedBy = "pr")
  	private List<Order> ord;


   
}
