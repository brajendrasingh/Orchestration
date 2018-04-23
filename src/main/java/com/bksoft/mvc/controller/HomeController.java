/**
 * 
 */
package com.bksoft.mvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bksoft.model.Student;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author BRAJENDRA SINGH
 *
 */
@Api(value = "HomeController")
@Controller
public class HomeController {

	@ApiOperation(value = "Fetch  Student's details", notes = "Gets Student's details in JSON format")
	@RequestMapping(value = "slist")
	public ResponseEntity<Student> getStudentList() throws Exception {

		Student student = new Student();

		return new ResponseEntity<>(student, HttpStatus.OK);
	}

}
