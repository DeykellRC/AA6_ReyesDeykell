
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Persona {
    public static final String CONDICION_REGULAR = "regular";
    public static final String CONDICION_ESTUDIANTE = "estudiante";
    public static final String CONDICION_CIUDADANO_ORO = "ciudadano de oro";
    private static final double SIN_DESCUENTO = 0.0;
    private static final double DESCUENTO_ESTUDIANTE = 0.5;
    private static final double DESCUENTO_CIUDADANO_ORO = 1.0;

    private String nombre;
    private String condicion;

    public Persona(String pNombre, String pCondicion) {
        nombre = pNombre;
        condicion = pCondicion;
    }

    public Persona(String pNombre) {
        this(pNombre, CONDICION_REGULAR);
    }

    public String getNombre() {
        return nombre;
    }

    public String getCondicion() {
        return condicion;
    }
    
    public double getPorcentajeDescuento() {
    if (condicion.equalsIgnoreCase(CONDICION_ESTUDIANTE)) return DESCUENTO_ESTUDIANTE;
    if (condicion.equalsIgnoreCase(CONDICION_CIUDADANO_ORO)) return DESCUENTO_CIUDADANO_ORO;
    return SIN_DESCUENTO;
    }

    public String toString() {
        String msg = "Persona\n";
        msg += "  Nombre: " + nombre + "\n";
        msg += "  Condicion: " + condicion;
        return msg;
    }
}