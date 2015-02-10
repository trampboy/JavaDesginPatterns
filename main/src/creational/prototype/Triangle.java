package creational.prototype;

/**
 * Created by Administrator on 2015/2/10.
 */
public class Triangle implements Prototype, Cloneable {
    double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public Object cloneMe() throws CloneNotSupportedException {
        return (Triangle) clone();
    }
}
