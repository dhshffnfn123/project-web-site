package com.teamright.brokurly.customer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teamright.brokurly.customer.mapper.CustomerInfoMapper;
import com.teamright.brokurly.model.CustomerVO;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerInfoMapper customerMapper;

	@GetMapping("/signup")
	public void signup() {}

	@GetMapping("/signin")
	public void signin() {}

	@GetMapping("/findid")
	public void findid() {}

	@GetMapping("/findpw")
	public void findpw() {}

}

















