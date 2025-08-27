package dev.jorge.arrays.ejercicios.metodosutilitarios;

import java.util.Scanner;

public class ScannerManager {

    public static int leerInt(Scanner scanner, String mensaje) {
        int numero;
        System.out.print(mensaje);
        return numero = scanner.nextInt();
    }

    public static double leerDouble(Scanner scanner, String mensaje) {
        double numero;
        System.out.print(mensaje);
        return numero = scanner.nextDouble();
    }
}
