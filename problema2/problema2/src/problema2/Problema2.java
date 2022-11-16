/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

/**
 *
 * @author sofiv
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double costoTotal;
        double preciounidad = 0;
        int cantidad = 0;
        double descuento = 0.85;

        costoTotal = preciounidad * cantidad;
        if (cantidad > 50) {
            costoTotal = costoTotal * descuento;
        }
        System.out.println("El costo del pedido es: " + costoTotal);
    }

}
