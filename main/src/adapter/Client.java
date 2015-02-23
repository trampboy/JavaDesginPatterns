package adapter;

/**
 * Created by TrampBoy on 2015/2/23.
 */
public class Client {
    public static void main(String[] args){
        ThreeElectricOutlet threeElectricOutlet;
        Wash wash = new Wash();
        threeElectricOutlet = wash;
        threeElectricOutlet.connectElectricCurrent();
        TV tv = new TV();
        ThreeElectricAdapter threeElectricAdapter = new ThreeElectricAdapter();
        threeElectricAdapter.setTwoElectricCurrent(tv);
        threeElectricOutlet = threeElectricAdapter;
        threeElectricOutlet.connectElectricCurrent();
    }
}
