
/**
 * Write a description of class HorarioSalida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class HorarioSalida {
    private int hora;
    private int minuto;

    public HorarioSalida(int pHora, int pMinuto) {
        hora = pHora;
        minuto = pMinuto;
    }

    public String toString() {
        return String.format("%02d:%02d", hora, minuto);
    }
}