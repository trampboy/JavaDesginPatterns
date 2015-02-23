package decorator;

/**
 * Created by TrampBoy on 2015/2/23.
 */
public class Human extends Animal{
    private static final int DISTANCE = 100;
    @Override
    public int run() {
        return DISTANCE;
    }
}
