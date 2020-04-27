package com.LastManagement.feeApp.DAO;

import java.util.List;

import com.LastManagement.feeApp.Entitiy.Accountant;
import com.LastManagement.feeApp.Entitiy.Student;

public interface Admin_DAO {
	
	public void addAccountant(Accountant accountantl);

	public List<Accountant> getAccountants();

	public Accountant findById(int id);

	public Accountant update(Accountant accountant, int id);

	public void delete(int id);
	
	List<Student> findAllStudent();
	
	 void deleteStudentById(int id);
	 
	 Student findByIdStudent(int id);
	 
	 Accountant findByIdAccountant(int id);
	 
	 void saveAccountant(Accountant accountant);
}
