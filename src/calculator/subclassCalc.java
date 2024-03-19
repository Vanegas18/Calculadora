package calculator;

public class subclassCalc  extends superclassCalc{
    
    public subclassCalc(){
        super();
    }

    public void hacerOperacion(){
        switch (op) {
            case '+':
                result = calSum();
                break;
            case '-':
                result = calRes();
                break;
            case '*':
                result = calMult();
                break;
            case '/':
                result = calDiv();
                break;
            default: break;
        }
    }

    public int calSum(){
        return this.getX() + this.getY();
    }
    public int calRes(){
        return this.getX() - this.getY();
    }
    public int calMult(){
        return this.getX() * this.getY();
    }
    public int calDiv(){
        int n = this.getY();
        if (n == 0) {
            return 0;
        }
        return this.getX() / n;
    }

}
