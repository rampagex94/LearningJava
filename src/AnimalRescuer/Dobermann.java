package AnimalRescuer;

public class Dobermann extends Dog{

    @Override
    public void bark() {
        System.out.println("Dobermann barks");
    }

    @Override
    public void animalSound() {
        System.out.println("Dobbermann goes wof wof");
    }

    public void angry() {
        System.out.println("Dobermann goes grrrr");
    }

}
