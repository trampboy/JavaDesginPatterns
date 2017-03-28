package com.buer.javadesignpatterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by TrampBoy on 2015/2/16.
 */
public class UniversityStudent implements Observer {
    private SeekJobCenter mSeekJobCenter;

    public UniversityStudent(SeekJobCenter seekJobCenter) {
        this.mSeekJobCenter = seekJobCenter;
        mSeekJobCenter.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof SeekJobCenter) {
            System.out.println("获取消息：" + ((SeekJobCenter) o).getmProductName());
        }
    }
}
