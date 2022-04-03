package calculator;

public class Main3 {

    public static void main(String[] args) {


//       System.out.println(getMax(12,41));
//
//       System.out.println(verifyTextFastTrack("FastTrack"));
//
//
//        String text = "FastTrack";
//        int number = 2;
//
//        System.out.println(verifyTextAndNumber(text,number));

//        System.out.println(number(20));

        int snow = 5;
        System.out.println(snow);

    }


//    public static int number (int number) {
//        if (number >= 2 && number <= 8) {
//        }
//            return number;
//        }


    public static String snowAmount(String text, int snow){
        if (snow > 8 && snow == 6){
            return "The amount of snow this winter was:" + snow + "cm";
        }else {

            return "The forecast snow  is" + snow + "cm";
        }
    }
//    public static int getMax(int first, int second) {
//        if (first > second) {
//            return first;
//        } else {
//            return second;
//        }
//    }
//
//    public static String verifyTextFastTrack(String text) {
//        if (text.equals("FastTrack")) {
//            return "learning text comparison";
//        } else {
//            return "Got to try some more";
//        }
//    }
//
//    public static String verifyTextAndNumber(String text, int number){
//        if (text.equals("FastTrack") && number <= 3) {
//            return  text + number;
//        } else if (!text.equals("FastTrack") && number >= 4) {
//            return number + text;
//        } else {
//            return "";
//        }
//   }
}
