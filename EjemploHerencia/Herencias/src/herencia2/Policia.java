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
public class Policia extends Persona {

    private String rango;
    

    public Policia(String n, String a, int e, String mat) {
        super(n, a, e);
        setRango(mat);
    }

    public void setRango(String mat) {
        rango = mat;
    }

    public String getRango() {
        return rango;
    }

    @Override
    public String toString() {

        return String.format("%s - %s", super.toString(), getRango());
    }
}
