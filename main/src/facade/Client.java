package facade;

/**
 * Created by TrampBoy on 2015/2/23.
 */
public class Client {
    public static void main(String[] args){
        String advertisement = "TrampBoy，26岁，性别男，爱好女";
        ClientServerFacade clientServerFacade = new ClientServerFacade(advertisement);
        clientServerFacade.doAdvertisement();
    }
}
