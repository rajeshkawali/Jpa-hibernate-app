package com.rajeshkawali.relationship.embedded;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import lombok.Data;
import lombok.ToString;

/**
 * @author Rajesh_Kawali
 *
 */
@ToString
@Data
@Embeddable
public class Company {

	private String title;
	private String email;
	private String phone;
	
	@Embedded
	private Location location;

}