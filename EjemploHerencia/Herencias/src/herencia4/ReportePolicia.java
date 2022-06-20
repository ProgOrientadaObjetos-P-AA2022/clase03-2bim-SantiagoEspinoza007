/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte {

    double promedioEdades;

    ArrayList<Policia> lista;

    public ReportePolicia(String n) {
        super(n);

    }

    public void establecerPromedioEdades() {
        for (int i = 0; i < lista.size(); i++) {
            promedioEdades = promedioEdades
                    + lista.get(i).getEdad();
        }
        promedioEdades = promedioEdades / lista.size();
    }

    public void establecerLista(ArrayList<Policia> listado) {
        lista = listado;
    }

    public ArrayList<Policia> obtenerLista() {
        return lista;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s", codigo);
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s\n%s\n", cadena, obtenerLista().get(i));
        }
        cadena = String.format("%s\nPromedio de edades: %.2f", cadena, promedioEdades);
        return cadena;

    }
}
