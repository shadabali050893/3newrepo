package com.main.service;

import java.util.List;

import com.main.model.User;

public interface ServiceI {

	public void saveData(User s);

	public Iterable displayAllData();

	public void deleteData(User s);

	public User editPage(int uid);

	public List<User> loginCheck(String username, String password);

}
