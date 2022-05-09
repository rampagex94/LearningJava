package calculator;

import java.util.ArrayList;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {

        LogicalOperations op = new LogicalOperations();
        Calculator calc = new Calculator();


       String text = "FastTrackIT";
       int number = 9;
        System.out.println(calc.sum(2,3.5));
        System.out.println(calc.sub(7,2));
        System.out.println(calc.div(20,5));
        System.out.println(calc.mul(5,5));

//         Tema if else
        int biggest = op.checkBiggerNumber(5, 3);
        System.out.println("The bigger number is " +biggest);
        System.out.println(op.correctText("FastTrackIT"));
        System.out.println(op.checkTextAndNumber(text, number));
        System.out.println(op.Amount(9));
        System.out.println(op.bigAndSmall(4));
        System.out.println(op.isNumberEven(3));
        System.out.println(op.isEligibleToVote(19));
        System.out.println(op.giveBiggestNumber(16,33,32));
        op.printNumber(6);

//        Tema For Loops
          op.count100(0);
          op.count(0);
          op.count2(8,53);
          op.count3(6,15);
          op.pare();
          op.impare();
          System.out.println(op.sum(1));
          System.out.println(op.media(1));
          op.asterisc();
          System.out.println();

//       Tema while loops
          op.count1(84);
          op.count2(-83);
          op.countBetween(3,20);
          op.countBetween2(9,15);
          op.pare1();
          op.impare1();
          op.sum();
          System.out.println(op.divide7(131,637));
          op.fibonacci();
          op.cozaLozaWoza();
          System.out.println();

//        Tema Arrays

        op.countTo100(100); // <- Arrays ex 2
        System.out.println();
        op.drawLines(); // <- Arrays ex 7
        System.out.println();

//         Tema Lists

        List<Integer> integerList = op.getList();
        op.printList(integerList); // <- Lists ex 1
        System.out.println();
        op.lastNumberToList(integerList, 4); // <- Lists ex 2
        System.out.println();
        op.printListFromInput(integerList,75); // <- Lists ex 3
        System.out.println();
        List<Integer> descendantList = op.getList();
        op.printListDescendant(descendantList); // <- Lists ex 4
        System.out.println();
        List<Integer> printListContent = op.getList();
        op.printListContent(printListContent); // <- Lists ex 7
        System.out.println();
        List<Integer> biggestNumberInList = op.getList();
        System.out.println(op.getBiggestValueFromList(op.getList())); // <- Lists ex 8




    }


}













