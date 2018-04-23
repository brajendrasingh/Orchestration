/**
 * 
 */
package com.bksoft.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

/**
 * @author BRAJENDRA SINGH
 *
 */

@Api(value = "DepartmentApi")
@RestController
public class DepartmentApiController {

	@RequestMapping(value = "dpt")
	public List<String> getDptList() {

		List<String> dlist = new ArrayList<String>();

		dlist.add("CSED");
		dlist.add("Mechenical");
		dlist.add("Chemical");
		dlist.add("Biotechnology");

		return dlist;
	}
}
