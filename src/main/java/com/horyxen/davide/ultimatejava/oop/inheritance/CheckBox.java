package com.horyxen.davide.ultimatejava.oop.inheritance;

// final class: cannot be extended
public final class CheckBox extends UIControl {
    private boolean isChecked;

    public CheckBox() {
        super(true);
    }

    public CheckBox(boolean isChecked) {
        super(true);
        this.isChecked = isChecked;
    }

    @Override
    public String render() {
        return "CheckBox rendered";
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    @Override
    public void enable() {
        System.out.println("CheckBox enabled");
        super.enable();
    }
}
