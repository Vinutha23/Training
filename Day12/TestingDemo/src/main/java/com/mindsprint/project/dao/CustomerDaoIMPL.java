package com.mindsprint.project.dao;
import java.util.ArrayList;
import java.util.List;
public class CustomerDaoIMPL implements CustomerDAO{
    private List<Customer> list=null;
    public CustomerDaoIMPL(){
        list=new ArrayList<>();
        list.add(new Customer(1,"Alex","US"));
        list.add(new Customer(2,"john","Uk"));
        list.add(new Customer(3,"david","India"));
    }
    @Override
    public Customer addNewCustomer(Customer customer) {
        list.add(customer);
        return customer;
    }
    @Override
    public Customer getCustomer(int id)
    {
        return null;
    }
    @Override
    public List<Customer> getAllCustomer() {
        return list;
    }
    @Override
    public boolean deleteCustomer(int id) {
        return false;
    }
    @Override
    public boolean updateCustomer(int id, String address) {
        return false;
    }
}
