package com.LastManagement.feeApp.DAO;

import com.LastManagement.feeApp.Entitiy.Student;

public interface Student_DAO {

	Student findById(Long id);

	void save(Student student);

	Student findByEmail(String email);

}