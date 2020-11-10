package com.company;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MainControllerTest {

    @org.junit.Test
    public void getAllPizzasFromSource() {
        MainController mainController = new MainController();
        ArrayList<Pizza> pizzas = mainController.getAllPizzasFromSource();
    }

}