package AnimalRescuer;

public class AppMain {

    public static void main(String[] args) {

    Dog Athena = new Dog();

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

        DogFood dogfood = new DogFood();
        dogfood.setFoodName("Pedigree");
        dogfood.setFoodPrice(13);
        dogfood.setFoodQuantity(8.5);
        dogfood.setFoodStock(true);

        Girl girl = new Girl();
        girl.setOwnerName("Lisa");
        girl.setAvailableCash(500);

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.setName("Jack");
        veterinarian.setSpeciality("Veterinarian");

        System.out.println("The veterinarian's name is " + veterinarian.getName());
        System.out.println("Varsta catelului este de " + dog.getAgeInMonths() + " de luni");
        System.out.println("The dog's weight is " + dog.getWeight() + " kilograms");
        System.out.println("The dog's color is " + dog.getColor());
        System.out.println("The dog's owner name is" + dog.getOwnerName());
        System.out.println("The dog's race is " + dog.getRace());
        System.out.println("The dog's name is " + dog.getName());
        System.out.println("From a scale from 1 to 10, dog's health is " + dog.getHealth());
        System.out.println("From a scale from 1 to 10, dog's hunger is " + dog.getHunger());
        System.out.println("From a scale from 1 to 10, dog's mood is " + dog.getMood());
        System.out.println("The dog's favorite food is " + dog.getFavFood());
        System.out.println("The dog's favorite hobby is " + dog.getFavHobby());
        System.out.println("The dog loves the " + dogfood.getFoodName() + " brand");
        System.out.println("The price for the food is " + dogfood.getFoodPrice() + "$");
        System.out.println("The bowl quantity is " + dogfood.getFoodQuantity() + " grams");
        System.out.println("The dog's owner name is " + girl.getOwnerName());
        System.out.println("Lisa has got " + girl.getAvailableCash() + "$ available for veterinarian care");
        System.out.println("Veterinarian's name is " + veterinarian.getName());
        System.out.println("Jack's speciality is " + veterinarian.getSpeciality());
        System.out.println("The dog's favourite hobby is to play " + dog.getFavHobby());


    }


}

