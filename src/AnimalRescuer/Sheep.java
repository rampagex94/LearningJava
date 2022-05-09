package AnimalRescuer;

public abstract class Sheep extends Animal {
    @Override
    public abstract void animalSound();

    public void angry() {
        System.out.println("beeeeh stomps");
    }
}
