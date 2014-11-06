
package boletin7ej4;
import java.util.Scanner;

public class Boletin7ej4 {

    
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    CuentasPersonas aux = new CuentasPersonas();
    CuentasPersonas cp = new CuentasPersonas();
    CuentasPersonas cp2 = new CuentasPersonas ();
        System.out.println("Introduce el nombre de la primera persona:");
    cp.setNombre(sc.next());
        System.out.println("Introduce su peso:");
    cp.setPeso(sc.nextFloat());
        System.out.println("Introduce el nombre de la segunda persona:");
    cp2.setNombre(sc.next());
        System.out.println("Introduce su peso:");
    cp2.setPeso(sc.nextFloat());
    aux.comparar(cp,cp2);
    }
    
}
