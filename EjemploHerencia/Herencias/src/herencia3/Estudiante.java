
package herencia3;

public class Estudiante {
    // 1.  Declarar
    // se declaran datos o atributos con visibilidad protegido
    // # nombresEstudiante: Cadena
    protected String nombresEstudiante;
    // # apellidosEstudiante: Cadena
    protected String apellidosEstudiante;
    // # identificacionEstudiante: Cadena
    protected String identificacionEstudiante;
    // # edadEstudiante: Entero
    protected int edadEstudiante;
    
    
    public Estudiante(String n, String a, String iden, int ed){
        nombresEstudiante = n;
        apellidosEstudiante = a;
        identificacionEstudiante = iden;
        edadEstudiante = ed;
    }
    
    //  Métodos establecer y calcular para los datos o atributos de la clase
    
    // 2.  Método establecerNombresEstudiante(nom: Cadena)
    public void establecerNombresEstudiante(String nom){
        nombresEstudiante = nom;
    }
  
    // 3.  Método establecerApellidoEstudiante(ape: Cadena)
    public void establecerApellidoEstudiante(String ape){
        apellidosEstudiante = ape;
    }
    
    // 4.  Método establecerIdentificacionEstudiante(iden: Cadena)
    public void establecerIdentificacionEstudiante(String iden){
        identificacionEstudiante = iden;
    }

    // 5.  Método establecerEdadEstudiante(ed: Edad)
    public void establecerEdadEstudiante(int ed){
        edadEstudiante = ed;
    }
    
    //  Métodos obtener para los datos o atributos de la clase
    // 6.  Método obtenerNombresEstudiante() : Cadena
    public String obtenerNombresEstudiante(){
        return nombresEstudiante;  
    }
 
    //7.  Método obtenerApellidoEstudiante() : Cadena
    public String obtenerApellidoEstudiante(){
        return apellidosEstudiante; 
    }

    // 8. Método obtenerIdentificacionEstudiante() : Cadena
    public String obtenerIdentificacionEstudiante(){
        return identificacionEstudiante; 
    }

    // 9.  Método obtenerEdadEstudiante() : Entero
    public int obtenerEdadEstudiante(){
        return edadEstudiante;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Identificación: %s\n"
                + "Edad: %s\n", 
                nombresEstudiante,
                apellidosEstudiante,
                identificacionEstudiante,
                edadEstudiante);
        
        return cadena;
    }
    

}
