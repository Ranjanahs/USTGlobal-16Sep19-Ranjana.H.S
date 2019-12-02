package com.ustglobal.springmvc.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;

@Data
@Entity
@Table(name="retailer")
public class Retailer {
     @Id
     @Column
     @GeneratedValue
	private int id;
     @Column
	private String name;
     @Column
	private String email;
     @Column
     private String password;
	
     
     
     
     @Exclude
     @OneToMany(mappedBy = "rt")
  	private List<Order> order;
}
