/**
 * 
 */
package com.bksoft.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bksoft.model.Student;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @author BRAJENDRA SINGH
 *
 */
@Api(value = "StudentApi")
@Controller
public class StudentApiController {

	@ApiOperation(value = "Fetch  Student's details", notes = "Gets Student's details in JSON format")
	@RequestMapping(value = "studentList")
	public ResponseEntity<Student> getStudentList() throws Exception {

		Student student = new Student();

		return new ResponseEntity<>(student, HttpStatus.OK);
	}

	@ApiOperation(value = "Fetch  Student's details by sid", notes = "Gets Student's details by sid in JSON format")
	@RequestMapping(value = "student")
	public ResponseEntity<Student> getStudentById(
			@ApiParam(value = "sid for student", required = true) @RequestHeader(value = "sid", required = true) String sid,
			@ApiParam(value = "course of student", required = true) @RequestParam(value = "course", required = true) String course)
			throws Exception {

		Student student = new Student();

		return new ResponseEntity<>(student, HttpStatus.OK);
	}
}
