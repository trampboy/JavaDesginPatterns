package com.buer.javadesignpatterns.creational.singleton;

/**
 * Created by Administrator on 2015/2/16.
 */
public class Moon {
    private static Moon mSingle;
    private double mRadius;

    private Moon() {
        mRadius = 1738;
    }

    public static synchronized Moon getInstance() {
        if (mSingle == null) {
            mSingle = new Moon();
        }
        return mSingle;
    }

    public void show() {
        System.out.println("月球半径：" + mRadius);
    }
}
