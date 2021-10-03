package com.bohana;

public class Main {

    public static void main(String[] args) {
        // 4 additions can be added to a normal burger
	    Hamburger cheeseBurger = new Hamburger("Cheeseburger", "Steak", "White Bread", 5.00);
	    cheeseBurger.addAddition1("Tomato", 0.40);
	    cheeseBurger.addAddition1("Pickles", 0.10); //should give an error
        cheeseBurger.addAddition2("Pickles", 0.10);
        cheeseBurger.itemizeBurger();

        // only 2 additions can be added to a healthy burger
        HealthyBurger healthy = new HealthyBurger("Healthy", "Chicken", "Brown Bread", 10);
        healthy.addAddition1("Lentils", 2);
        healthy.addAddition1("Lettuce", 2); // should give an error
        healthy.addAddition2("Egg", 2.50);
        healthy.addAddition3("Lettuce", 2.50); // should give an error
        healthy.itemizeBurger();
    }
}
