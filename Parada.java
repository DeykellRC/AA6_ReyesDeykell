
/**
 * Write a description of class Parada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Parada{
    private String codigo;
    private String nombre;

    public Parada(String pCodigo, String pNombre) {
        codigo = pCodigo;
        nombre = pNombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        String msg = "Parada\n";
        msg += "  Codigo: " + codigo + "\n";
        msg += "  Nombre: " + nombre;
        return msg;
    }

}