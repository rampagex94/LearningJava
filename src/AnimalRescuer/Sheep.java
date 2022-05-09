package AnimalRescuer;

public class Sheep extends Animal {
    @Override
    public void animalSound() {
        System.out.println("Beeeeh");
    }

    public void angry() {
        System.out.println("beeeeh stomps");
    }
}
