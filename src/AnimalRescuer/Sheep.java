package AnimalRescuer;

public abstract class Sheep extends Animal {

    public abstract void animalSound();
    public abstract void angry();

    @Override
    public void sleep() {
        System.out.println("ZzzZzzzZZzz");
    }
}
