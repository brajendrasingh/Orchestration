/**
 * 
 */
package com.bksoft.model;

/**
 * @author BRAJENDRA SINGH
 *
 */
public class Teacher {

	private String id;
	private String name;
	private String mobile;

	public Teacher() {

	}

	public Teacher(String id, String name, String mobile) {
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
