package com.buer.javadesignpatterns.creational.builder;

/**
 * Created by Administrator on 2015/2/10.
 */
public class BuilderTwo extends Builder {
    private Product mProduct;

    public BuilderTwo() {
        mProduct = new Product();
    }

    @Override
    public void buildTriangle() {
        mProduct.triangle = "BuilderTwo Triangle";
    }

    @Override
    public void buildSquare() {
        mProduct.square = "BuilderTwo Square";
    }

    @Override
    public void buildCircle() {
        mProduct.circle = "BuilderTwo Circle";
    }

    @Override
    public Product getProduct() {
        return mProduct;
    }
}
