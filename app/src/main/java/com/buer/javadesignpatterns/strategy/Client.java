package com.buer.javadesignpatterns.strategy;

/**
 * Created by TrampBoy on 2015/2/23.
 */
public class Client {
    public static void main(String[] args){
        ComputerStrategy computerOne = new ComputerOne();
        ComputerStrategy computerTwo = new ComputerTwo();
        ComputerContext computerContext = new ComputerContext();
        computerContext.setmComputerStrategy(computerOne);
        int[] arrayList = new int[]{3,1,6,8,10,7,21};
        System.out.println("computerOne " + computerContext.getComputerResult(arrayList));
        computerContext.setmComputerStrategy(computerTwo);
        System.out.println("computerTwo " + computerContext.getComputerResult(arrayList));
    }
}
