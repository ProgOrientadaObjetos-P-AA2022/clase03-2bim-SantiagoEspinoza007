/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

/**
 *
 * @author reroes
 */
public class Docente extends Persona{
    private double sueldo;
    
    public Docente(String n, String a, int e, double mat){
        super(n, a, e);
        setSueldo(mat);
    }
    
        
    public void setSueldo(double mat){
        sueldo = mat;
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
        
    @Override
    public String toString(){
    
        return String.format("%s - %f", super.toString(), getSueldo());
    }
}
