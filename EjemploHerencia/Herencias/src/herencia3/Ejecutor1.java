/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3;

import java.util.ArrayList;

public class Ejecutor1 {

    public static void main(String[] args) {

        ArrayList<EstudianteDistancia> listaDistancia = new ArrayList<>();
        
        EstudianteDistancia e1 = new EstudianteDistancia("Mario", "Mills", "212233",
                23, 1, 100.2);
        EstudianteDistancia e2 = new EstudianteDistancia("Joseph", "White", "212234",
                24, 5, 100.2); 
        EstudianteDistancia e3 = new EstudianteDistancia("Catherine", "Reyes", "212235",
                25, 8, 100.2);
        
        listaDistancia.add(e1);
        listaDistancia.add(e2);
        listaDistancia.add(e3);
        
        for (int i = 0; i < listaDistancia.size(); i++) {
            listaDistancia.get(i).calcularMatriculaDistancia();
        }
        
        ReporteDistancia rd = new ReporteDistancia("Reporte Distancia", 
                "Derecho", "Sexto");
        rd.establecerLista(listaDistancia);
        rd.establecerTotalMatriculasDistancia();
        
        System.out.println("----------------------");
        System.out.println(rd);
        
    }
}

/* salida
----------------------
Reporte Distancia
Carrera: Derecho 
Ciclo: Sexto

Lista de Estudiantes

Nombre: Mario
Apellido: Mills
Identificación: 212233
Edad: 23
Costo Asignatura: 100,20
Número de Asignaturas: 1
Total Matricula: 100,20

Nombre: Joseph
Apellido: White
Identificación: 212234
Edad: 24
Costo Asignatura: 100,20
Número de Asignaturas: 5
Total Matricula: 501,00

Nombre: Catherine
Apellido: Reyes
Identificación: 212235
Edad: 25
Costo Asignatura: 100,20
Número de Asignaturas: 8
Total Matricula: 801,60


El total de matriculas es: 1402,80
*/