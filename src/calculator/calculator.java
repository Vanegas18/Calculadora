package calculator;

public class calculator {

    public static void main(String[] args) throws 
    Exception{
        subclassCalc cal = new subclassCalc();

        cal.hacerOperacion();
        System.out.println(cal.result);
        cal.repeatOp();
    }
}