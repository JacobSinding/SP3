package com.company;
//pizzaNumber;PizzaName;ingredients;price

public class Pizza{


    String name;
    String toppings;
    int number;
    int price;
    boolean news;

    public Pizza(int number, String name, String toppings, int price) {
        this.name = name;
        this.toppings = toppings;
        this.number = number;
        this.price = price;
        this.news = true;

    }

    public String getName() {
        return name;
    }


    public int getNumber() {
        return number;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return number + ";" + name + ";" + toppings + ";" + price;
    }
    //int totalOrder() {return getPrice();
}