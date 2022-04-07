package calculator;

public class LogicalOperations {

    //  1.
    public int getMax(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    // 2.
    public String verifyTextFastTrack(String text) {
        if (text.equals("FastTrack")) {
            return "learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    // 3.
    public int number(int first) {
        if (first >= 2 && first <= 8) {
            return first;
        } else {
            return 0;
        }
    }

    //4.
    public String verifyTextAndNumber(String text, int number) {
        if (text.equals("FastTrack") && number <= 3) {
            return text + number;
        } else if (!text.equals("FastTrack") && number >= 4) {
            return number + text;
        } else {
            return "";
        }
    }
}



