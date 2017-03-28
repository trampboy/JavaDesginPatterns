package com.buer.javadesignpatterns.adapter;

/**
 * Created by TrampBoy on 2015/2/23.
 */
public class TV extends TwoElectricCurrent {
    @Override
    public void connectElectricCurrent() {
        System.out.println("电视机开始");
    }
}
