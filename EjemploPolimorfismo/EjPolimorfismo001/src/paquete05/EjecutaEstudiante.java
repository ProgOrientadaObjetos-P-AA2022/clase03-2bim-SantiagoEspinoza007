package paquete05;

import java.util.ArrayList;
import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
         */
        Scanner entrada = new Scanner(System.in);
        String nombresEst = "";
        String apellidosEst = "";
        String identificacionEst = "";
        int edadEst = 0;
        double costoCred = 0;
        int numeroCreds = 0;
        double costoAsig = 0;
        int numeroAsigs = 0;
        int n = 0;
        int nPresencial = 0;
        int nDistancia = 0;
        int tipoEstudiante = 0;
        String continuar = "";
        int contador = 0;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        // inicio de solución
        System.out.println("¿Cuántos estudiantes de tipo "
                + "Presencial va a ingresar?");
        nPresencial = entrada.nextInt();
        System.out.println("¿Cuántos estudiantes de tipo "
                + "Distancia va a ingresar?");
        nDistancia = entrada.nextInt();
        entrada.nextLine();
        // se captura el valor ingresado por el usuario en 
        // la variable tipoEstudiante
        n = nPresencial + nDistancia;
        boolean ban = true, ban2 = true;
        int j = 0, k = 0;

        while (contador < n) {
            if (nPresencial != 0 && nDistancia == 0) {
                tipoEstudiante = 1;
            } else {
                if (nPresencial == 0 && nDistancia != 0) {
                    tipoEstudiante = 2;
                } else {
                    System.out.println("Tipo de Estudiante a ingresar\n"
                            + "Ingrese '1' para Estudiante Presencial\n"
                            + "Ingrese '2' para Estudiante Distancia");
                    tipoEstudiante = entrada.nextInt();
                    entrada.nextLine();

                    if (k >= nDistancia) {
                        System.out.println("Ya ha alcanzado el número máximo de "
                                + "estudiantes Distancia.\nSe ingresaran datos "
                                + "para un estudiante tipo: Presencial");
                        tipoEstudiante = 1;
                    }
                    if (j >= nPresencial) {
                        System.out.println("Ya ha alcanzado el número máximo de "
                                + "estudiantes Presencial.\nSe ingresaran datos "
                                + "para un estudiante tipo: Distancia");
                        tipoEstudiante = 2;
                    }
                }
            }

            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();
            
            if (tipoEstudiante == 1) {
                j = j + 1;
                EstudiantePresencial estudianteP = new EstudiantePresencial();
                System.out.println("Ingrese el número de créditos");
                numeroCreds = entrada.nextInt();
                System.out.println("Ingrese el costo de cada créditos");
                costoCred = entrada.nextDouble();
                entrada.nextLine();
                estudianteP.establecerNombresEstudiante(nombresEst);
                estudianteP.establecerApellidoEstudiante(apellidosEst);
                estudianteP.establecerIdentificacionEstudiante(identificacionEst);
                estudianteP.establecerEdadEstudiante(edadEst);
                estudianteP.establecerNumeroCreditos(numeroCreds);
                estudianteP.establecerCostoCredito(costoCred);
                estudiantes.add(estudianteP);

            } else {
                
                if (tipoEstudiante == 2) {
                    k = k + 1;
                    EstudianteDistancia estudianteD = new EstudianteDistancia();
                    System.out.println("Ingrese el número de asignaturas");
                    numeroAsigs = entrada.nextInt();
                    System.out.println("Ingrese el costo de cada cada asignatura");
                    costoAsig = entrada.nextDouble();
                    entrada.nextLine();
                    estudianteD.establecerNombresEstudiante(nombresEst);
                    estudianteD.establecerApellidoEstudiante(apellidosEst);
                    estudianteD.establecerIdentificacionEstudiante(identificacionEst);
                    estudianteD.establecerEdadEstudiante(edadEst);
                    estudianteD.establecerNumeroAsginaturas(numeroAsigs);
                    estudianteD.establecerCostoAsignatura(costoAsig);
                    estudiantes.add(estudianteD);
                }
            }
            contador = contador + 1;
        }
        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();

            System.out.printf("Datos Estudiante\n"
                    + "%s\n",
                    estudiantes.get(i));

        }
    }
}
