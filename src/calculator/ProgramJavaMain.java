package calculator;

public class ProgramJavaMain {

    public static void main(String[] args) {

        ProgramStart ps = new ProgramStart();
        Login login = new Login();
        if (login.isLoggedIn()) {
            ps.runProgram();
        }





    }
}
