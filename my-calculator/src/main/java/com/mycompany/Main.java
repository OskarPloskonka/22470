package com.mycompany;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź pierwszą liczbę:");
        int num1 = scanner.nextInt();

        System.out.println("Wprowadź drugą liczbę:");
        int num2 = scanner.nextInt();

        System.out.println("Wprowadź operację (+, -, *, /):");
        String operation = scanner.next();

        switch (operation) {
            case "+":
                System.out.println("Wynik: " + calculator.add(num1, num2));
                break;
            case "-":
                System.out.println("Wynik: " + calculator.subtract(num1, num2));
                break;
            case "*":
                System.out.println("Wynik: " + calculator.multiply(num1, num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("Wynik: " + calculator.add(num1, num2));
                } else {
                    System.out.println("Nie można dzielić przez zero!");
                }
                break;
            default:
                System.out.println("Nieznana operacja!");
                break;
        }

        scanner.close();
    }
}
