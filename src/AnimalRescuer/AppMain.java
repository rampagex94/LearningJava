package AnimalRescuer;

public class AppMain {

    public static void main(String[] args) {
       Dog Athena = new Dog();

        System.out.println("Varsta catelului este de " + Athena.ageInMonths + " de luni");
        System.out.println("The dog's weight is " + Athena.weight + " kilograms");
        System.out.println("The dog's color is " + Athena.color);
        System.out.println("The dog's owner name is" + Athena.ownerName);
        System.out.println("The dog's race is " + Athena.race);
        System.out.println("The dog's name is " +Athena.name);
        System.out.println("From a scale from 1 to 10, dog's health is " + Athena.health);
        System.out.println("From a scale from 1 to 10, dog's hunger is " +Athena.hunger);
        System.out.println("From a scale from 1 to 10, dog's mood is " + Athena.mood);
        System.out.println("The dog's favorite food is " + Athena.favFood);
        System.out.println("The dog's favorite hobby is " + Athena.favHobby);

        DogFood Pedigree = new DogFood();

        System.out.println("The dog loves the " + Pedigree.foodName + " brand");
        System.out.println("The price for the food is " + Pedigree.foodPrice + "$");
        System.out.println("The bowl quantity is " + Pedigree.foodQuantity + " grams");

        Girl Lisa = new Girl();

        System.out.println("The dog's owner name is " + Lisa.ownerName);
        System.out.println("Lisa has got " + Lisa.availableCash + "$ available for veterinarian care");

        Veterinarian Jack = new Veterinarian ();

        System.out.println("Veterinarian's name is " + Jack.name);
        System.out.println("Jack's speciality is " + Jack.speciality);



//       constantin.name = "Trex";
//       constantin.race = "";
//        System.out.println(constantin.name);
//        constantin.run();
//
//        Dog const2 = new Dog();
//        System.out.println(constantin.name);
//        System.out.println(const2.name);


    }



}

