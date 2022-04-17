package AnimalRescuer;

public class AppMain {

    public static void main(String[] args) {

//   Dog Athena = new Dog();

        Dog dog = new Dog();
        dog.setColor("black");
        dog.setWeight(29);
        dog.setAgeInMonths(36);
        dog.setOwnerName("Lisa");
        dog.setRace("Dobermann");
        dog.setName("Athena");
        dog.setIsFemale(true);
        dog.setHealth(10);
        dog.setHunger(8);
        dog.setMood(8);
        dog.setFavFood("Chicken");
        dog.setFavHobby("Fetch");

        System.out.println(dog.getFavFood());
        System.out.println("The dog's mood on a scale from 1 to 10 is " + dog.getMood());
        System.out.println("The dog's owner name is " + dog.getOwnerName());

        DogFood dogfood = new DogFood();
        dogfood.setFoodName("Pedigree");
        dogfood.setFoodPrice(13);
        dogfood.setFoodQuantity(8.5);
        dogfood.setFoodStock(true);

        System.out.println("The dog's favorite food is " + dogfood.getFoodName());

        Girl girl = new Girl();
        girl.setOwnerName("Lisa");
        girl.setAvailableCash(500);

        System.out.println("The girls available money for the dog's expenses is " + girl.getAvailableCash() + " dollars");

        Hobby hobby = new Hobby();
        hobby.setHobby("Fetch");

        System.out.println("The dog loves to play " + hobby.getHobby());

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.setName("Jack");
        veterinarian.setSpeciality("Veterinarian");

        System.out.println("The veterinarian's name is " + veterinarian.getName());


//        System.out.println("Varsta catelului este de " + Athena.ageInMonths + " de luni");
//        System.out.println("The dog's weight is " + Athena.weight + " kilograms");
//        System.out.println("The dog's color is " + Athena.color);
//        System.out.println("The dog's owner name is" + Athena.ownerName);
//        System.out.println("The dog's race is " + Athena.race);
//        System.out.println("The dog's name is " +Athena.name);
//        System.out.println("From a scale from 1 to 10, dog's health is " + Athena.health);
//        System.out.println("From a scale from 1 to 10, dog's hunger is " +Athena.hunger);
//        System.out.println("From a scale from 1 to 10, dog's mood is " + Athena.mood);
//        System.out.println("The dog's favorite food is " + Athena.favFood);
//        System.out.println("The dog's favorite hobby is " + Athena.favHobby);

//        DogFood Pedigree = new DogFood();
//        System.out.println("The dog loves the " + Pedigree.foodName + " brand");
//        System.out.println("The price for the food is " + Pedigree.foodPrice + "$");
//        System.out.println("The bowl quantity is " + Pedigree.foodQuantity + " grams");
//
//        Girl Lisa = new Girl();
//        System.out.println("The dog's owner name is " + Lisa.ownerName);
//        System.out.println("Lisa has got " + Lisa.availableCash + "$ available for veterinarian care");
//
//        Veterinarian Jack = new Veterinarian ();
//        System.out.println("Veterinarian's name is " + Jack.name);
//        System.out.println("Jack's speciality is " + Jack.speciality);
//
//        Hobby Fetch = new Hobby ();
//        System.out.println("The dog's favourite hobby is to play fetch");


    }


}

