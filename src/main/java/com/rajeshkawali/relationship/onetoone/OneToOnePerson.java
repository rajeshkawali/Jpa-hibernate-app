package com.rajeshkawali.relationship.onetoone;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.ToString;

/**
 * @author Rajesh_Kawali
 *
 */
@Data
@ToString
@Entity
@Table(name = "one_to_one_person", schema = "mydb")
public class OneToOnePerson {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "name", length = 45, nullable = false)
	private String name;

	@Temporal(TemporalType.DATE)
	@Column(name = "date_of_birth")
	private Date dob;
	
	@Column(name = "isActive")
	private Boolean isActive;

	@OneToOne(cascade = {CascadeType.ALL})
	private OneToOneCompany company;
	
	//@Transient
	// @Column(name = "favoriteFruits")
	//private List<String> favoriteFruits;

}