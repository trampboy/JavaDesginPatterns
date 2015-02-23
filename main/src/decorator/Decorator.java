package decorator;

/**
 * Created by TrampBoy on 2015/2/23.
 */
public abstract class Decorator extends Animal{
    private Animal mAnimal;
    protected Decorator(Animal animal) {
        this.mAnimal = animal;
    }
}
