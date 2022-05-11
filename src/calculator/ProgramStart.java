package calculator;

import calculator.Calculator;
import calculator.Read;

public class ProgramStart {

    Calculator calc = new Calculator();
    Read read = new Read();

    public void printMenu(){
        System.out.println("Hello!\n" +
                "Please select and option:\n"+
                "1. Sum\n"+
                "2. Substraction\n"+
                "3. ....\n"+
                "4. ....\n"+
                "5. ....\n"+
                "0. Exit\n"

        );

    }

    public void runMenuOption() {
        int option = read.getInt();
        switch (option){
            case 1:
                doSum();
                break;
            case 2:
                doSub();
                break;

        }

    }

    private void doSum(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("Suma este: "+ calc.sum(first, second));
    }

    private void doSub(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("Scaderea este: "+ calc.sub(first, second));
    }




}
