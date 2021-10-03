package com.bohana;

public class HealthyBurger extends Hamburger{

    public HealthyBurger(String name, String meat, String typeOfBread, double price) {
        super(name, meat, typeOfBread, price);
    }

    @Override
    public void addAddition3(String additionName, double price) {
        System.out.println("Addition 3 is not available for Healthy Burgers. Healthy burgers can only have up to 2 additions.");
    }

    @Override
    public void addAddition4(String additionName, double price) {
        System.out.println("Addition 4 is not available for Healthy Burgers. Healthy burgers can only have up to 2 additions.");
    }
}
