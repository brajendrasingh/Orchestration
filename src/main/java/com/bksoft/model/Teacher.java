/**
 * 
 */
package com.bksoft.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author BRAJENDRA SINGH
 *
 */
@ApiModel(value = "Teacher" , description = "Prototype for Teacher Model")
public class Teacher {

	@ApiModelProperty(position = 1, dataType = "java.lang.Integer", required = true)
	private int id;

	private String name;
	
	@ApiModelProperty(position = 2, dataType = "java.lang.String", required = true)
	private String mobile;

	public Teacher() {

	}

	public Teacher(int id, String name, String mobile) {
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
