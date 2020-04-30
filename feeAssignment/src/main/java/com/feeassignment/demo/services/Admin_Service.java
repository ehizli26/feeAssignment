package com.feeassignment.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feeassignment.demo.DAO.Admin_DAO;
import com.feeassignment.demo.DAO.Student_DAO;
import com.feeassignment.demo.DAO.User_DAO;
import com.feeassignment.demo.Entitiy.Accountant;
import com.feeassignment.demo.Entitiy.Student;
import com.feeassignment.demo.Entitiy.User;
import com.feeassignment.demo.repositories.StudentDto;

@Service
public class Admin_Service {
	
	@Autowired
    private Admin_DAO admin_DAO;

    @Autowired
    private User_DAO user_DAO;

    @Autowired
    private Student_DAO student_DAO;


    public void save(StudentDto newStudent) {
        Student student = new Student();
        student.setStudent_name(newStudent.getName());
        student.setStudent_email(newStudent.getEmail());

        User s = new User();
        s.setEmail(student.getStudent_email());
        s.setPassword("123");

        user_DAO.save(s);
        student_DAO.save(student);
    }

    public List<Student> getAllStudents() {
        return admin_DAO.findAllStudent();
    }

    public void deleteStudent(int id) {
        admin_DAO.deleteStudentById(id);
    }

    public Student getStudent(int id) {
        return admin_DAO.findByIdStudent(id);
    }

    public void deleteAccountant(int id) {
        admin_DAO.deleteStudentById(id);
    }

    public Accountant getAccountant(int id) {
        return admin_DAO.findByIdAccountant(id);
    }

    public void saveAccountant(Accountant accountant) {
        admin_DAO.saveAccountant(accountant);
    }


}
