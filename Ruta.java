import java.util.ArrayList;

/**
 * Write a description of class Ruta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Ruta {
    private static final int HORA_MINIMA = 0;
    private static final int HORA_MAXIMA = 23;
    private static final int MINUTO_MINIMO = 0;
    private static final int MINUTO_MAXIMO = 59;
    private static final int MINUTO_POR_OMISION = 0;
    private static final String COMA_ESPACIO = ", ";

    private String codigo;
    private String nombre;
    private double tarifa;
    private ArrayList<Parada> misParadas;
    private ArrayList<HorarioSalida> misSalidas;

    public Ruta(String pCodigo, String pNombre, double pTarifa) {
        codigo = pCodigo;
        nombre = pNombre;
        tarifa = pTarifa;
        misParadas = new ArrayList<Parada>();
        misSalidas = new ArrayList<HorarioSalida>();
    }

    public void agregarParada(Parada pParada) {
        if (pParada != null && !existeParada(pParada)) {
            misParadas.add(pParada);
        }
    }

    public void registrarSalida(int pHora, int pMinuto) {
        if (esHorarioValido(pHora, pMinuto)) {
            misSalidas.add(new HorarioSalida(pHora, pMinuto));
        }
    }

    public void registrarSalida(int pHora) {
        registrarSalida(pHora, MINUTO_POR_OMISION);
    }

    public String consultarNombresParadas() {
        String msg = "";
        for (int i = 0; i < misParadas.size(); i++) {
            if (i > 0) {
                msg += COMA_ESPACIO;
            }
            msg += misParadas.get(i).getNombre();
        }
        return msg;
    }

    public String consultarHorariosSalida() {
        String msg = "";
        for (int i = 0; i < misSalidas.size(); i++) {
            if (i > 0) {
                msg += COMA_ESPACIO;
            }
            msg += misSalidas.get(i).toString();
        }
        return msg;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTarifa() {
        return tarifa;
    }

    private boolean existeParada(Parada pParada) {
        return misParadas.contains(pParada);
    }

    private boolean esHorarioValido(int pHora, int pMinuto) {
        return pHora >= HORA_MINIMA && pHora <= HORA_MAXIMA
            && pMinuto >= MINUTO_MINIMO && pMinuto <= MINUTO_MAXIMO;
    }

    public String toString() {
        String msg = "Ruta\n";
        msg += "  Codigo: " + codigo + "\n";
        msg += "  Nombre: " + nombre + "\n";
        msg += "  Tarifa: " + tarifa + " colones " + "\n";
        msg += "  Paradas: " + consultarNombresParadas() + "\n";
        msg += "  Horarios de salida registrados: " + misSalidas.size();
        for (HorarioSalida h : misSalidas) {
            msg += "\n    - " + h.toString();
        }
        return msg;
    }
}