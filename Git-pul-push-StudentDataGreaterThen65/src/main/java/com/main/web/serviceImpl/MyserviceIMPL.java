package com.main.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.web.model.User;
import com.main.web.repository.Myrepositoryi;
import com.main.web.servicei.Myservicei;

@Service
public class MyserviceIMPL implements Myservicei{

	@Autowired
	Myrepositoryi ri;
	
	@Override
	public void saveData(User u) {
		ri.save(u);
		
	}

	@Override
	public List<User> getAllUser() {
		
		
		List<User> userdata=(List<User>) ri.findAll();
		return userdata;
	}

	


}
