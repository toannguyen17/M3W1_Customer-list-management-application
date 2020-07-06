package com.controller;

import com.model.Customer;
import com.service.CustomerServide;
import com.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class homeController {

	@Autowired
	private CustomerServide customerService;

	@GetMapping(value = "/customers")
	public ModelAndView showList(){
		List<Customer> list = customerService.findAll();

		System.out.println(list);

		ModelAndView modelAndView = new ModelAndView("customers/list");
		modelAndView.addObject("customers", list);
		return modelAndView;
	}
}
