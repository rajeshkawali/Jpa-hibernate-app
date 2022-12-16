package com.rajeshkawali.relationship.embedded;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.ToString;

/**
 * @author Rajesh_Kawali
 *
 */
@ToString
@Data
@Embeddable
public class Location {

	private String country;
	private String state;
	private String city;
	private Long pin;

}
