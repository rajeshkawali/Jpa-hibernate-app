package com.rajeshkawali.relationship.onetomany;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Rajesh_Kawali
 *
 */

@Entity
@Table(name = "one_to_many_person", schema = "mydb")
public class OneToManyPerson {

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

	@OneToMany(targetEntity=OneToManyCompany.class, mappedBy = "person", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<OneToManyCompany> company;

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getDob() {
		return dob;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public List<OneToManyCompany> getCompany() {
		return company;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public void setCompany(List<OneToManyCompany> company) {
		this.company = company;
	}


}