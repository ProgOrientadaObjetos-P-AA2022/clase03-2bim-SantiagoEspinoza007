/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;

/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {

    ArrayList<Estudiante> lista;
    double totalMatriculas;

    public ReporteEstudiante(String n) {
        super(n);
    }

    public void establecerLista(ArrayList<Estudiante> listado) {
        lista = listado;
    }

    public ArrayList<Estudiante> obtenerLista() {
        return lista;
    }

    public void establecerTotalMatriculas() {

        for (int i = 0; i < lista.size(); i++) {
            totalMatriculas = totalMatriculas
                    + lista.get(i).getMatricula();
        }
    }

    public double obtenerTotalMatriculas() {
        return totalMatriculas;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s", codigo);
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s\n%s\n", cadena, obtenerLista().get(i));
        }
        cadena = String.format("%s\nTotal Matriculas:%.2f\n", cadena, totalMatriculas);

        return cadena;

    }
}
