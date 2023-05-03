package com.main.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.web.model.User;
import com.main.web.servicei.Myservicei;

@RestController
@CrossOrigin("*")
public class MyController {

	@Autowired
	Myservicei si;

//post...//to insert data..


	@GetMapping(value = "/getdata")
	public List<User> getData() {

		List<User> Alluser = si.getAllUser();

		List<User> l = new ArrayList<>();

		for (User u : Alluser) {

			if (u.getMarks() > 65) {

				l.add(u);

			}

		}
		return l;

	}

}
