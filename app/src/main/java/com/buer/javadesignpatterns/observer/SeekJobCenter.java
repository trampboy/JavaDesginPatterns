package com.buer.javadesignpatterns.observer;

import java.util.Observable;

/**
 * Created by TrampBoy on 2015/2/16.
 */
public class SeekJobCenter extends Observable {
    private String mProductName;

    public String getmProductName() {
        return mProductName;
    }

    public void setProductName(String productName) {
        if (mProductName == null || !mProductName.equals(productName)) {
            this.mProductName = productName;
            setChanged();
            notifyObservers();
        }
    }
}
