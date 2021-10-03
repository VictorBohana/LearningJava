package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initialAmount){
        Customer res = findCostumer(name);
        if(res == null){
            Customer newCostumer = new Customer(name, initialAmount);
            customers.add(newCostumer);
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String name, double amount){
        Customer res = findCostumer(name);
        if(res != null){
            res.addTransaction(amount);
            return true;
        }

        return false;
    }

    public Customer findCostumer(String name){
        for(int i = 0; i < customers.size(); i++){
            Customer checkedCustomer = customers.get(i);
            if(checkedCustomer.getName().equals(name)){
                return checkedCustomer;
            }
        }

        return null;
    }

}
