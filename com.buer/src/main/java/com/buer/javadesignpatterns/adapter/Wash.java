package com.buer.javadesignpatterns.adapter;

/**
 * Created by TrampBoy on 2015/2/23.
 */
public class Wash extends ThreeElectricOutlet {
    @Override
    public void connectElectricCurrent() {
        System.out.println("洗衣机开始");
    }
}
