package MisClases;

public class Factura extends Precio {
    String Articulo;
    float Precio;
    
    public Factura (String Nuevo_Cliente, int AsesorCliente, String NuevoArticulo, float ValorArticulo)
    {
        super(Nuevo_Cliente,AsesorCliente);
        Articulo=NuevoArticulo;
        Precio = ValorArticulo;
    }
     public void imprimir()
    {
        System.out.println("El Nombre del cliente es: "+Nombre_Cliente);
        System.out.println("El Codigo del asesor es: "+Codigo_Asesor);
        System.out.println("El Nombre del articulo es: "+Articulo);
        System.out.println("El valor del articulo es: "+Precio);
    }
}
