package com.buer.javadesignpatterns.composite;

import java.util.Iterator;

/**
 * Created by TrampBoy on 2015/3/15.
 */
public class MilitarySolider implements MilitaryPerson{
    private String mName;
    private double mSalary;

    public MilitarySolider(String mName, double mSalary) {
        this.mName = mName;
        this.mSalary = mSalary;
    }

    @Override
    public void add(MilitaryPerson militaryPerson) {}

    @Override
    public void remove(MilitaryPerson militaryPerson) {}

    @Override
    public Iterator<MilitaryPerson> getAllChildren() {
        return null;
    }

    @Override
    public boolean isLeaf() {
        return true;
    }

    @Override
    public void setSalary(double salary) {
        this.mSalary = salary;
    }

    @Override
    public double getSalary() {
        return mSalary;
    }

    @Override
    public void setName(String name) {
        this.mName = name;
    }

    @Override
    public String getName() {
        return mName;
    }
}
