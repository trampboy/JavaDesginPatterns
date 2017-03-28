package com.buer.javadesignpatterns.facade;

import java.awt.geom.IllegalPathStateException;

/**
 * Created by TrampBoy on 2015/2/23.
 */
public class CheckWord {
    String advertisement;
    int amount;
    public CheckWord(String advertisement) {
        if (advertisement == null) {
            throw new IllegalPathStateException("advertisement not be null");
        }
        this.advertisement = advertisement;
        amount = advertisement.length();
    }

    public void check(){
        System.out.println("检查发现该广告包含付费字数" + getAmount());
    }

    public int getAmount(){
        return amount;
    }
}
