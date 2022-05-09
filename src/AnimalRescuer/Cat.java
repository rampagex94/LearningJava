package AnimalRescuer;

public class Cat extends Animal{

    @Override
    public void animalSound() {
        System.out.println("Meow");
    }

    public void angry() {
        System.out.println("meeoww scratches");
    }

}
