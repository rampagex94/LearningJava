package calculator;

import java.awt.*;
import java.util.HashMap;
import java.util.Scanner;

public class Login {

    public boolean isLoggedIn() {

        Scanner scan = new Scanner(System.in);
        String username = "Mr.Robot";
        String password = "p455w0rd";

        System.out.println("Username:");
        String givenUsername = scan.next();
        System.out.println("Password:");
        String givenPassword = scan.next();


        if (username.equals(givenUsername) && password.equals(givenPassword)) {
            System.out.println("Logged in!");
            return true;
        } else {
            System.out.println("Incorrect username or password, please try again.");
            return false;
        }


    }
}
