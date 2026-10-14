
/**
 * Write a description of class Piso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piso {

    private static int cantidadPisos = 0;
    private int numeroPiso;
    private double area;
    private int capacidad;
    private String uso;
    
    public Piso(double pArea, int pCapacidad, String pUso) {
        cantidadPisos++;
        numeroPiso = cantidadPisos;
        area = pArea;
        capacidad = pCapacidad;
        uso = pUso;
    }
    
    public int getNumeroPiso(){
        return numeroPiso;
    }
    
    public double getArea(){
        return area;
    }
    
    public int getCapacidad(){
        return capacidad;
    }
    
    public String getUso(){
        return uso;
    }
    
    public static int getCantidadPisos(){
        return cantidadPisos;
    }
    
    void setNumeroPiso(int pNumeroPiso){
        numeroPiso = pNumeroPiso;
    }
    
    public String toString(){
        String msg = "Piso #" + numeroPiso + " | ";
        msg += "Área: " + area + " m2 | ";
        msg += "Capacidad: " + capacidad + " | ";
        msg += "Uso: " + uso;
        return msg;
    }
}  
    
    
    
    
