package com.rajeshkawali.relationship.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

/**
 * @author Rajesh_Kawali
 *
 */
@ToString
@Data
@Entity
@Table(name = "one_to_one_company", schema = "mydb")
public class OneToOneCompany {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String title;
	private String email;
	private String phone;

}