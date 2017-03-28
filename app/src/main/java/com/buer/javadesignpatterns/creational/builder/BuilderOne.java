package com.buer.javadesignpatterns.creational.builder;

/**
 * Created by Administrator on 2015/2/10.
 */
public class BuilderOne extends Builder {
    private Product mProduct;

    public BuilderOne() {
        mProduct = new Product();
    }

    @Override
    public void buildTriangle() {
        mProduct.triangle = "BuilderOne Triangle";
    }

    @Override
    public void buildSquare() {
        mProduct.square = "BuilderOne Square";
    }

    @Override
    public void buildCircle() {
        mProduct.circle = "BuilderOne Circle";
    }

    @Override
    public Product getProduct() {
        return mProduct;
    }
}
