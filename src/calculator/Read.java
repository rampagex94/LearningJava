package calculator;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Read {

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
