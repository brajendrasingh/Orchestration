/**
 * 
 */
package com.bksoft.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bksoft.model.Student;
import com.bksoft.business.StudentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author BRAJENDRA SINGH
 *
 */
@Api(value = "StudentApi")
@Controller
public class StudentApiController {

	@Autowired
	private StudentService studentService;
	
	@ApiOperation(value = "Fetch  Student's details", notes = "Gets Student's details in JSON format")
	@RequestMapping(value = "studentList")
	public ResponseEntity<Student> getStudentList() throws Exception {

		Student student = studentService.getStudent();

		return new ResponseEntity<>(student, HttpStatus.OK);
	}

	@ApiOperation(value = "Fetch  Student's details by sid", notes = "Gets Student's details by sid in JSON format")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") 
	})
	@RequestMapping(value = "student")
	public ResponseEntity<Student> getStudentById(
			@ApiParam(value = "sid for student", required = true) @RequestHeader(value = "sid", required = true) String sid,
			@ApiParam(value = "course of student", required = true) @RequestParam(value = "course", required = true) String course)
			throws Exception {

		Student student = new Student();

		return new ResponseEntity<>(student, HttpStatus.OK);
	}
}
