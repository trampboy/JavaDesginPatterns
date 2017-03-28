package com.buer.javadesignpatterns.creational.abstracfactory;

/**
 * Created by Administrator on 2015/2/4.
 */
public class Client {
    public static void main(String args[]) {
        ArmFactory handGunBullet = new HandGunFactory();
        Gun handGun = handGunBullet.createGun();
        Bullet handBullet = handGunBullet.createBullet();
        System.out.println("handGun:" + handGun.getName());
        System.out.println("handBullet:" + handBullet.getName());
        ArmFactory machineFactory = new MachineGunFactory();
        Gun machineGun = machineFactory.createGun();
        Bullet machineBullet = machineFactory.createBullet();
        System.out.println("machineGun:" + machineGun.getName());
        System.out.println("machineBullet:" + machineBullet.getName());
    }
}
