
package herencia3;

public class EstudiantePresencial extends Estudiante{
    
    int numeroCreditos;
    double costoCredito;
    double matriculaPresencial;
    double promedio;
    
    public EstudiantePresencial(String n, String ap, String iden, int e,
            int numCred, double costoCred, double prom){
        super(n, ap, iden, e);
        costoCredito = costoCred;
        numeroCreditos = numCred;
        promedio = prom;
    }
    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNumeroCreditos(numero: Real)
    public void establecerNumeroCreditos(int numero){
        numeroCreditos = numero;
    }
    
    // 3.  Método establecerCostoCredito(valor: Real)
    public void establecerCostoCredito(double valor){
        costoCredito = valor;
    }

    // 4.  Método calcularMatriculaPresencial()
    public void calcularMatriculaPresencial(){
        matriculaPresencial = numeroCreditos * costoCredito;
    }

    public void establecerPromedio(double valor){
        promedio = valor;
    }
    
    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroCreditos() : Entero
    public int obtenerNumeroCreditos(){
        return numeroCreditos; 
    }

    // 6. Método obtenerCostoCredito() : Real
    public double obtenerCostoCredito(){
        return costoCredito;
    }

    // 7. Método obtenerMatriculaPresencial() : Real
    public double obtenerMatriculaPresencial(){
        return matriculaPresencial;
    }
    
    public double obtenerPromedio(){
        return promedio;
    }
    
    @Override
    public String toString(){
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s"
                + "Costo Crédito: %.2f\n"
                + "Número de Créditos: %d\n"
                + "Total Matricula: %.2f\n"
                + "Promedio:  %.2f\n",
                cadenaFinal,
                obtenerCostoCredito(),
                obtenerNumeroCreditos(),
                obtenerMatriculaPresencial(),
                obtenerPromedio());
        
        return cadenaFinal;
    }
}
