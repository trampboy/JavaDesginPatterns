package strategy;

/**
 * Created by TrampBoy on 2015/2/23.
 */
public class ComputerContext {
    private ComputerStrategy mComputerStrategy;

    public void setmComputerStrategy(ComputerStrategy mComputerStrategy) {
        this.mComputerStrategy = mComputerStrategy;
    }

    public int getComputerResult(int[] arrayList){
        if (mComputerStrategy == null) return 0;
        return mComputerStrategy.computer(arrayList);
    }
}
