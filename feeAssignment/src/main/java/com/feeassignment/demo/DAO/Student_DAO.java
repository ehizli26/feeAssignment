package com.feeassignment.demo.DAO;

import com.feeassignment.demo.Entitiy.Student;

public interface Student_DAO {

	Student findById(Long id);

	void save(Student student);

	Student findByEmail(String email);

}
