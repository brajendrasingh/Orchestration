/**
 * 
 */
package com.bksoft.business;

import org.springframework.stereotype.Service;

import com.bksoft.model.Student;

/**
 * @author BRAJENDRA SINGH
 *
 */
@Service
public interface StudentService {

	public Student getStudent() throws Exception ;
}
