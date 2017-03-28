package com.buer.javadesignpatterns.creational.builder;

/**
 * Created by Administrator on 2015/2/10.
 */
public class Product {
    String triangle;
    String square;
    String circle;

    @Override
    public String toString() {
        return "triangle=" + triangle + ",square=" + square + ",circle" + circle;
    }
}
