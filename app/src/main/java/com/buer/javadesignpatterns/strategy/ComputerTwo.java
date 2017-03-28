package com.buer.javadesignpatterns.strategy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by TrampBoy on 2015/2/23.
 */
public class ComputerTwo extends ComputerStrategy{
    @Override
    public int computer(int[] arrayList) {
        if (arrayList == null || arrayList.length <= 0) return 0;
        int result = 0;
        Arrays.sort(arrayList);
        for (int i = 1; i< arrayList.length -1 ; i++) {
            result += arrayList[i];
        }
        return result / (arrayList.length - 2);
    }
}
