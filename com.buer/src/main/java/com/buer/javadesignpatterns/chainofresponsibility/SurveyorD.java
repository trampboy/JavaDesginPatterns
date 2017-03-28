package com.buer.javadesignpatterns.chainofresponsibility;

/**
 * Created by TrampBoy on 2015/2/23.
 */
public class SurveyorD implements Handler{
    private static final String NAME = "D";
    private Handler mHandler;
    @Override
    public void handleRequest(String name) {
        if (NAME.equals(name)) {
            System.out.println("鉴定该商品是" + NAME);
        }else{
            System.out.println("该商品不是" + NAME + "，继续鉴定");
            if(mHandler != null) mHandler.handleRequest(name);
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.mHandler = handler;
    }
}
