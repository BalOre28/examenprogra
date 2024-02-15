/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprogra;

/**
 *
 * @author balto
 */
import java.util.Date;

abstract class Barco {
    private String nombre;
    private Date fechaDeCirculacion;

    //constructor
    public Barco(String nombre) {
        this.nombre = nombre;
        this.fechaDeCirculacion = new Date();
    }

    public final String getNombre() {
        return this.nombre;
    }

    public final Date getFechaDeCirculacion() {
        return this.fechaDeCirculacion;
    }
    
    public String toString() {
        return this.nombre;
    }

    public abstract void agregarElemento();

    public abstract double vaciarCobrar();

    public abstract double precioElemento();
}//fin de barco
