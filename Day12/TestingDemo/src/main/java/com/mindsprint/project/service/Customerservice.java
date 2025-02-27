package com.mindsprint.project.service;

import com.mindsprint.project.dao.CustomerDAO;
import com.mindsprint.project.dao.CustomerDaoIMPL;
import com.mindsprint.project.model.Customer;

import java.util.List;

public class Customerservice {
    private CustomerDAO dao;
    public Customerservice(){
        dao = new CustomerDaoIMPL();
    }
    public Customer addNewCustomer(Customer customer){
        return dao.addNewCustomer(customer);
    }
    public List<Customer> getAllCustomer(){
        return dao.getAllCustomer();
    }
}
