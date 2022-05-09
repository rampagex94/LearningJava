package AnimalRescuer;

public abstract class Dog extends Animal {

    public abstract void animalSound();

    @Override
    public void angry() {
        System.out.println("grr grr grr bites");
    }



}


