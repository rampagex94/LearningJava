package calculator;

public class Main3 {

    public static void main(String[] args) {

       String text = "FastTrackIT";
       int number = 9;


        Calculator calc = new Calculator ();
        System.out.println(calc.sum(2,3.5));
        System.out.println(calc.sub(7,2));
        System.out.println(calc.div(20,5));
        System.out.println(calc.mul(5,5));

        LogicalOperations op = new LogicalOperations ();
        int biggest = op.checkBiggerNumber(5,3);
        System.out.println("The bigger number is " +biggest);
        System.out.println(op.correctText("FastTrackIT"));
        System.out.println(op.checkTextAndNumber(text, number));
        System.out.println(op.Amount(9));
        System.out.println(op.bigAndSmall(4));
        System.out.println(op.isNumberEven(3));
        System.out.println(op.isEligibleToVote(19));
        System.out.println(op.giveBiggestNumber(16,33,32));
        op.printNumber(6);


    }
}












