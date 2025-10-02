package com.horyxen.davide.ultimatejava.oop.classes;

public class TextBox {
    public String text; // state of the text box, doesn't use encapsulation as it's not private

    public void setText(String text) {  // a method that modifies the state of the text box
        this.text = text;
    }

    public void clear() {   // another method that modifies state
        text = "";
    }
}
