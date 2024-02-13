package com.skyhigh.EasyFrieght.db;

import java.util.ArrayList;

import com.skyhigh.EasyFrieght.model.User;

public interface DAO {
	void createConnection();
	void closeConnection();
	
	void createUser(User u);
	void updateUser(User u);
	void deleteUser(int uid);
	
	ArrayList<User> getAllUsers();
}
