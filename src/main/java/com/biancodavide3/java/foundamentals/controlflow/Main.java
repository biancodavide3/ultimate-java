package com.biancodavide3.java.foundamentals.controlflow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // comparison operators
        int x = 1;
        int y = 1;
        System.out.println(x == y); // true
        System.out.println(x != y); // false
        System.out.println(x > y);  // false
        System.out.println(x >= y); // true

        // logical operators
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;  // and
        System.out.println(isWarm); // true
        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;    // or, and, not

        // if statements
        int temp = 32;
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        } else if (temp > 20) { // 20 < temp <= 30, no need to check lower bound
            System.out.println("It's a nice day");
        } else { // temp <= 20
            System.out.println("It's cold");
        }

        // ternary operator
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";

        // enhanced switch statements, can also return values
        String role = "moderator";
        String message = switch (role) {
            case "admin" -> {
                System.out.println("You are an admin");
                yield "Welcome Admin";  // yield is like return but for switch expressions
            }
            case "moderator" -> {
                System.out.println("You are a moderator");
                yield "Welcome Moderator";
            }
            default -> {
                System.out.println("You are a guest");
                yield "Welcome Guest";
            }
        };

        // fizzbuzz
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }

        // for loops
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World " + i);
        }

        // while loops, break, continue
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("quit")) {
                break;
            }
            if (input.equals("pass")) {
                continue;
            }
            System.out.println(input);
        }

        // for each loop
        String[] fruits = {"Apple", "Mango", "Orange"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
