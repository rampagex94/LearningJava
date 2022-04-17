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

    public String getColor(){
        return this.color; // this. keyword will be making reference to the class level attribute
    }
    public void setColor(String color){
        this.color = color;
    }

    public double getWeight(){
        return this.weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    public int getageInMonths(){
        return this.ageInMonths;
    }
    public void setageInMonths(int ageInMonths){
        this.ageInMonths = ageInMonths;
    }

    public String getownerName(){
        return this.ownerName;
    }
    public void setownerName(String ownerName){
        this.ownerName = ownerName;
    }

    public String getrace(){
        return this.race;
    }
    public void setrace(String race){
        this.race = race;
    }


// Getters and Setters end
    public void eat (){
        System.out.println("Eating dog food");
    }

    public void sleep(){
        System.out.println("zZzZzzZz");
    }

    public void run(){
        System.out.println("Running");
    }

    public void play(){
        System.out.println("Playing");
    }
}
