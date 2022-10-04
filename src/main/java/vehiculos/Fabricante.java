package vehiculos;
import java.util.ArrayList; // Para las listas

public class Fabricante {

    public static ArrayList<Fabricante> listado = new ArrayList<Fabricante>();
    private String nombre;
    private Pais pais;
    public int vendidos=0;

    public Fabricante(String nombre, Pais pais) {
        super();
        this.nombre = nombre;
        this.pais = pais;
        this.vendidos = 0;
        listado.add(this);
    }

    // Set y Get
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Pais getPais() {
        return pais;
    }

    public void setVendidos(int vendidos) {
        this.vendidos = vendidos;
    }

    public int getVendidos() {
        return vendidos;
    }

    // Método
    public static Fabricante fabricaMayorVentas() {
        Fabricante vendedor = null;
        int vendidos=0;
        for (Fabricante fabricante: listado) {
            if(fabricante.vendidos>vendidos) {
                vendidos = fabricante.vendidos;
                vendedor = fabricante;
            }
        }
        return vendedor;
    }
}