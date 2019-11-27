package com.ustglobal.jpawithhibernateapp.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name="Voterid")
public class Voter_Card {
	@Id
	@Column
int vid;
	@Column
String vname;
	
	@Exclude
	@OneToOne(mappedBy = "vc")
   private Person person;

}
