package com.manish.javadev.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manish.javadev.service.CustomerService;
import com.manish.javadev.to.CustomerTO;

public class CustomerManager {

	public static void main(String[] args) throws Exception {

		CustomerTO cust = null;
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"Spring-Context.xml");

		CustomerService customerService = (CustomerService) ctx
				.getBean("customerServiceImpl");

		// Add Operation
		CustomerTO custo1 = new CustomerTO(1, "Manish SE", "Srivastava", 27,
				"LKO");
		CustomerTO custo2 = new CustomerTO(2, "Divya SE", "Srivastava", 24, "LKO");
		CustomerTO custo3 = new CustomerTO(3, "Ajay PCS", "Srivastava", 34, "LKO");
		CustomerTO custo4 = new CustomerTO(4, "Pawan Lead", "Vishnoi", 27, "LKO");
		CustomerTO custo5 = new CustomerTO(5, "Rajesh Lead", "Srivastava", 34, "LKO");
		CustomerTO custo6 = new CustomerTO(6, "Ashish", "Srivastava", 32, "LKO");
		CustomerTO custo7 = new CustomerTO(7, "Dinesh", "Srivastava", 55, "LKO");

		customerService.addCustomer(custo1);
		customerService.addCustomer(custo2);
		customerService.addCustomer(custo3);
		customerService.addCustomer(custo4);
		customerService.addCustomer(custo5);
		customerService.addCustomer(custo6);
		customerService.addCustomer(custo7);
		System.out.println("Add Operation Done");
		
	}
}