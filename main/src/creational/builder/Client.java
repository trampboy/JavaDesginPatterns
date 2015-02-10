package creational.builder;

/**
 * Created by Administrator on 2015/2/10.
 */
public class Client {
    public static void main(String args[]) {
        Builder builderOne = new BuilderOne();
        builderOne.buildTriangle();
        builderOne.buildSquare();
        builderOne.buildCircle();
        System.out.println("builderOne:" + builderOne.getProduct().toString());
        Builder builderTwo = new BuilderTwo();
        builderTwo.buildTriangle();
        builderTwo.buildSquare();
        builderTwo.buildCircle();
        System.out.println("builderTwo:" + builderTwo.getProduct().toString());
    }
}
