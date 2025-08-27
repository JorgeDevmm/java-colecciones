package dev.jorge.ordenamiento;

import dev.jorge.arrays.ejercicios.metodosutilitarios.RandomUtilities;
import dev.jorge.arrays.ejercicios.metodosutilitarios.ScannerManager;
import dev.jorge.arrays.ejercicios.metodosutilitarios.Util;

import java.util.Random;
import java.util.Scanner;

public class Bubblesort2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final var tamanio = ScannerManager.leerInt(scanner, "Ingresar el tamanio del arreglo: ");
        final var min = ScannerManager.leerDouble(scanner, "Ingresar el valor minimo del arreglo: ");
        final var max = ScannerManager.leerDouble(scanner, "Ingresar el valor maximo del arreglo: ");



        final var arrayOriginal  = RandomUtilities.generarRandomArrayDouble(tamanio,min,max,new Random());
        final var arrayOrdenado = ordenarArrayDouble(arrayOriginal);

        Util.imprimirInformacion(arrayOriginal, arrayOrdenado, "Array original %s%n", "Array ordenado %s%n");
    }


    public static double[] ordenarArrayDouble(double[] numeros) {
        double temporal = 0.0;

        for (int i = 0; i < numeros.length; i++) {//pasos
            for (int j = 0; j < numeros.length - i - 1; j++) {//subpasos
                if (numeros[j] < numeros[j + 1]) {//preguntamos si esta desordenado -> mayor a menor
                    temporal = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temporal;
                }
            }
        }


        return numeros;

    }
}
