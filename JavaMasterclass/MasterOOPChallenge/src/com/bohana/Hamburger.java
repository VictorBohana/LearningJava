package com.bohana;

public class Hamburger {
    private String name;
    private String meat;
    private String typeOfBread;
    private double price;
    private BurgerAddition addition1 = null;
    private BurgerAddition addition2 = null;
    private BurgerAddition addition3 = null;
    private BurgerAddition addition4 = null;

    public Hamburger(String name, String meat, String typeOfBread, double price){
        this.name = name;
        this.meat = meat;
        this.typeOfBread = typeOfBread;
        this.price = price;
    }

    public void addAddition1(String additionName, double price){
        if(price > 0 && additionName != ""){
            if(addition1 == null){
                this.addition1 = new BurgerAddition(additionName, price);
                this.price += price;
                System.out.println("Added " + additionName + " to " + this.name + " for $" + price);
            }
            else{
                System.out.println("Error! Burger " + this.name + " already contains addition1.");
            }
        }
    }

    public void addAddition2(String additionName, double price){
        if(price > 0 && additionName != ""){
            if(addition2 == null){
                this.addition2 = new BurgerAddition(additionName, price);
                this.price += price;
                System.out.println("Added " + additionName + " to " + this.name + " for $" + price);
            }
            else{
                System.out.println("Error! Burger " + this.name + " already contains addition2.");
            }
        }
        else{
            System.out.println("Addition price/name is invalid.");
        }
    }

    public void addAddition3(String additionName, double price){
        if(price > 0 && additionName != ""){
            if(addition3 == null){
                this.addition3 = new BurgerAddition(additionName, price);
                this.price += price;
                System.out.println("Added " + additionName + " to " + this.name + " for $" + price);
            }
            else{
                System.out.println("Error! Burger " + this.name + " already contains addition3.");
            }
        }
        else{
            System.out.println("Addition price/name is invalid.");
        }
    }

    public void addAddition4(String additionName, double price){
        if(price > 0 && additionName != ""){
            if(addition4 == null){
                this.addition4 = new BurgerAddition(additionName, price);
                this.price += price;
                System.out.println("Added " + additionName + " to " + this.name + " for $" + price);
            }
            else{
                System.out.println("Error! Burger " + this.name + " already contains addition4.");
            }
        }
        else{
            System.out.println("Addition price/name is invalid.");
        }
    }

    public void itemizeBurger(){
        System.out.println("==================================");
        System.out.println("Name: " + this.name);
        System.out.println("Meat: " + this.meat);
        System.out.println("Bread Type: " + this.typeOfBread);
        System.out.println("Final price: " + "$" + this.price);
        System.out.println("==================================");
    }

}
