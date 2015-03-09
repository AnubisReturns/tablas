
package tablas;

import java.util.*;
public class Tablas {

   
    public static void main(String[] args) {
       Scanner lec = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");
        n = lec.nextInt();
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=10; i++){
             System.out.println(n + " * " + i + " = " + n*i);
        }
    }
    
}
