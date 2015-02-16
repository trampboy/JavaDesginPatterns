package creational.singleton;

/**
 * Created by Administrator on 2015/2/16.
 */
public class Client {
    public static void main(String args[]) {
        Moon moon = Moon.getInstance();
        moon.show();
    }
}
