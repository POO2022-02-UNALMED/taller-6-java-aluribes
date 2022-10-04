package vehiculos;
import java.util.ArrayList; // Para las listas

public class Pais {

    public static ArrayList<Pais> lista = new ArrayList<Pais>();
    private String nombre;
    public int vendidos=0;

    public Pais(String nombre) {
        super();
        this.nombre = nombre;
        this.vendidos = 0;
        lista.add(this);
    }

    // Set y Get
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setVendidos(int vendidos) {
        this.vendidos = vendidos;
    }
    
    public int getVendidos() {
        return vendidos;
    }
    
    // Método
    public static Pais paisMasVendedor() {
        Pais vendedor = null;
        int vendidos=0;
        for (Pais pais: lista) {
            if(pais.vendidos>vendidos) {
                vendidos = pais.vendidos;
                vendedor = pais;
            }
        }
        return vendedor;
    }
}