package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 100.00);
        bank.addCustomer("Adelaide", "Maria", 175.43);
        bank.addCustomer("Adelaide", "Percy", 96.20);

        bank.addCustomerTransaction("Adelaide", "Tim", 88);
        bank.addCustomerTransaction("Adelaide", "Tim", 44);
        bank.addCustomerTransaction("Adelaide", "Percy", 55.82);

        bank.printCustomers("Adelaide", true);
    }
}
