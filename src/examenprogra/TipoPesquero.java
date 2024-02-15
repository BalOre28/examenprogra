/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprogra;

/**
 *
 * @author balto
 */
public enum TipoPesquero {
    PEZ(200),CAMARON(300),LANGOSTA(500);
    
     private final double precio;
     //mini constructor
    TipoPesquero(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
}//fin de tipoPesquero
