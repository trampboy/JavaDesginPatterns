package com.buer.javadesignpatterns.creational.abstracfactory;

/**
 * Created by Administrator on 2015/2/10.
 */
public class MachineGunFactory extends ArmFactory {
    @Override
    public Gun createGun() {
        return new MachineGun();
    }

    @Override
    public Bullet createBullet() {
        return new MachineBullet();
    }
}
