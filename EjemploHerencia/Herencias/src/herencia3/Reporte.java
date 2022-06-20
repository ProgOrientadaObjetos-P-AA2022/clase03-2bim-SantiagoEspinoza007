/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3;

/**
 *
 * @author reroes
 */
public class Reporte {

    protected String nombre;
    protected String carrera;
    protected String ciclo;
    
    public Reporte(String n, String c, String cic){
        nombre = n;
        carrera = c;
        ciclo = cic;
    }
    
    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCarrera(String n) {
        carrera = n;
    }

    public void establecerCiclo(String n) {
        ciclo = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCarrera() {
        return carrera;
    }

    public String obtenerCiclo() {
        return ciclo;
    }

}
