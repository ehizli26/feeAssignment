package com.LastManagement.feeApp.DAO;

import java.util.List;

import com.LastManagement.feeApp.Entitiy.User;


public interface User_DAO {

	void save(User user);

	List<User> findAll();

	User findByEmail(String email);

}
