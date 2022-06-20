/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3;

import java.util.ArrayList;

public class Ejecutor2 {

    public static void main(String[] args) {

        ArrayList<EstudiantePresencial> lista = new ArrayList<>();

        EstudiantePresencial e1 = new EstudiantePresencial("Mario", "Mills",
                "212233", 23, 1, 100.2, 9.2);
        
        EstudiantePresencial e2 = new EstudiantePresencial("Nancy", "Ayala",
                "212234", 21, 2, 100.2, 8.2);
        
        EstudiantePresencial e3 = new EstudiantePresencial("Alvaro", "Narvaez",
                "212235", 19, 3, 100.2, 7.2);

        

        ReportePresencial rd = new ReportePresencial("Reporte Presencial",
                "Alimentos", "Segundo");
        
        System.out.println("----------------------");
        System.out.println(rd);

    }
}
/* Salida
----------------------
Reporte Presencial
Carrera: Alimentos 
Ciclo: Segundo

Lista de Estudiantes

Nombre: Mario
Apellido: Mills
Identificación: 212233
Edad: 23
Costo Crédito: 100,20
Número de Créditos: 1
Total Matricula: 100,20
Promedio:  9,20

Nombre: Nancy
Apellido: Ayala
Identificación: 212234
Edad: 21
Costo Crédito: 100,20
Número de Créditos: 2
Total Matricula: 200,40
Promedio:  8,20

Nombre: Alvaro
Apellido: Narvaez
Identificación: 212235
Edad: 19
Costo Crédito: 100,20
Número de Créditos: 3
Total Matricula: 300,60
Promedio:  7,20


El total de matriculas es: 601,20
Promedio General: 8,200
*/