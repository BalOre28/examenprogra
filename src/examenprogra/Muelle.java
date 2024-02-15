/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenprogra;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author balto
 */
public class Muelle {
Scanner leer=new Scanner(System.in);
private ArrayList<Barco> ListarBarcos;

public Muelle(){
    ListarBarcos= new ArrayList();
}
public void agregarBarco(String tipo) {
        System.out.println("Ingrese el nombre del nuevo barco:");
        String nombre = leer.nextLine();
        for (Barco barco : ListarBarcos) {
            if (barco.getNombre().equals(nombre)) {
                System.out.println("Error: El Nombre del barco ya registrado, por favor ingrese otro nombre");
                return;
            }
        }
     if (tipo.equalsIgnoreCase("PESQUERO")) {
            System.out.println("Ingrese el tipo de pesquero (PEQUEÑO/MEDIANO/GRANDE):");
            String tipoPesquero = leer.nextLine().toUpperCase();
            TipoPesquero tipoBarcoPesquero = TipoPesquero.valueOf(tipoPesquero);
            Barcopesquero nuevoBarcoPesquero = new Barcopesquero(tipoBarcoPesquero);
            ListarBarcos.add(nuevoBarcoPesquero);
            System.out.println("Barco pesquero agregado correctamente.");
        } else if (tipo.equalsIgnoreCase("PASAJERO")) {
            System.out.println("Ingrese la capacidad máxima del barco de pasajeros:");
            int capacidadMaxima = leer.nextInt();
            System.out.println("Ingrese el precio del boleto:");
            double precioBoleto = leer.nextDouble();
            Barcopasajero nuevoBarcoPasajero = new Barcopasajero(capacidadMaxima, precioBoleto);
            ListarBarcos.add(nuevoBarcoPasajero);
            System.out.println("Barco de pasajeros agregado correctamente.");
        } else {
            System.out.println("Tipo de barco inválido.");
        }
 
    }
}//fin de muelle para no confundir
