package AnimalRescuer;

public abstract class Cat extends Animal{

    public abstract void animalSound();

    @Override
    public void angry() {
        System.out.println("meeoww scratches");
    }

}
