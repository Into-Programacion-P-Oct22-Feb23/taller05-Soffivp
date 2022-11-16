/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author sofiv
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int numerodias;
        double preciohabitacion;
        double descuento = 0;
        double subtotal;
        double totalPagar;

        System.out.println("Ingrese el numero de dias de hospedaje");
        numerodias = entrada.nextInt();
        System.out.println("Ingrese el precio diario de la habitacion");
        preciohabitacion = entrada.nextDouble();

        subtotal = preciohabitacion * numerodias;
        totalPagar = subtotal * descuento;
        if (numerodias > 5 && numerodias <= 10) {
            descuento = subtotal * 0.1;
            totalPagar = subtotal - descuento;
        }
        if (numerodias > 10 && numerodias <= 15) {
            descuento = subtotal * 0.15;
            totalPagar = subtotal - descuento;
        }
        if (numerodias > 15) {
            descuento = subtotal * 0.2;
            totalPagar = subtotal - descuento;
        }

        System.out.println("El subtotal es: " + subtotal + " El descuento es de: " + descuento
                + " Y el total a pagar es: " + totalPagar);

    }

}
