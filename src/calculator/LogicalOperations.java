package calculator;

import java.util.ArrayList;
import java.util.List;

public class LogicalOperations {


    //Tema Lists

    public List<Integer> getList() {
        List<Integer> myList = new ArrayList<>();
        for (int i = -1; i <100 ; i++) {
            myList.add(i + 1);
        }
        return myList;
    }

    //1.
    public void printList(List<Integer> List) {
        for (int i = 0; i <List.size(); i++) {
            System.out.println(List.get(List.get(i)));
        }
    }

    //2.
    public void lastNumberToList (List<Integer> List, int number){
        List.add(number);
    }

    //3.
    public void printListFromInput (List<Integer> List, int number){
       for (int i = number; i < List.size(); i++){
           System.out.println(List.get(i));
       }
    }

    //4.
    public void printListDescendant (List<Integer> List){
        for (int i = List.size() -1; i >= 0; i--){
            System.out.println(List.get(i));
        }
    }

    //5.
    public void stringList(List<String> List, int number, String text){
        List.add(number, text);
    }

    //6.
    public void secondParametertoFirstPos(List<Integer> List, int number){
        List.add(3, number);
    }

    //7.
    public void printListContent (List<Integer> List){
        for (int i = 0; i < List.size(); i++) {
            System.out.println("Pe pozitia " +i+ " valoarea este " + List.get(i));
        }
    }

    //8.
    public int getBiggestValueFromList (List<Integer> myList){
        int biggest = myList.get(0);
        for (int i=0 ; i<myList.size(); i++){
            if (myList.get(i)>biggest){
                biggest = myList.get(i);
            }
        }
        return biggest;
    }

    //Tema Arrays
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + ", ");
        }
    }

    //2.
    public void countTo100(int max) {
        int[] myArray = new int[max];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
            System.out.print(myArray[i] + ", ");
        }
    }

    //3.
    public int[] getEvenArrayToHundred(int[] evenArray) {
        int j = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenArray[j] = i;
                j++;
            }
        }
        return evenArray;
    }

    //4.
    public float getAverageArray(int[] myArray) {
        float sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        return (sum / myArray.length);
    }

    //5.
    public boolean checkInArray(String[] arrString, String input) {
        for (int i = 0; i < arrString.length; i++) {
            if (arrString[i].equals(input)) {
                return true;
            }
        }
        return false;
    }

    //6.
    public int getPositionInArray(int[] Numbers, int nr) {
        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] == nr) {
                return i;
            }
        }
        return 0;
    }

    //7.
    public void drawLines() {
        char[] line = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-',};
        for (int i = 0; i <= 10; i++) {
            System.out.println(line);
        }
    }

    //8.
    public int[] removeNrFromArray(int[] myArray, int nr) {
        int[] secondArray = new int[myArray.length];
        int j = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == nr)
                continue;
            secondArray[j++] = myArray[i];
        }
        int[] finArray = new int[j];
        for (int i = 0; i < j; i++)
            finArray[i] = secondArray[i];
        return finArray;
    }

    //9.
    public int getSecondSmallestNrInArray(int[] myArray) {
        int temporary = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    temporary = myArray[j];
                    myArray[j] = myArray[i];
                    myArray[i] = temporary;
                }
            }
        }
        return myArray[1];
    }

    //10.
    public int[] copyArray(int[] firstArray, int[] emptyArray) {
        for (int i = 0, j = 0; i < firstArray.length; i++) {
            emptyArray[j] = firstArray[i];
            j++;
        }
        return emptyArray;
    }


    //Tema For Loops
    //1.
    public void count100(int a) {
        for (int b = a; b <= 100; b++) {
            System.out.println(b);
        }
    }

    //2.
    public void count(int a) {
        for (int b = a; b >= -100; b--) {
            System.out.println(b);
        }
    }

    //3.
    public void count2(int a, int b) {
        for (int x = a; x <= b; x++) {
            System.out.println(x);
        }
        for (int x = a; x >= b; x--) {
            System.out.println(x);
        }
    }

    //4.
    public void count3(int a, int b) {
        if (a < b) {
            for (int x = a; x <= b; x++) {
                System.out.println(x);
            }
        } else if (a > b) {
            for (int x = b; x <= a; x++) {
                System.out.println(x);
            }
        }
    }

    //5.
    public void pare() {
        for (int x = 0; x <= 100; x = x + 2) {
            System.out.println(x);
        }
    }

    //6.
    public void impare() {
        for (int x = 0; x <= 100; x++) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
        }
    }

    //7.
    public int sum(int a) {
        int sum = 0;
        for (int x = a; x <= 100; x++) {
            sum += x;
        }
        return sum;
    }

    //8.
    public int media(int a) {
        int sum = 0;
        int counter = 0;
        for (int x = a; x <= 100; x++) {
            sum += x;
            counter++;
        }
        return sum / counter;
    }

    //9.
    public void asterisc() {
        for (int x = 7; x >= 1; x--) {
            String text = "";
            for (int y = x; y >= 1; y--) {
                text = text + "*";
            }
            System.out.println(text);
        }
    }

    //Tema While loops
    //1.
    public void count1(int x) {
        while (x <= 100) {
            System.out.println(x);
            x++;
        }
    }

    //2.
    public void count2(int x) {
        while (x >= -100) {
            System.out.println(x);
            x--;
        }
    }

    //3.
    public void countBetween(int x, int y) {
        while (x <= y) {
            System.out.println(x);
            x++;
        }
    }

    //4.
    public void countBetween2(int x, int y) {
        if (x < y) {
            while (x <= y) {
                System.out.println(x);
                x++;
            }
        } else if (y < x) {
            while (y <= x) {
                System.out.println(x);
                x++;
            }
        }
    }

    //5.
    public void pare1() {
        int x = 1;
        while (x <= 100) {
            x++;
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }
    }

    //6.
    public void impare1() {
        int x = 1;
        while (x <= 100) {
            x++;
            if (x % 2 != 0) {
                System.out.println(x);
            }
        }
    }

    //7.
    public void sum() {
        int x = 111;
        int y = 8899;
        double sum = 0;
        int count = 0;

        while (x <= y) {
            sum += x;
            x++;
            count++;
        }
        System.out.println(sum);
        double media = sum / count;
        System.out.println("Media este " + media);
    }

    //8.
    public double divide7(int x, int y) {
        int count = 0;
        int sum = 0;
        while (x <= y) {
            if (x % 7 == 0) {
                count++;
                sum += x;
            }
            x++;
        }
        double average = sum / count;
        return average;
    }

    //9.
    public void fibonacci() {
        int count = 20;
        int num1 = 0;
        int num2 = 1;

        int i = 1;
        while (i <= count) {
            System.out.println(num1 + " ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
    }

    //10.
    public void cozaLozaWoza() {
        int i = 1;
        while (i <= 110) {

            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.print("CozaLozaWoza ");

            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.print("WozaLoza ");

            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("CozaWoza ");

            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza ");

            } else if (i % 7 == 0) {
                System.out.print("Woza ");

            } else if (i % 5 == 0) {
                System.out.print("Loza ");

            } else if (i % 3 == 0) {
                System.out.print("Coza ");

            } else {
                System.out.print(i + " ");
            }

            if (i % 11 == 0) {
                System.out.println();
            }

            i++;

        }

    }


    // Tema if else
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
        if (text.equals("FastTrackIT") && number <= 3) {
            return text + number;
        } else if (!text.equals("FastTrackIT") && number >= 4) {
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
    public void printNumber(int number) {
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
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    //10.
    public boolean isEligibleToVote(int number) {
        if (number >= 18) {
            return true;
        } else {
            return false;
        }
    }

    //11.
    public int giveBiggestNumber(int numberOne, int numberTwo, int numberThree) {
        if (numberOne > numberTwo && numberOne > numberThree) {
            return numberOne;
        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            return numberTwo;
        } else {
            return numberThree;
        }
    }

    public void populateArrayToNumber(int max) {
        int[] myArray = new int[max];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }
    }
}










