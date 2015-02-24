package mediator;

/**
 * Created by TrampBoy on 2015/2/24.
 */
public interface User {
    public void publishMess(String mess);
    public void receiverMess(String mess);
    public void setName(String name);
    public String getName();
}
