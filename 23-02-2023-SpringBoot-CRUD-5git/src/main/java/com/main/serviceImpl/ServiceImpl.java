package com.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.User;
import com.main.repository.RepositoryI;
import com.main.service.ServiceI;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	RepositoryI ri;
	
	@Override
	public void saveData(User s) {
		
		ri.save(s);
	}

	@Override
	public Iterable displayAllData() {
		
		return ri.findAll();
	}

	@Override
	public void deleteData(User s) {
		
		ri.delete(s);
	}

	@Override
	public User editPage(int uid) {

		return ri.findAllByUid(uid);
	}

	@Override
	public List<User> loginCheck(String username, String password) {
		
		List<User>u=ri.findAllByUsernameAndPassword(username,password);
		return u;
	}


	

}
