package com.main.web.servicei;

import java.util.List;

import com.main.web.model.User;


public interface Myservicei {

	public	void saveData(User u);
	
	public List<User> getAllUser();
	
}
