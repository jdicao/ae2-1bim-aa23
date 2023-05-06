/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import Clases.Universidad;
import Clases.Carrera;

/**
 *
 * @author jeffd
 */
public class Principal {
    
    public static void main(String[] args) {    
         Universidad objUniversidad = new Universidad("UTPL","Loja","Diana Jimenez",5);
        Carrera objCarrera = new Carrera("Tecnología en Transformación Digital de Empresas","UTPL TEC","Tecnólogo en Transformación Digital de Empresas",4);
        //System.out.println(objUniversidad.toString());
        System.out.println("Datos de la Universidad:");
        System.out.println(objUniversidad.toString());
        System.out.println("Datos de la Carrera:");
        System.out.println(objCarrera.toString());
    }
}
