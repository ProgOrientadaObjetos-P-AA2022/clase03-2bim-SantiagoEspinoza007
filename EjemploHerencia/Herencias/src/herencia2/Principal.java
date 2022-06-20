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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Un menú
        // Opcion 1: Ingresa estudiante
        // Opcion 2: Ingresa docente
        // Opcion 3: Ingresa policia
        // Cualquier otra opción; un mensaje de error
        
        
        Estudiante e = new Estudiante("René", "Elizalde", 33, 100.2);
        System.out.println(e);
       
        // Un docente hereda de una Persona y adicionalmente tiene 
        // la característia sueldo
        Docente d = new Docente("Luis", "Alvarez", 40, 1000); // falta implementar
        System.out.println(d);
        
        // Un policia hereda de una Persona y adicionalmente tiene 
        // la característia rango
        Policia p = new Policia("ALEX", "MENDOZA", 35, "Cabo"); // falta implementar
        System.out.println(p);
        
    }
    
}
