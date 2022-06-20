/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
    public abstract void obtenerSueldo(double d){
        sueldo = d;
    }
}
