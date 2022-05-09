package AnimalRescuer;

public class Dog extends Animal{

    @Override
    public void animalSound() {
        System.out.println("woof");
    }

    public void angry(){
        System.out.println("grr grr grr bites");
    }
}


