package command;

/**
 * Created by TrampBoy on 2015/2/16.
 */
public class ArmySuperior {
    Command mCommand;

    public ArmySuperior(Command command) {
        this.mCommand = command;
    }

    public void startAttack() {
        mCommand.excute();
    }

}
