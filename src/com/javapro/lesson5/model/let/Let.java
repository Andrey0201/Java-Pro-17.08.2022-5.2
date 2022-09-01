package com.javapro.lesson5.model.let;

abstract public class Let {
    protected int value;

    public Let(int value) {
        this.value = value;
    }

    public String overCome() {
        return "overCome";
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return overCome() + " Let ";
    }
}
