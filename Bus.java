
/**
 * Write a description of class Bus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Bus {
    public static final String PREFIJO_CODIGO = "BUS-";
    private static final String SIN_RUTA = "(sin ruta asignada)";
    private static final double SIN_DESCUENTO = 0.0;
    private static final double DESCUENTO_ESTUDIANTE = 0.5;
    private static final double DESCUENTO_CIUDADANO_ORO = 1.0;
    private static final double PORCENTAJE_TOTAL = 1.0;

    private static int cantidadBuses;

    private String codigo;
    private String placa;
    private int capacidad;
    private double totalRecaudado;
    private int personasAtendidas;
    private Ruta miRuta;

    public Bus(String pPlaca, int pCapacidad) {
        cantidadBuses++;
        codigo = PREFIJO_CODIGO + cantidadBuses;
        placa = pPlaca;
        capacidad = pCapacidad;
    }

    public void asignarRuta(Ruta pRuta) {
        if (pRuta != null) {
            miRuta = pRuta;
        }
    }

    public void cobrarPasaje(Persona pPersona) {
        if (miRuta == null) return;
        totalRecaudado += miRuta.getTarifa() * (PORCENTAJE_TOTAL - pPersona.getPorcentajeDescuento());
        personasAtendidas++;
    }

    public String consultarNombreRuta() {
        if (miRuta == null) return SIN_RUTA;
        return miRuta.getNombre();
    }

    public String getCodigo() {
        return codigo;
    }

    public static int getCantidadBuses() {
        return cantidadBuses;
    }

    public String toString() {
        String msg = "Bus\n";
        msg += "  Codigo: " + codigo + "\n";
        msg += "  Placa: " + placa + "\n";
        msg += "  Capacidad: " + capacidad + "\n";
        msg += "  Ruta: " + consultarNombreRuta() + "\n";
        msg += "  Personas atendidas: " + personasAtendidas + "\n";
        msg += "  Total recaudado: " + totalRecaudado + " colones";
        return msg;
    }
}