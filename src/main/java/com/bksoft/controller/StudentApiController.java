/**
 * 
 */
package com.bksoft.controller;

import com.bksoft.api.StudentApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author BRAJENDRA SINGH
 *
 */
@RestController
public class StudentApiController implements StudentApi{

	@RequestMapping(value="my")
	public void getStudentList()throws Exception{
		
	}
}
