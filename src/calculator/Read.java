package calculator;
import java.sql.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Read {

    //Tema Try-Catch
    //1.-------------------------------------------------------
    public int readInt(){
        boolean repeat = true;
        int number = 0;
        while(repeat){
            try {
                System.out.println("Please enter a number: ");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                repeat = false;
            }catch (InputMismatchException e){
                System.out.println("Invalid value, please enter a number: ");
            }finally {
                System.out.println("Thank you for asking for help!");
            }
        }
        return number;
    }

    //2.---------------------------------------------------------
    public double readDouble(){
        boolean repeat = true;
        double number = 0;
        while(repeat){
            try{
                System.out.print("Please enter a number: ");
                Scanner scanner =new Scanner(System.in);
                number = scanner.nextDouble();
                repeat = false;
            }catch (InputMismatchException e){
                System.out.println("Invalid value, please enter a number: ");
            }finally {
                System.out.println("Thank you for asking for help!");
            }
        }
        return number;
    }

    public float readFloat(){
        boolean repeat = true;
        float number = 0;
        while(repeat){
            try{
                System.out.print("Please enter a number: ");
                Scanner scanner =new Scanner(System.in);
                number = scanner.nextFloat();
                repeat = false;
            }catch (InputMismatchException e){
                System.out.println("Invalid value, please enter a number: ");
            }finally {
                System.out.println("Thank you for asking for help!");
            }
        }
        return number;
    }

    public String readString() {
        boolean repeat = true;
        String text = "";
        while (repeat) {
            try {
                System.out.print("Please enter a number: ");
                Scanner scanner = new Scanner(System.in);
                text = scanner.next();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number: ");
            } finally {
                System.out.println("Thank you for asking for help!");
            }
        }
        return text;
    }

    //3.-----------------------------------------------------------
    public int[] getPopulatedArray(int size){
        int[]array = new int[size];
        System.out.println("Populating the array with values.");
        for(int i = 0; i < size; i++){
            array[i] = readInt();
        }
        System.out.println("Array populated");
        return array;
    }

    //4.------------------------------------------------------------
    public List<Integer> getPopulatedList(){
        List<Integer> list = new ArrayList<>();
        while(true){
            try{
                System.out.println("Please enter a number: ");
                Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();
                list.add(number);
            }catch (InputMismatchException e){
                System.out.println("An invalid value was entered.");
                break;
            }
        }
        return list;
    }


    public int getInt(){
        int x = 0;
       boolean repeat = false;
       do {
           try {
               Scanner scan = new Scanner (System.in);
               x = scan.nextInt();
               repeat = false;
           } catch (InputMismatchException e) {
               System.out.println("Invalid value.");
               repeat = true;
           }
       }while (repeat == true);
       return x;
    }


    public int getIntsimple(){
        Scanner scan = new Scanner (System.in);
        int x;
        do {
            try {
                System.out.print("Please enter a number: ");
                x = scan.nextInt();
                return x;
            } catch (InputMismatchException e) {
                System.out.println("Given value '" + scan.nextLine() + "' is not valid.");
            }
        }while (true);

    }


    public List<Integer> getList(){
        List<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the numbers for the list: ");
        do{
            try {
                list.add(scan.nextInt());
            }catch (InputMismatchException e ){
                if(scan.nextLine().equalsIgnoreCase("q")){
                    break;
                }else {
                    System.out.println("Invalid value given");
                }
            }
        }while (true);
        return list;
    }


}
