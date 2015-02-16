package command;

/**
 * Created by TrampBoy on 2015/2/16.
 */
public class ConcreteCommand implements Command {
    private Army mArmy;

    public ConcreteCommand(Army army) {
        this.mArmy = army;
    }

    @Override
    public void excute() {
        mArmy.attack();
    }
}
