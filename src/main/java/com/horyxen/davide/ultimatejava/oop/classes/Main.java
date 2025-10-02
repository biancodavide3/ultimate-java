package com.horyxen.davide.ultimatejava.oop.classes;

public class Main {
    public static void main(String[] args) {
        var textBox1 = new TextBox();
        // new TextBox(); create a new object in the heap
        // textBox1 is a reference variable that points to that object in the heap
//        System.out.println(textBox1.text.toUpperCase()); // will throw a NullPointerException because text is null
        textBox1.setText("BOX 1");
        var textBox2 = new TextBox();
        textBox2.setText("BOX 2");
        System.out.println(textBox1.text);  // different states for two different objects
        System.out.println(textBox2.text);
        textBox2 = textBox1;
        System.out.println(textBox1.text);  // now both reference variables point to the same object in the heap
        System.out.println(textBox2.text);
        // we don't have to worry about deallocation because java garbage collection will automatically remove unused objects from the heap
        // ------------ OOP PRINCIPLES ------------
        // 1. Encapsulation: keeping fields private and exposing them via getters and setters
        // 2. Abstraction: exposing only relevant information and hiding unnecessary details
        // 3. Inheritance: creating a new class based on an existing class
        // 4. Polymorphism: ability to take many forms, e.g. method overloading and overriding
        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        System.out.println(employee.calculateWage(10));
        var employee2 = new Employee(60_000, 30); // using overloaded constructor
        System.out.println(employee2.calculateWage());
        System.out.println(Employee.numberOfEmployees); // accessing static field via class name
    }

}
