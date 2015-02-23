package decorator;

/**
 * Created by TrampBoy on 2015/2/23.
 */
public class SuperHuman extends Decorator{
    private static final int DISTANCE = 500;
    private Animal mAnimal;
    protected SuperHuman(Animal animal) {
        super(animal);
        this.mAnimal = animal;
    }

    @Override
    public int run() {
        return mAnimal.run() + DISTANCE;
    }
}
