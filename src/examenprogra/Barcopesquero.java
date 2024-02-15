/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprogra;

/**
 *
 * @author balto
 */
class Barcopesquero extends Barco {
    private int pecesCapturados;
    private TipoPesquero tipoPesquero;

    //constructor
    public Barcopesquero(TipoPesquero tipoPesquero) {
        super("Barco Pesquero");
        this.pecesCapturados = 0;
        this.tipoPesquero = tipoPesquero;
    }

    public void agregarElemento() {
        pecesCapturados++;
    }

    public double vaciarCobrar() {
        double total = pecesCapturados * tipoPesquero.getPrecio();//entregar los peces, hacer el cobro y ponerlos en 0
        pecesCapturados = 0;
        return total;
    }

    public double precioElemento() {
        return tipoPesquero.getPrecio();
    }

    public String toString() {
        return super.toString() + " - Tipo de Barco: " + tipoPesquero.name() + ", Cantidad de Peces Capturados: " + pecesCapturados;
    }
}//fin de barcopesquero
