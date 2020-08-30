
package MisClases;

import java.util.Scanner;

public class Principal {
    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cual es el nombre del cliente?");
        String nombre = entrada.nextLine();
        System.out.println("¿Cual es el articulo?");
        String articulo = entrada.nextLine();
        
        
        Factura ejemplo = new Factura (nombre, 2 ,articulo,1800);
        ejemplo.imprimir();
    }
    
}
