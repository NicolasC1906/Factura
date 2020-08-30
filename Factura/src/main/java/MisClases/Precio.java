package MisClases;

public class Precio {
    //Atributos start//
    String Nombre_Cliente;
    int Codigo_Asesor;
    //Atributos end//
    
    //Metodo Constructor start//    
    public Precio(String Nuevo_Cliente, int AsesorCliente)
    {
     Nombre_Cliente=Nuevo_Cliente;
     Codigo_Asesor=AsesorCliente;
    }    
    //Metodo Constructor end//
    
    public void imprimir()
    {
        System.out.println("Nombre del cliente es: "+Nombre_Cliente);
        System.out.println("Nombre del asesor es: "+Codigo_Asesor);
    }
}
