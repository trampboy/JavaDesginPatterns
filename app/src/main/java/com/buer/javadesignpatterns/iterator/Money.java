package com.buer.javadesignpatterns.iterator;

/**
 * Created by TrampBoy on 2015/2/23.
 */
public class Money{
    int value;
    boolean isTrue = false;

    Money(int value, boolean isTrue) {
        this.value = value;
        this.isTrue = isTrue;
    }

    public int getValue() {
        return value;
    }

    public boolean isTrue() {
        return isTrue;
    }
}
