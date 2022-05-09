package AnimalRescuer;

public abstract class Dog extends Animal {

    public abstract void bark();
    public abstract void animalSound();
    public abstract void angry ();

    @Override
    public void sleep() {
        System.out.println("zZzzZzzZz");
    }




}


