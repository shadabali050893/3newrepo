package com.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.main.model.User;
@Repository
public interface RepositoryI extends CrudRepository<User, Integer>{

	public User findAllByUid(int uid);

	public List<User> findAllByUsernameAndPassword(String username, String password);

}
