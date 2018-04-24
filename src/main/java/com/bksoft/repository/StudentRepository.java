/**
 * 
 */
package com.bksoft.repository;

import org.springframework.stereotype.Repository;

import com.bksoft.model.Student;

/**
 * @author BRAJENDRA SINGH
 *
 */
@Repository
public interface StudentRepository {
	
	public Student getStudent() throws Exception ;
}
