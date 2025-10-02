package com.horyxen.davide.ultimatejava.oop.classes;

public class Employee { // this class uses encapsulation as its fields are private and accesses via getters and setters
    private int baseSalary;
    private int hourlyRate;
    public static int numberOfEmployees; // static field shared by all instances of the class

    public Employee() {
        numberOfEmployees++;
    }

    // constructor overload to help build an object in a single line of code
    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    // getters

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    // setters

    public void setBaseSalary(int baseSalary) { // we can easily perform some validation logic
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Base salary must be greater than 0");
        this.baseSalary = baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate must be greater than 0");
        this.hourlyRate = hourlyRate;
    }

    // we can easily calculate the wage of any employee following OOP principles

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    // overloaded method when an employee has no extra hours
    public int calculateWage() {
        return baseSalary;
    }
}
