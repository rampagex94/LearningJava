package AnimalRescuer;

public class AppMain {

    public static void main(String[] args) {
       Dog constantin = new Dog();
       int x = 3;
       System.out.println("Varsta catelului este de " + constantin.ageInMonths + " de luni");

       constantin.name = "Trex";
       constantin.race = "";
        System.out.println(constantin.name);
        constantin.run();

        Dog const2 = new Dog();
        System.out.println(constantin.name);
        System.out.println(const2.name);

    }



}

