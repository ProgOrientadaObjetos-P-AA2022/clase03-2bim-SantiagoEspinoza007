/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        /*
        clase uno abstracta llamada Figura; con atributos:
        características y área; la clase debe tener un método
        abstracto calcular_area.
        - clase llamada Triángulo (hereda de Figura); con
        atributos: base y altura.
        - clase llamada Rombo (hereda de Figura) con atributo: diagonal_menor y 
        diagonal mayor.
        - clase llamada Cuadrado (hereda Figura) con: atributos: lado.
        - clase Ejecutor, que permite generar:
            4 objetos de tipo Cuadrado
            3 objetos de tipo Rombo
            5 objeto de Triángulo 
            Comprobar el concepto del polimorfismo.
        */
        
        // inicio de la solución
        ArrayList<Figura> figuras = new ArrayList<>();
        
        
        
        // proceso para comprobar el polimorfismo
        for (int i = 0; i < figuras.size(); i++) {
            // 1.  
            figuras.get(i).calcular_area();
            
            System.out.printf("Datos de Figura\n"
                        + "%s\n",                        
                  figuras.get(i));
        }
    }
}
