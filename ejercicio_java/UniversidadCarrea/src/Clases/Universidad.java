/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jeffd
 */
public class Universidad {
    public String nombre;
    public String ciudad;
    public String rector;
    public int numero_facultades;

    public Universidad() {
    }

    public Universidad(String nombre, String ciudad, String rector, int numero_facultades) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.rector = rector;
        this.numero_facultades = numero_facultades;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getRector() {
        return rector;
    }

    public int getNumero_facultades() {
        return numero_facultades;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setRector(String rector) {
        this.rector = rector;
    }

    public void setNumero_facultades(int numero_facultades) {
        this.numero_facultades = numero_facultades;
    }

    @Override
    public String toString() {
        return "Universidad {" + "nombre = " + nombre + ",  ciudad = " + ciudad + ",  rector = " + rector + ",  numero_facultades = " + numero_facultades + " }";
    }
    
    
}
