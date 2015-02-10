package creational.prototype;

import java.io.*;
import java.util.Objects;

/**
 * Created by Administrator on 2015/2/10.
 */
public class Circle implements Prototype, Serializable {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public Object cloneMe() throws CloneNotSupportedException {
        Object object = null;
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(this);
            ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            object = objectInputStream.readObject();
        } catch (Exception e) {
            System.out.println(e);
        }
        return object;
    }
}
