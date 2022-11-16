/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author sofiv
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String marca;
        String origen;
        double precio;
        double iva = 0;
        double precioventa = 0;

        System.out.println("Ingrese la marca del automovil");
        marca = entrada.nextLine();
        System.out.println("Ingrese el origen del automovil");
        origen = entrada.nextLine();
        System.out.println("Ingrese el costo del automovil");
        precio = entrada.nextDouble();

        if (origen.equals("Alemania")) {
            iva = 0.20;
            iva = precio * iva;
            precioventa = precio + iva;
        }
        if (origen.equals("Japon")) {
            iva = 0.30;
            iva = precio * iva;
            precioventa = precio + iva;
        }
        if (origen.equals("Italia")) {
            iva = 0.15;
            iva = precio * iva;
            precioventa = precio + iva;
        }
        if (origen.equals("USA")) {
            iva = 0.08;
            iva = precio * iva;
            precioventa = precio + iva;
        }
        System.out.println("El valor del iva es de: " + iva + " Y el valor a pagar es de: " + precioventa);
    }

}
