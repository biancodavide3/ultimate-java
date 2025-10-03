package com.horyxen.davide.ultimatejava.oop.inheritance;

public class Main {
    public static void main(String[] args) {
        var textBox = new TextBox();
        System.out.println(textBox.isEnabled()); // inherited method
        textBox.setText("Hello World");
        // every class inherits from Object class
        // methods as hashCode(), equals(), toString() are defined in Object class
        System.out.println(textBox.hashCode());
        var textBox2 = textBox;
        System.out.println(textBox.hashCode() == textBox2.hashCode());
        // they have textBox and textBox2 have the same hashCode because they point to the same object in the heap
        System.out.println(textBox.equals(textBox2)); // and so they are equal
        // it is useful to override toString() and equals() methods for each object
        // example two points are equal if they have the same coordinates
        // or when we want to see the textual representation of a textBox we want to see the text inside instead of the address in memory
        UIControl[] controls = new UIControl[]{new TextBox(), new CheckBox()};
        for (var control : controls) {
            control.render(); // polymorphism: the correct method is called based on the object type at runtime
        }
        // a class can only extend one class (single inheritance)
    }
}
