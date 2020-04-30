package com.feeassignment.demo.DAO;

import java.util.List;

import com.feeassignment.demo.Entitiy.Accountant;
import com.feeassignment.demo.Entitiy.Student;


public interface Accountant_DAO {
	
	public void addStudent(Student studentModel);

	public List<Student> getStudents();

	public Student findById(int id);

	public Student update(Student studentModel, int id);

	public void delete(int id);
	
	 Accountant findByEmail(String email);
	 
	 void save(Student student);
	 
	 void deleteById(int id);
}
