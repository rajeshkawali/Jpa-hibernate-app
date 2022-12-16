package com.rajeshkawali.basic;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
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

/**
 * @author Rajesh_Kawali
 *
 */
@Data
@Entity
@Table(name = "person", schema = "mydb") // table name and DB name
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // AUTO Generation of id
	@Column(name = "id")
	private Integer id;

	@Column(name = "name", length = 45, nullable = false) //length of the field is 45 and it should not be null.
	private String name;

	@Temporal(TemporalType.DATE) // We can insert date/time/timestamp
	@Column(name = "date_of_birth")
	private Date dob;

	@Enumerated(EnumType.STRING) // To insert enum value(string). if EnumType.ORDINAL then 0 and 1.
	@Column(name = "gender", updatable = false) // Once we inserted it can't be updatable
	private Gender gender;
	
	//@Type(type="true_false") //If you want it to store as a character, ‘T’ and ‘F’. If you want 0 and 1 --> type=”boolean”
	@Column(name = "isActive", nullable = false, columnDefinition = "boolean default false") //
	private Boolean isActive;

	@Transient // We don't want to insert into DB
	private List<String> favoriteFruits;

}