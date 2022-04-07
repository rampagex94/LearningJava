package calculator;

public class LogicalOperations {

    //  3.
    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    // 4
    public String checkText(String text) {
        if (text.equals("FastTrackIT")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    //5.
    public String verifyTextAndNumber(String text, int number) {
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
            return "The amount of snow this winter was " + number + "cm";
        } else {
            return "The forecast snow is " + number + "cm";
        }

    }

    //7.
    public String greaterThen(int number) {
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
}







