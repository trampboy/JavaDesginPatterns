package command;

/**
 * Created by TrampBoy on 2015/2/16.
 */
public class Client {
    public static void main(String args[]) {
        ConcreteCommand concreteCommand = new ConcreteCommand(new Army());
        ArmySuperior armySuperior = new ArmySuperior(concreteCommand);
        armySuperior.startAttack();
    }
}
