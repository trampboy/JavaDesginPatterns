package com.buer.javadesignpatterns.facade;

/**
 * Created by TrampBoy on 2015/2/23.
 */
public class ChargeWord {
    CheckWord mCheckWord;
    public ChargeWord(CheckWord checkWord) {
        this.mCheckWord = checkWord;
    }

    public void charge(){
        System.out.println("广告费用：" + mCheckWord.getAmount() * 12 +"元");
    }
}
