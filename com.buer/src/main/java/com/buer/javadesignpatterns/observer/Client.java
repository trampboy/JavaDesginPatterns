package com.buer.javadesignpatterns.observer;

/**
 * Created by TrampBoy on 2015/2/16.
 */
public class Client {
    public static void main(String args[]) {
        SeekJobCenter seekJobCenter = new SeekJobCenter();
        UniversityStudent universityStudent = new UniversityStudent(seekJobCenter);
        seekJobCenter.setProductName("apple");
        seekJobCenter.setProductName("apple");
        seekJobCenter.setProductName("mac");
    }
}
