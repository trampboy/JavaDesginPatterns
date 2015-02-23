package chainofresponsibility;

/**
 * Created by TrampBoy on 2015/2/23.
 */
public interface Handler {
    public abstract void handleRequest(String name);
    public abstract void setNextHandler(Handler handler);
}
