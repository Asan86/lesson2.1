package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "Азамат ";
        int age = 50;
        int temperature = 5;
        if (age > 20 && age < 45 && temperature < 30 && temperature > -20) {
            System.out.println(name + "Можно идти гулять");
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            System.out.println(name + "Можно гулять");
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            System.out.println(name + "То можно гулять");

        }
    }
}



