package com.company;

public class ShowMenuDK implements ShowMenu{
    @Override
    public void showMenu() {
        System.out.println("1) Vis menu");
        System.out.println("2) Pizza Menu");
        System.out.println("3) Ret bestilling");
        System.out.println("4) Godkend bestilling");
        System.out.println("8) Change to English");
        System.out.println("9) exit ");
    }

}