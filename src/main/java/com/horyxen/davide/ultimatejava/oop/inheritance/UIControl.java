package com.horyxen.davide.ultimatejava.oop.inheritance;

// abstract class: cannot be instantiated, can contain abstract methods
public abstract class UIControl {
    // protected: accessible in derived classes
    protected boolean isEnabled;

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public abstract String render(); // abstract method: no implementation, must be implemented in derived classes

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
