package com.buer.javadesignpatterns.strategy;

import java.util.Arrays;

/**
 * Created by TrampBoy on 2015/2/23.
 */
public class ComputerOne extends ComputerStrategy {
    @Override
    public int computer(int[] arrayList) {
        if (arrayList == null || arrayList.length <= 0) return 0;
        int result = 0;
        for(int i = 0; i < arrayList.length ; i++){
            result += arrayList[i];
        }
        return result / arrayList.length;
    }
}
