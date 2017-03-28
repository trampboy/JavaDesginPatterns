package com.buer.javadesignpatterns.decorator;

/**
 * Created by TrampBoy on 2015/2/23.
 */
public class Client {
    public static void main(String[] args){
        Animal human = new Human();
        System.out.println("Human can run " + human.run());
        Animal superHuman = new SuperHuman(human);
        System.out.println("SuperHuman can run " + superHuman.run());
        Animal moreSuperHuman = new SuperHuman(superHuman);
        System.out.println("moreSuperHuman can run " + moreSuperHuman.run());
    }
}
