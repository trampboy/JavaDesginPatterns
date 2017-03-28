package com.buer.javadesignpatterns.composite;

import java.util.Iterator;

/**
 * Created by TrampBoy on 2015/3/15.
 */
public interface MilitaryPerson {
    public void add(MilitaryPerson militaryPerson);
    public void remove(MilitaryPerson militaryPerson);
    public Iterator<MilitaryPerson> getAllChildren();
    public boolean isLeaf();
    public void setSalary(double salary);
    public double getSalary();
    public void setName(String name);
    public String getName();
}
