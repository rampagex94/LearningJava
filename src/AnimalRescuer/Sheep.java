package AnimalRescuer;

public abstract class Sheep extends Animal {
    @Override

    public abstract void animalSound();
    public abstract void angry();

    public void sleep() {
        System.out.println("ZzzZzzzZZzz");
    }
}
