package calculator;
import java.util.Scanner;

public class superclassCalc {

    private int val1;
    private int val2;
    private Scanner sc;
    public char op;
    public int result;

    public superclassCalc () {
        sc = new Scanner(System.in);
        System.out.println("ingresar primer numero:");
        setX(Integer.parseInt(sc.nextLine()));
        System.out.println("ingresar segundo numero:");
        setY(Integer.parseInt(sc.nextLine()));
        System.out.println("Escoge un operador (+ - * /): ");
        op = sc.nextLine().charAt(0);
    }


    public char valOp(){
    do{
        System.out.println( "Debes ingresar un operador valido:");
    } while(this.op != '+' && this.op != '-' && this.op != '*' && this.op != '/');
    return this.op;
    }

    public void repeatOp(){
        System.out.println( "¿Desea realizar otra operación (y|n): ");
        char nueva = sc.nextLine().charAt(0);

        if (nueva == 'y') {
            Limpiar();
            //Cualquier cosa
        }

        else{
            //Cualquier cosa
        }
    }

    public void Limpiar(){
        System.out.print( "\033|H|033|23");
        System.out.flush();
    }

    public void setX (int x){
        this.val1 = x;
    }

    public void setY (int y){
        this.val2 = y;
    }

    public int getX(){
        return this.val1;
    }

    public int getY(){
        return this.val2;
    }
}
