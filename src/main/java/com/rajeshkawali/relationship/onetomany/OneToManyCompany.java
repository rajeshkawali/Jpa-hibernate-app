package com.rajeshkawali.relationship.onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Rajesh_Kawali
 *
 */

@Entity
@Table(name = "one_to_many_company", schema = "mydb")
public class OneToManyCompany {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String title;
	private String email;
	private String phone;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private OneToManyPerson person;

	public Integer getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public OneToManyPerson getPerson() {
		return person;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setPerson(OneToManyPerson person) {
		this.person = person;
	}

}