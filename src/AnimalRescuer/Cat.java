package AnimalRescuer;

public abstract class Cat extends Animal{

    public abstract void animalSound();
    public abstract void angry();
    public abstract void purr();

    @Override
    public void sleep() {
        System.out.println("zzZzzZzzzzZ");
    }


}
