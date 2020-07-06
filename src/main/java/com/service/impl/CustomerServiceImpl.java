package com.service.impl;

import com.model.Customer;
import com.service.CustomerServide;

import java.util.List;

import static java.util.Arrays.asList;

public class CustomerServiceImpl implements CustomerServide {
	private static List<Customer> list;

	static {
		list = asList(
			new Customer(1, "Nguyen van toan", "toan@gmail.com", "Vinh Phuc"),
			new Customer(2, "Nguyen van toan", "toan@gmail.com", "Vinh Phuc"),
			new Customer(3, "Nguyen van toan", "toan@gmail.com", "Vinh Phuc")
		);
	}

	@Override
	public List<Customer> findAll() {
		return list;
	}
}
