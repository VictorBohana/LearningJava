package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name){
        Branch res = findBranch(name);
        if(res == null){
            Branch newBranch = new Branch(name);
            branches.add(newBranch);
            return true;
        }

        return false;
    }

    public boolean addCustomer(String nameBranch, String nameCustomer, double initialTransaction){
        Branch res = findBranch(nameBranch);
        if(res != null){
            Customer customer = res.findCostumer(nameCustomer);
            if(customer == null){
                res.newCustomer(nameCustomer, initialTransaction);
                return true;
            }
        }

        return false;
    }

    public boolean addCustomerTransaction(String nameBranch, String nameCustomer, double amount){
        Branch res = findBranch(nameBranch);
        if(res != null){
            Customer customer = res.findCostumer(nameCustomer);
            if(customer != null){
                customer.addTransaction(amount);
                return true;
            }
        }

        return false;
    }

    public Branch findBranch(String name){
        for(int i = 0; i < branches.size(); i++){
            Branch checkedBranch = branches.get(i);
            if(checkedBranch.getName().equals(name)){
                return checkedBranch;
            }
        }
        return null;
    }

    public void printCustomers(String nameBranch, boolean printTransactions){
        Branch res = findBranch(nameBranch);
        if(res != null){
            System.out.println("Customer details for branch " + res.getName());
            ArrayList<Customer> allCustomers = res.getCustomers();
            for(int i = 0; i < allCustomers.size(); i++){
                System.out.println("Customer: " + allCustomers.get(i).getName() + "[" + (i + 1) + "]");
                if(printTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> allTransactions = allCustomers.get(i).getTransactions();
                    for(int j = 0; j < allTransactions.size(); j++){
                        System.out.println("[" + (j + 1) + "]  Amount: $" + allTransactions.get(j).doubleValue());
                    }
                }
            }
        }
    }

}
