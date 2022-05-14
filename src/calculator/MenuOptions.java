package calculator;

public class MenuOptions {
    Calculator calc = new Calculator();
    Read read = new Read();

    public void doSum(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println(Messages.SUM_RESULT + calc.sum(first, second));
    }

    public void doSub(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println(Messages.SUB_RESULT + calc.sub(first, second));
    }

    public void doMul(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println(Messages.MUL_RESULT + calc.mul(first, second));
    }

    public void doDiv() {
        int first = read.getInt();
        int second = read.getInt();
        System.out.println(Messages.DIV_RESULT + calc.div(first, second));
    }


}
