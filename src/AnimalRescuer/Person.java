package AnimalRescuer;

public class Person {

    private String ownerName;
    private int availableCash;
    private String name;
    private String speciality;

    // Getters and Setters beginning
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getSpeciality(){
        return this.speciality;
    }
    public void setSpeciality(String speciality){
        this.speciality = speciality;
    }

    public String getOwnerName(){
        return this.ownerName;
    }
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public int getAvailableCash(){
        return this.availableCash;
    }
    public void setAvailableCash(int availableCash){
        this.availableCash = availableCash;
    }
    // Getters and Setters end

    public void talk() {
        System.out.println("Bla Bla");
    }




}

