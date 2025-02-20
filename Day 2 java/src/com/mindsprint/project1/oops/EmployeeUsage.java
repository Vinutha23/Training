package com.mindsprint.project1.oops;

public class EmployeeUsage {
    public static void main(String[] args) {
        Employee e1=new Employee(1,"john Dee",34567);
        System.out.println(e1);
        Employee e2=new Employee();
        e2.setId(1001);
        e2.setName("TestUser");
        e2.setSalary(789990);
        System.out.println("Id: "+e2.getId()+"Name: "+e2.getName()+"Salary: "+e2.getSalary());
    }
}
