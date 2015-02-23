package adapter;

/**
 * Created by TrampBoy on 2015/2/23.
 */
public class ThreeElectricAdapter extends ThreeElectricOutlet {
    TwoElectricCurrent twoElectricCurrent;

    public void setTwoElectricCurrent(TwoElectricCurrent twoElectricCurrent) {
        this.twoElectricCurrent = twoElectricCurrent;
    }

    @Override
    public void connectElectricCurrent() {
        twoElectricCurrent.connectElectricCurrent();
    }
}
