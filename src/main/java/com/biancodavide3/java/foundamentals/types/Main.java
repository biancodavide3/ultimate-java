package com.biancodavide3.java.foundamentals.types;

import java.awt.Point;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // primitive types, 8 different types for simple values
        byte age = 30;
        short year = 2025;
        int viewsCount = 123_456_789;
        long moneyCount = 3_000_000_000L;   // L suffix because literal is int by default
        float price = 10.99F;   // F suffix because literal is double by default
        double weight = 65.5;
        char letter = 'A';
        boolean isEligible = false;

        // reference types, complex objects
        Date now = new Date();
        System.out.println(now);

        // primitive vs reference types
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);  // 1, different memory locations

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);  // (2, 1), same memory location

        // strings
        String message = "Hello World" + "!!   ";
        int length = message.length();
        int indexOf = message.indexOf("World");
        // strings are immutable, every method that modifies a string returns a new string
        String newMessage = message.replace("World", "Java");
        System.out.println(message);       // Hello World!!
        System.out.println(newMessage);    // Hello Java!!
        String lower = message.toLowerCase();
        String upper = message.toUpperCase();
        String trim = message.trim();
        System.out.println(lower + "\n" + upper + "\n" + trim);

        // escape sequences
        String text = "Hello \"World\"\nNew Line\tTabbed\\Backslash";
        System.out.println(text);

        // arrays
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers); // memory location
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length); // 5
        System.out.println(numbers[2]); // 0, default value
        int[] otherNumbers = {2, 3, 5, 1, 4};
        Arrays.sort(otherNumbers);
        System.out.println(Arrays.toString(otherNumbers));

        // multi-dimensional arrays
        int[][] matrix = new int[2][3];;
        matrix[0][0] = 1;
        System.out.println(Arrays.deepToString(matrix));
        int[][] matrix2 = { {1, 2, 3}, {4, 5, 6} };
        System.out.println(Arrays.deepToString(matrix2));

        // constants
        final float PI = 3.14F;
        // PI = 1; // error, cannot reassign a constant
        System.out.println(PI);

        // type casting
        short a = 1;
        int b = a + 2;  // implicit casting, smaller to larger type
        System.out.println(b); // 3

        // Math class
        int result = Math.round(1.1F);
        System.out.println(result); // 1
        double ceil = Math.ceil(1.1F);  // 2.0
        double floor = Math.floor(1.9F); // 1.0
        double power = Math.max(2,3); // 3
        double random = Math.random(); // 0.0 to 1.0
        System.out.println(ceil + " " + floor + " " + power + " " + random);

        // formatting numbers
        System.out.println(NumberFormat.getCurrencyInstance().format(1234567.891)); // $1,234,567.89
        System.out.println(NumberFormat.getPercentInstance().format(0.1)); // 10%

        // reading input from console
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your age: ");
//        byte input = scanner.nextByte();
//        System.out.println("You are " + input);
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine().trim();
//        System.out.println("You are " + name);
        scanner.close();
    }
}
