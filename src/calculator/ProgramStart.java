package calculator;

import calculator.Calculator;
import calculator.Read;

public class ProgramStart {

    Calculator calc = new Calculator();
    Read read = new Read();
    LogicalOperations op = new LogicalOperations();

    public void printMenu(){
        System.out.println("Hello!\n" +
                "Please select an option:\n"+
                "1. Sum\n"+
                "2. Substraction\n"+
                "3. Multiplication\n"+
                "4. Division\n"+
                "5. ....\n"+
                "0. Exit\n"+
                "\n"+
                "Enter number:"

        );

    }

    public boolean runMenuOption() {
        printMenu();
        int option = read.getInt();
        switch (option) {
            case 0:
                System.out.println("Goodbye");
                return false;
            case 1:
                doSum();
                return true;
            case 2:
                doSub();
                return true;
            case 3:
                doMul();
                return true;
            case 4:
                doDiv();
                return true;

            default:
                System.out.println("Incorrect option, try again.");
                return true;
        }
    }
        public void runProgram(){
            boolean repeatProgram;
        do{
              repeatProgram = runMenuOption();
          }while (repeatProgram);
        }



    private void doSum(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("Sum result is: "+ calc.sum(first, second));
    }

    private void doSub(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("Substraction result is: "+ calc.sub(first, second));
    }

    private void doMul(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("Multiplication result is: "+ calc.mul(first, second));
    }

    private void doDiv() {
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("Division result is: " + calc.div(first, second));
    }

}
