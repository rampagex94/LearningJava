package AnimalRescuer;

public class Dog {

    private String color;
    private double weight;
    private int ageInMonths;
    private String ownerName;
    private String race;
    private String name;
    private boolean isFemale;
    private int health;
    private int hunger;
    private int mood;
    private String favFood;
    private String favHobby;

// Getters and Setters beginning

    // color
    public String getColor() {
        return this.color; // this. keyword will be making reference to the class level attribute
    }

    public void setColor(String color) {
        this.color = color;
    }

    //weight
    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //ageInMonths
    public int getAgeInMonths() {
        return this.ageInMonths;
    }

    public void setAgeInMonths(int ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    //ownerName
    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    //race
    public String getRace() {
        return this.race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    //name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //isFemale
    public boolean getIsFemale() {
        return this.isFemale;
    }

    public void setIsFemale(boolean isFemale) {
        this.isFemale = isFemale;
    }

    //health
    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    //hunger
    public int getHunger() {
        return this.hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    //mood
    public int getMood() {
        return this.mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    //favfood
    public String getFavFood() {
        return this.favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    //favhobby
    public String getFavHobby() {
        return this.favHobby;
    }

    public void setFavHobby(String favHobby) {
        this.favHobby = favHobby;
    }

//    Getters and Setters end


    public void eat() {
        System.out.println("Eating dog food");
    }

    public void sleep() {
        System.out.println("zZzZzzZz");
    }

    public void run() {
        System.out.println("Running");
    }

    public void play() {
        System.out.println("Playing");
    }
}
