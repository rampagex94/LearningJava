package calculator;

import java.util.HashMap;
import java.util.Scanner;

public class Login {

    public boolean isLoggedIn() {

        Scanner scan = new Scanner(System.in);
        String username = "admin";
        String password = "admin";

        System.out.println("Username: ");
        String givenUsername = scan.next();
        System.out.println("Password: ");
        String givenPassword = scan.next();


        if (username.equals(givenUsername) && password.equals(givenPassword)){
            System.out.println(Messages.SUCCESSFUL_LOGIN);
            return true;
        } else {
            System.out.println(Messages.UNSUCCESSFUL_LOGIN);
            return false;
        }
    }

    public boolean loginSuccessful() {
        boolean repeat;
        int count = 0;
        do {
            repeat = isLoggedIn();
            count++;
        } while (!repeat && count <= 2);
        System.out.println(Messages.LOGIN_ATTEMPTS_EXCEEDED);
        return repeat;
    }
}




