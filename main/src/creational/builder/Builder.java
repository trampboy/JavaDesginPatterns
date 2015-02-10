package creational.builder;

/**
 * Created by Administrator on 2015/2/10.
 */
public abstract class Builder {
    public abstract void buildTriangle();

    public abstract void buildSquare();

    public abstract void buildCircle();

    public abstract Product getProduct();
}
