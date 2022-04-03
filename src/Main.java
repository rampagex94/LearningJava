import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//LAB9 ex 1. Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
        System.out.println("Hello \n"+"Silviu" );
        System.out.println();

// LAB9 ex 2. Printati rezultatul sumei a doua numere(orice numere)
        System.out.println(5+5);
        System.out.println();

// LAB9 ex 3. Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.
        System.out.println(6 / 2.7f);
        System.out.println();

//  LAB9 ex 4a. -5 + 8 * 6
        System.out.println(-5 + 8 * 6);
        System.out.println();

//  LAB9 ex 4b. (55+9) % 9
        System.out.println((55+9) % 9 );
        System.out.println();

//  LAB9 ex 4c. 20 + -3*5 / 8
        System.out.println(20 + -3*5f / 8 );
        System.out.println();

//  LAB9 ex 4d. 5 + 15 / 3 * 2 - 8 % 3
        System.out.println(5 + 15 / 3 * 2 - 8 % 3 );
        System.out.println();

// LAB10 ex1.
        printMyName();
        System.out.println(sum1(5,5));
        System.out.println(divide(6,2.7));
        System.out.println(operation(5,8,6));
        System.out.println(operationA(55,9,9));
        System.out.println(operationB(20,3,5,8));
        System.out.println(operationC(5,15,3,2,8,3));
        System.out.println();

//  LAB10 ex2.
        System.out.println("The sum of the numbers is: " + sum(50,30));
        System.out.println("The substraction of the numbers is: " + sub(80,40));
        System.out.println("The multiplication of the numbers is: " + mul(5,5));
        System.out.println("The division of the numbers is: " + div(10,5));
        System.out.println();

//  LAB10 ex3.
        JAVA();
        System.out.println();

//  LAB10 ex4
        System.out.println(method(8.3,5.6,13.2));
        System.out.println();

//  LAB10 ex5.
        robot();
        System.out.println();
//

//  LAB10 ex6.
        System.out.println(impartire(164.7,9));
        System.out.println();

//  LAB10 ex7.
        System.out.println(fahrenheit());
        System.out.println();

//  LAB10 ex8.
        System.out.println(inch());
        System.out.println();

//  LAB10 ex9.
        Scanner scanner = new Scanner(System.in);

        float timeSeconds;
        float mps,kph, mph;

        System.out.print("Input distance in meters: ");
        float distance = scanner.nextFloat();

        System.out.print("Input hour: ");
        float hr = scanner.nextFloat();

        System.out.print("Input minutes: ");
        float min = scanner.nextFloat();

        System.out.print("Input seconds: ");
        float sec = scanner.nextFloat();

        timeSeconds = (hr*3600) + (min*60) + sec;
        mps = distance / timeSeconds;
        kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
        mph = kph / 1.609f;

        System.out.println("Your speed in meters/second is "+mps);
        System.out.println("Your speed in km/h is "+kph);
        System.out.println("Your speed in miles/h is "+mph);

        scanner.close();
        System.out.println();

    }

    public static void printMyName(){
        System.out.println("Hello\nSilviu");
    }

    public static int sum1 (int a, int b){
        int result  = a + b;
        return result;
    }

    public static double divide (int c, double d){
        double result = c / d;
        return result;
    }

    public static int operation (int one, int two, int three) {
        int result = -one + two * three;
        return result;
    }

    public static int operationA (int one, int two, int three){
        int result = (one + two) % 9;
        return result;
    }

    public static double operationB (int one, int two, double four, int five){
        double result = one + -two * four / five;
        return result;
    }

    public static int operationC(int one, int two, int three, int four, int five, int six){
        int result = one + two / three * four - five % six;
        return result;
    }

    public static int sum(int one, int two){
        int result = one + two;
        return result;
    }

    public static int sub(int one, int two){
        int result = one - two;
        return result;
    }

    public static int mul(int one, int two){
        int result = one * two;
        return result;
    }

    public static int div(int one, int two){
        int result = one / two;
        return result;
    }


    public static void JAVA(){
        System.out.println("    J    a  V     V  a");
        System.out.println("    J   a a  V   V  a a");
        System.out.println("J   J  aaaaa  VVV  aaaaa");
        System.out.println(" JJJ  a     a  V  a     a");
    }

    public static double method(double nOne, double ntwo, double nthree){
        double result = nOne % ntwo % nthree;
        return result;
    }

    public static void robot(){
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  |");
        System.out.println(" | '-' |");
        System.out.println(" +-----+ ");
    }

    public static double impartire(double one, int two){
        double result = one / two;
        return result;
    }

    public static double fahrenheit(){
        double result = (78 - 32) * 5/9f;
        return result;
    }

    public static double inch(){
        int inches = 20;
        double centimeter = 2.54 * inches;
        return centimeter;
    }

    // Sa-mi spui te rog cum se poate face aici sa returnez cele 3 valori (mps,kph si mph), dupa cate am cautat nu se poate returna mai mult de o valoare, sa mi confirmi de rog daca este asa.
//  Atunci unica solutie la exercitiul acesta este optiunea cu scanerul, sau array, nu?
//
//    public static double speed(){
//
//        double distance = 1150;
//        int hr = 4;
//        int min = 36;
//        int sec = 42;
//
//        double timeSeconds = (hr*3600) + (min*60) + sec;
//        double mps = distance / timeSeconds;
//        double kph = (distance / 1000f) / (timeSeconds / 3600f);
//        double mph = kph / 1.609f;
//        return 0;


}

