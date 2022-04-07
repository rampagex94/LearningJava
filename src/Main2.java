public class Main2 {
    static int memberVariable = 3;



    public static void main(String[] args) {

        double result = sum(memberVariable, 3.2);
        System.out.println(result * 2);
        System.out.println("Rezultatul este: " + sum(3, 5));

        int result2 = substract(5,4);
        System.out.println(result2);

        int result3 = multiply (5,5);
        System.out.println(result3);
        //     System.out.println("The result is: " + multiply(5,5));

        double result4 = divide (357, 22);
        System.out.println(result4);

    }





    public static double sum(int firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int substract(int firstNumber, int secondNumber){
        //     return firstNumber - secondNumber;
        int result = firstNumber - secondNumber;
        return result;
    }

    public static int multiply (int x, int y){
        return x * y;
        //       int result = x * y;
        //       return result;
    }

    public static double divide (double a, double b){
        double result = a / b;
        return result;
    }


}
