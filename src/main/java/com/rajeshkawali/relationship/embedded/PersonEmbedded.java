package com.rajeshkawali.relationship.embedded;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import lombok.Data;
import lombok.ToString;

/**
 * @author Rajesh_Kawali
 *
 */
@Data
@ToString
@Entity
@Table(name = "person_embedded", schema = "mydb")
public class PersonEmbedded {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "name", length = 45, nullable = false)
	private String name;

	@Temporal(TemporalType.DATE)
	@Column(name = "date_of_birth")
	private Date dob;

	@Enumerated(EnumType.STRING)
	@Column(name = "gender", updatable = false) 
	private Gender gender;
	
	@Column(name = "isActive", columnDefinition = "boolean default false")
	private Boolean isActive;

	@Embedded
	private Company company;
	
	@Transient
	// @Column(name = "favoriteFruits")
	private List<String> favoriteFruits;

}