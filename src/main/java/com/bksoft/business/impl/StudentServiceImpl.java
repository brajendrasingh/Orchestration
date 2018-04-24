/**
 * 
 */
package com.bksoft.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bksoft.business.StudentService;
import com.bksoft.model.Student;
import com.bksoft.repository.StudentRepository;

/**
 * @author BRAJENDRA SINGH
 *
 */
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public Student getStudent() throws Exception {
		return studentRepository.getStudent();
	}
}
