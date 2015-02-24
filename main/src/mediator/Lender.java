package mediator;

/**
 * Created by TrampBoy on 2015/2/24.
 */
public class Lender implements User {
    private String mName;
    private ConcreteMediator mConcreteMediator;
    public Lender(ConcreteMediator concreteMediator) {
        this.mConcreteMediator = concreteMediator;
    }

    @Override
    public void publishMess(String mess) {
        mConcreteMediator.deliverMess(this, mess);
    }

    @Override
    public void receiverMess(String mess) {
        System.out.println(getName() + "收到信息");
        System.out.println("\t" + mess);
    }

    @Override
    public void setName(String name) {
        this.mName = name;
    }

    @Override
    public String getName() {
        return mName;
    }
}
