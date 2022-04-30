import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//  Tema introducere in java
//  ex 1. Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
        System.out.println("Hello \n" + "Silviu");
        System.out.println();

// ex 2. Printati rezultatul sumei a doua numere(orice numere)
        System.out.println(5 + 5);
        System.out.println();

//  ex 3. Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.
        System.out.println(6 / 2.7f);
        System.out.println();

//  ex 4a. -5 + 8 * 6
        System.out.println(-5 + 8 * 6);
        System.out.println();

//  ex 4b. (55+9) % 9
        System.out.println((55 + 9) % 9);
        System.out.println();

//  ex 4c. 20 + -3*5 / 8
        System.out.println(20 + -3 * 5f / 8);
        System.out.println();

//  ex 4d. 5 + 15 / 3 * 2 - 8 % 3
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
        System.out.println();

//  Tema metode si obiecte
//  ex1.
        printMyName();
        System.out.println(sum1(5, 5));
        System.out.println(divide(6, 2.7));
        System.out.println(operation(5, 8, 6));
        System.out.println(operationA(55, 9, 9));
        System.out.println(operationB(20, 3, 5, 8));
        System.out.println(operationC(5, 15, 3, 2, 8, 3));
        System.out.println();

//  ex2.
        System.out.println("The sum of the numbers is: " + sum(50, 30));
        System.out.println("The substraction of the numbers is: " + sub(80, 40));
        System.out.println("The multiplication of the numbers is: " + mul(5, 5));
        System.out.println("The division of the numbers is: " + div(10, 5));
        System.out.println();

//  ex3.
        JAVA();
        System.out.println();

//  ex4
        System.out.println(method(8.3, 5.6, 13.2));
        System.out.println();

//  ex5.
        robot();
        System.out.println();
//

//  ex6.
        System.out.println(impartire(164.7, 9));
        System.out.println();

//  ex7.
        System.out.println(fahrenheit());
        System.out.println();

//  ex8.
        System.out.println(inch());
        System.out.println();

//  ex9.
        Scanner scanner = new Scanner(System.in);

        float timeSeconds;
        float mps, kph, mph;

        System.out.print("Input distance in meters: ");
        float distance = scanner.nextFloat();

        System.out.print("Input hour: ");
        float hr = scanner.nextFloat();

        System.out.print("Input minutes: ");
        float min = scanner.nextFloat();

        System.out.print("Input seconds: ");
        float sec = scanner.nextFloat();

        timeSeconds = (hr * 3600) + (min * 60) + sec;
        mps = distance / timeSeconds;
        kph = (distance / 1000.0f) / (timeSeconds / 3600.0f);
        mph = kph / 1.609f;

        System.out.println("Your speed in meters/second is " + mps);
        System.out.println("Your speed in km/h is " + kph);
        System.out.println("Your speed in miles/h is " + mph);

        scanner.close();
        System.out.println();

    }

    public static void printMyName() {
        System.out.println("Hello\nSilviu");
    }

    public static int sum1(int a, int b) {
        return a + b;
    }

    public static double divide(int c, double d) {
        return c / d;
    }

    public static int operation(int one, int two, int three) {
        return -one + two * three;
    }

    public static int operationA(int one, int two, int three) {
        return (one + two) % three;
    }

    public static double operationB(int one, int two, double four, int five) {
        return one + -two * four / five;
    }

    public static int operationC(int one, int two, int three, int four, int five, int six) {
        return one + two / three * four - five % six;
    }

    public static int sum(int one, int two) {
        return one + two;
    }

    public static int sub(int one, int two) {
        return one - two;
    }

    public static int mul(int one, int two) {
        return one * two;
    }

    public static int div(int one, int two) {
        return one / two;
    }


    public static void JAVA() {
        System.out.println("    J    a  V     V  a");
        System.out.println("    J   a a  V   V  a a");
        System.out.println("J   J  aaaaa  VVV  aaaaa");
        System.out.println(" JJJ  a     a  V  a     a");
    }

    public static double method(double nOne, double ntwo, double nthree) {
        return nOne % ntwo % nthree;
    }

    public static void robot() {
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  |");
        System.out.println(" | '-' |");
        System.out.println(" +-----+ ");
    }

    public static double impartire(double one, int two) {
        return one / two;
    }

    public static double fahrenheit() {
        return (78 - 32) * 5 / 9f;
    }

    public static double inch() {
        int inches = 20;
        return 2.54 * inches;
    }
}

