package paquete02;

public abstract class Docente {
    private String nombre;
    private double sueldo;
    
    public Docente(String n){
        nombre = n;
    }
    
    public void establecerDocente(String n){
        nombre = n;
    }
    
    public String obtenerDocente(){
        return nombre;
    }
    
    /*
    public abstract void obtenerSueldo(double d){
        sueldo = d;
    }*/
    
    public abstract void obtenerSueldo(double d);
    
}
