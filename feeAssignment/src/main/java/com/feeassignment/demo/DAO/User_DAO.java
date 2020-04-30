package com.feeassignment.demo.DAO;

import java.util.List;

import com.feeassignment.demo.Entitiy.User;


public interface User_DAO {

	void save(User user);

	List<User> findAll();

	User findByEmail(String email);

}
