package com.main.web.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.main.web.model.User;

@Repository
public interface Myrepositoryi extends CrudRepository<User,Integer> {


	
	/*@Query(value = "select id , name , marks from User where marks>65")
	public List<User> findAllBy();
	*/
	
}
