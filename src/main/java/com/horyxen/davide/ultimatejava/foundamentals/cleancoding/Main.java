package com.horyxen.davide.ultimatejava.foundamentals.cleancoding;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // keep methods small and focussed on single task
        // if a method is too long (> 20 lines) break it down into smaller methods
        Scanner scanner = new Scanner(System.in);
        String username = getUsername(scanner);
        int age = getAge(scanner);
        checkEligibleToVote(username, age);
        scanner.close();
    }

    public static String getUsername(Scanner scanner) {
        System.out.print("Enter your username: ");
        return scanner.next().trim();
    }

    public static int getAge(Scanner scanner) {
        System.out.print("Enter your age: ");
        return scanner.nextInt();
    }

    public static void checkEligibleToVote(String username, int age) {
        if (age >= 18) {
            System.out.println(username + " is eligible to vote.");
            return;
        }
        System.out.println(username + " is not eligible to vote.");
    }
}
