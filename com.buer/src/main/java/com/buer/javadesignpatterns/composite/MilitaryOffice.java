package com.buer.javadesignpatterns.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by TrampBoy on 2015/3/15.
 */
public class MilitaryOffice implements MilitaryPerson{
    private ArrayList<MilitaryPerson> militaryPersons = new ArrayList<MilitaryPerson>();
    private double mSalary;
    private String mName;

    public MilitaryOffice(String name, double mSalary) {
        this.mName = name;
        this.mSalary = mSalary;
    }

    @Override
    public void add(MilitaryPerson militaryPerson) {
        militaryPersons.add(militaryPerson);
    }

    @Override
    public void remove(MilitaryPerson militaryPerson) {
        militaryPersons.remove(militaryPerson);
    }

    @Override
    public Iterator<MilitaryPerson> getAllChildren() {
        return militaryPersons.iterator();
    }

    @Override
    public boolean isLeaf() {
        return false;
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
