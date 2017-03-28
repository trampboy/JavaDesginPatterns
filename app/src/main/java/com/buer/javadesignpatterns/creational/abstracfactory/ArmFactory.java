package com.buer.javadesignpatterns.creational.abstracfactory;

/**
 * Created by TrampBoy on 2015/2/4.
 */
public abstract class ArmFactory {
    public abstract Gun createGun();

    public abstract Bullet createBullet();
}
