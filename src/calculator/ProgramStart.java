package calculator;

import calculator.Calculator;
import calculator.Read;

public class ProgramStart extends MenuOptions{

    Calculator calc = new Calculator();
    Read read = new Read();
    LogicalOperations op = new LogicalOperations();

    public void printMenu(){
        System.out.println(Messages.PRINT_MENU);
    }

    public boolean runMenuOption() {
        printMenu();
        int option = read.getInt();
        switch (option) {
            case 0:
                System.out.println(Messages.EXIT_MESSAGE);
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
                System.out.println(Messages.INCORRECT_OPTION);
                return true;
        }
    }
        public void runProgram(){
            boolean repeatProgram;
        do{
              repeatProgram = runMenuOption();
          }while (repeatProgram);
        }




}
