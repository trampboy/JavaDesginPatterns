package facade;

/**
 * Created by TrampBoy on 2015/2/23.
 */
public class ClientServerFacade {
    private CheckWord mCheckWord;
    private ChargeWord mChargeWord;

    public ClientServerFacade(String advertisement) {
        mCheckWord = new CheckWord(advertisement);
        mChargeWord = new ChargeWord(mCheckWord);
    }

    public void doAdvertisement(){
        mCheckWord.check();
        mChargeWord.charge();
    }
}
