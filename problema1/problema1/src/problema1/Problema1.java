/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author sofiv
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double costokw;
        double kwconsumidos;
        double valorplanilla;
        double descuento = 0.9;
        int edad;

        System.out.println("Ingrese el valor del costo kilovatio por hora");
        costokw = entrada.nextDouble();
        System.out.println("Ingrese el número de kilovatios consumidos en el mes");
        kwconsumidos = entrada.nextDouble();
        System.out.println("Ingresar la edad del usuario");
        edad = entrada.nextInt();

        valorplanilla = costokw * kwconsumidos;

        if (edad > 65) {
            valorplanilla = valorplanilla * descuento;
        }
        System.out.println("El valor a cancelar es: " + valorplanilla);
    }

}
