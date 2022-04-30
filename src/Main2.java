public class Main2 {

    public static void main(String[] args) {

        double result = sum(5, 5);
        System.out.println(result);
        System.out.println("Rezultatul este: " + sum(3, 5));

        int result2 = sub(5,4);
        System.out.println(result2);

        int result3 = mul(5,5);
        System.out.println(result3);
        //     System.out.println("The result is: " + multiply(5,5));

        double result4 = div (357, 22.3);
        System.out.println(result4);

    }

    public static int sum (int a, int b){
        return a + b;
    }

    public static int sub (int a, int b){
        return a - b;
    }

    public static int mul (int a, int b){
        return a * b;
    }

    public static double div (int a, double b){
        return a / b;
    }


}

