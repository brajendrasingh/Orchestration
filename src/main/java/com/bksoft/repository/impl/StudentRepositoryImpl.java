/**
 * 
 */
package com.bksoft.repository.impl;

import org.springframework.stereotype.Repository;

import com.bksoft.model.Student;
import com.bksoft.repository.StudentRepository;

/**
 * @author BRAJENDRA SINGH
 *
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {

	public Student getStudent() throws Exception {

		Student student = new Student();
		student.setName("Data From Repository");
		return student;
	}

}
