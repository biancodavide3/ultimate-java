package com.horyxen.davide.ultimatejava.oop.inheritance;

public class TextBox extends UIControl {
    private String text;

    public TextBox() {
        super(true); // call the constructor of the base class
    }

    public TextBox(String text) {
        super(true);
        this.text = text;
    }

    @Override
    public String render() {
        return "TextBox rendered";
    }

    @Override   // override the default behavior of enable method from super class
    public void enable() {
        System.out.println("TextBox enabled");
        super.enable(); // call the base class method
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
