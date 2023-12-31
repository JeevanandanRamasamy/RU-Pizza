package com.pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * Enum Class that represents specialty pizzas
 * @author Jeeva Ramasamy, Parth Patel
 */
public enum Specialty {
    DELUXE("Deluxe", 14.99, Sauce.TOMATO,
            new ArrayList<>(List.of(Topping.SAUSAGE, Topping.PEPPERONI,
                    Topping.GREEN_PEPPER, Topping.ONION, Topping.MUSHROOM))),
    SUPREME("Supreme", 15.99, Sauce.TOMATO,
            new ArrayList<>(List.of(Topping.SAUSAGE, Topping.PEPPERONI,
                    Topping.HAM, Topping.GREEN_PEPPER, Topping.ONION,
                    Topping.BLACK_OLIVE, Topping.MUSHROOM))),
    MEATZZA("Meatzza", 16.99, Sauce.TOMATO,
            new ArrayList<>(List.of(Topping.SAUSAGE, Topping.PEPPERONI,
                    Topping.BEEF, Topping.HAM))),
    SEAFOOD("Seafood", 17.99, Sauce.ALFREDO,
            new ArrayList<>(List.of(Topping.SHRIMP, Topping.SQUID,
                    Topping.CRAB_MEATS))),
    PEPPERONI("Pepperoni", 10.99, Sauce.TOMATO,
        new ArrayList<>(List.of(Topping.PEPPERONI)));

    private String name;
    private double price;
    private Sauce sauce;
    private ArrayList<Topping> toppings;

    /**
     * Initializes pre-defined specialty pizzas
     * @param sauce sauce for pizza
     * @param toppings toppings for pizza
     */
    Specialty(String name, double price, Sauce sauce,
              ArrayList<Topping> toppings) {
        this.name = name;
        this.price = price;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    /**
     * Returns the name of the specialty
     * @return name
     */
    @Override
    public String toString() {
        return name;
    }

    /**
     * Returns the price of the pizza
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Returns the pizza sauce
     * @return sauce name
     */
    public Sauce getSauce() {
        return sauce;
    }

    /**
     * Returns the toppings of the specialty
     * @return name
     */
    public ArrayList<Topping> getToppings() {
        return toppings;
    }

    /**
     * Returns the toppings of the pizza
     * @return toppings
     */
    public String[] getToppingList() {
        int num_toppings = this.toppings.size();
        String[] toppings = new String[num_toppings];
        for (int i = 0; i < num_toppings; i++) {
            toppings[i] = this.toppings.get(i).toString();
        }
        return toppings;
    }
}