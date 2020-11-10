package com.company;

import com.company.Pizza;
import com.company.ShowMenu;
import com.company.ShowMenuDK;
import com.sun.codemodel.internal.JForEach;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    int choice = 0;
    Scanner sc = new Scanner(System.in);
    ShowMenu showMenu = new ShowMenuDK();
    List<Pizza> pizzaList = getAllPizzasFromSource();
    List<Order> bestillinger = new ArrayList<>();

    public void runProgram() {
        showMenu.showMenu();
        while (choice!=9) {
            choice = sc.nextInt();
            switch (choice) {
                case 1: showPizzaMenu();break;
                case 2: createOrder();break;
                case 3: editOrder();break;
                case 4: confirmOrder();break;
                default:choice=9;break;
            }
        }
    }
    public void showPizzaMenu(){
        for (Pizza p:pizzaList) {
            System.out.println(p);
        }

    }
    //Createorder 1. Via alle pizza'er.
    private void createOrder() {
        //string customerName, int phoneNumber
        System.out.println("Hvad hedder du?");
        String customerName = sc.nextLine();
        System.out.println("Hvad er dit nummer?");
        int phoneNumber = sc.nextInt();
        Order order = new Order(customerName, phoneNumber);
        int lchoice = 0;
        while (lchoice != 99) {
            System.out.println("Indtast Pizza nummer, 99 for exit");
            lchoice = sc.nextInt();
            Pizza pizza = getPizzaById(lchoice);
            order.addPizzaToOrder(pizza);
        }
    }



    private void confirmOrder(){
    }

    private void editOrder(){
    }

    public ArrayList<Pizza> getAllPizzasFromSource(){

        ArrayList<Pizza> returnList = new ArrayList<>();
        //Henter pizza fra en fil.
        // 1;Vesuvio;Tomatsauce, ost, skinke og oregano;57
        File file = new File("Resources/Pizza.csv");
        try {

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";

            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                Pizza pizza = new Pizza(Integer.valueOf(values[0]),values[1],values[2],Integer.valueOf(values[3]));
                returnList.add(pizza);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
        return returnList;
    }

    public Pizza getPizzaById(int id){
        Pizza returPizza = null;
        for (Pizza pizza:pizzaList) {
        if (pizza.getNumber() == id){
            return pizza;
        }
        }
        return returPizza;
    }

}

