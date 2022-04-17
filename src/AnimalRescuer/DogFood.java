package AnimalRescuer;

public class DogFood {
  private String foodName; // = "Pedigree";
  private int foodPrice; // = 13;
  private double foodQuantity; // = 8.5;
  private boolean foodStock; //  = true;

// Getters and Setters beginning

   public String getFoodName(){
     return this.foodName;
   }
   public void setFoodName(String foodName){
     this.foodName = foodName;
   }

   public int getFoodPrice(){
       return this.foodPrice;
   }
   public void setFoodPrice(int foodPrice){
       this.foodPrice = foodPrice;
   }

   public double getFoodQuantity(){
       return this.foodQuantity;
   }
   public void setFoodQuantity(double foodQuantity){
       this.foodQuantity = foodQuantity;
   }

   public boolean getFoodStock(){
       return this.foodStock;
   }
   public void setFoodStock(boolean foodStock){
       this.foodStock = foodStock;
   }
//    Getters and Setters end
}
