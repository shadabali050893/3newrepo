package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.main.model.User;
import com.main.service.ServiceI;

@Controller
public class MyController {

	@Autowired
	ServiceI hs;
	
	@RequestMapping(value="/")
	public String prelogin() {
		
		return "login";
	}
	
	@RequestMapping(value="/registration")
	public String preRegister() {
		
		return "registration";
	}
	
	@RequestMapping(value="/reg")
	public String regData(@ModelAttribute User s) {
		
		s.getCity();
		
		hs.saveData(s);
		return "login";
	}
	
	@RequestMapping(value="/login")
	public String loginUser(@RequestParam String username,@RequestParam String password,Model m) {
		
	if("admin".equals(username) && "admin".equals(password)) {
		
		 Iterable list=hs.displayAllData();
		 m.addAttribute("data",list);
		 
		return "success";
		
	}else {
		
		List<User> singleUser = hs.loginCheck(username,password);
		
		if(!singleUser.isEmpty()) {
			
		m.addAttribute("data", singleUser);
			return "success";
			
		}else {
			return "login";
		}
	}
		}
	
	@RequestMapping("/delete")
	public String deleteData(@ModelAttribute User s,Model m) {
		
		hs.deleteData(s);
		
		 Iterable list=hs.displayAllData();
		 m.addAttribute("data",list);
		 
		return "success";
	}
	
	@RequestMapping("/edit")
	public String editData(@RequestParam("uid") int uid,Model m) {
		
		User s=hs.editPage(uid);
		m.addAttribute("data",s);
		return "edit";
	}
	
	@RequestMapping("/update")
	public String updateData(@ModelAttribute User s,Model m) {
		
		hs.saveData(s);
		
		 Iterable list=hs.displayAllData();
		 m.addAttribute("data",list);
		 
		return "success"; 
	}
}
