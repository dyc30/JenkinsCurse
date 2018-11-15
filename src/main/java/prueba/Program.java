package prueba;

public class Program {

    /**
    * Esta es la documentacion de este cacho programa que es capaz de SUMAR 2 numeros por increible que parezca,
     * incluso de restarlos :$
    */
    public Program() {
    }
    /**
     * Y esta es la gran funcion que hace todo el trabajo !!!
     */
    public int suma(int op1, int op2) {
        return op1 + op2;
    }
    /**
     * Y esta es la otra gran funcion que hace todo el trabajo !!!
     */
    public int resta(int op1, int op2) {
        return op1 - op2;
    }
    public static void main(String[] args) {
        int op1 = Integer.parseInt(args[0]);
        int op2 = Integer.parseInt(args[1]);
        System.out.println(new Program().suma(op1, op2));
    }
}
