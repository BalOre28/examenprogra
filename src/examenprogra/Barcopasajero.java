/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprogra;
 import java.util.Scanner;
/**
 *
 * @author balto
 */
class Barcopasajero extends Barco {
    private String[] nombresPasajeros;
    private final double precioBoleto;
    private int Pasajeros;

    //construcor
    public Barcopasajero(int capacidad, double precioBoleto) {
        super("Barco Pasajero");
        this.nombresPasajeros = new String[capacidad];
        this.precioBoleto = precioBoleto;
        this.Pasajeros = 0;
    }

    public void agregarElemento() {
        if (Pasajeros < nombresPasajeros.length) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el nombre del pasajero por favor: ");
            String nombre = leer.nextLine();
            nombresPasajeros[Pasajeros] = nombre;
            Pasajeros++;
        } else {
            System.out.println("Lo sentimos ya no nos queda espacio...");
        }
    }
    
    public double vaciarCobrar() {
        double total = Pasajeros * precioBoleto;//Bajar a los pasajeros, cobrar el precio del boleto y ponerlo en 0
        Pasajeros = 0;
        return total;
    }

    public double precioElemento() {
        return precioBoleto;
    }

    public void listarPasajeros() {
        System.out.println("Pasajeros a bordo: ");
        listarPasajeros(0);
    }

    private void listarPasajeros(int lista) {
        if (lista < Pasajeros) {
            System.out.println("- " + nombresPasajeros[lista]);
            listarPasajeros(lista + 1);
        }
    }
    
     public String toString() {
        return super.toString() + " - Cantidad de Pasajeros que compraron boleto: " + Pasajeros;
    }

}//fin de barcopasajero
