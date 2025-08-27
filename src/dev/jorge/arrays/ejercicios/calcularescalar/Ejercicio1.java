package dev.jorge.arrays.ejercicios.calcularescalar;

import dev.jorge.arrays.ejercicios.metodosutilitarios.Util;
import dev.jorge.arrays.ejercicios.metodosutilitarios.RandomUtilities;
import dev.jorge.arrays.ejercicios.metodosutilitarios.ScannerManager;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Valores temporales de inicialización para el flujo del do-while
        int max = 0;
        int min = 0;
        int tamanioArreglo = 1;


        do {

            try {
                tamanioArreglo = ScannerManager.leerInt(scanner, "Ingresar el tamaño del array: ");
                min = ScannerManager.leerInt(scanner, "Ingresar el valor minimo: ");
                max = ScannerManager.leerInt(scanner, "Ingresar el valor max: ");
                final int escalar = ScannerManager.leerInt(scanner, "Ingresar el valor del escalar: ");

                final int[] array = RandomUtilities.generarRandomArrayInt(tamanioArreglo, max, min, new Random());


                System.out.println("===================");

                int[] nuevoArray = Util.calcularProductoEscalar(array, escalar);
                Util.imprimirInformacion(array, nuevoArray);
            } catch (IllegalArgumentException e) {
                System.out.println("El rango es demasiado pequeño para generar valores únicos,se necesita volver a ingresar");
            }

        } while ((max - min + 1) < tamanioArreglo);

        scanner.close();

    }
}
