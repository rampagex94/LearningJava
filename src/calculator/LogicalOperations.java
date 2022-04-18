package calculator;

public class LogicalOperations {

    //Tema For Loops
    //1.
    public void count100(int a){
        for (int b = a; b <= 100; b++){
            System.out.println(b);
        }
    }

    //2.
    public void count(int a){
        for (int b = a; b >= -100; b--){
            System.out.println(b);
        }
    }

    //3.
    public  void count2(int a, int b){
        for (int x = a; x <= b; x++){
            System.out.println(x);
        }
       for (int x = a; x >= b; x--) {
           System.out.println(x);
       }
    }
    //4.
    public void count3(int a, int b){
        if(a < b){
            for(int x = a; x <= b; x++){
                System.out.println(x);
            }
        }else if (a > b) {
            for (int x = b; x <= a; x++){
                System.out.println(x);
            }
        }
    }

    //5.

    //  3.
    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    // 4
    public String correctText(String text) {
        if (text.equals("FastTrackIT")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    //5.
    public String checkTextAndNumber(String text, int number) {
        if (text.equals("FastTrackIT") && number <= 3){
            return text + number;
        } else if (!text.equals("FastTrackIT") && number >=4) {
            return number + text;
        } else {
            return "Error";
        }
    }

    //6.
    public String Amount(int number) {
        if (number > 8 || number == 6) {
            return "The amount of snow this winter was " + number + " cm";
        } else {
            return "The forecast snow is " + number + " cm";
        }
    }

    //7.
    public String bigAndSmall(int number) {
        if (number > 3 && number != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4) {
            return "The number is equal to 4";
        } else if (number < 3) {
            return "The number is lower than 3";
        } else {
            return "Error";
        }
    }

    //8.
    public void printNumber (int number) {
        switch (number) {
            case 0 -> System.out.println("The number is 0");
            case 1 -> System.out.println("The number is 1");
            case 2 -> System.out.println("The number is 2");
            case 3 -> System.out.println("The number is 3");
            case 4 -> System.out.println("The number is 4");
            case 5 -> System.out.println("The number is 5");
            case 6 -> System.out.println("The number is 6");
            case 7 -> System.out.println("The number is 7");
            case 8 -> System.out.println("The number is 8");
            case 9 -> System.out.println("The number is 9");
            default -> System.out.println("Error");
        }
    }

    //9.
    public boolean isNumberEven(int number) {
        if( number % 2 == 0 ) {
            return true;
        } else {
            return false;
        }

    }

    //10.
    public boolean isEligibleToVote(int number){
        if (number >= 18){
            return true;
        } else {
            return false;
        }
    }

    //11.
    public int giveBiggestNumber(int numberOne, int numberTwo, int numberThree){
        if (numberOne > numberTwo && numberOne > numberThree) {
            return numberOne;
        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            return numberTwo;
        } else {
            return numberThree;
        }
    }
}







