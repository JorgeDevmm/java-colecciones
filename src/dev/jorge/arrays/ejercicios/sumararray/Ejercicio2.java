package dev.jorge.arrays.ejercicios.sumararray;

import dev.jorge.arrays.ejercicios.metodosutilitarios.RandomUtilities;
import dev.jorge.arrays.ejercicios.metodosutilitarios.ScannerManager;
import dev.jorge.arrays.ejercicios.metodosutilitarios.Util;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        final int tamanioArreglo = ScannerManager.leerInt(scanner, "Ingresar el tamaño del array: ");
        final int min = ScannerManager.leerInt(scanner, "Ingresar el valor minimo: ");
        final int max = ScannerManager.leerInt(scanner, "Ingresar el valor max: ");

        scanner.close();

        final int[] array1 = RandomUtilities.generarRandomArrayInt(tamanioArreglo, max, min, new Random());
        final int[] array2 = RandomUtilities.generarRandomArrayInt(tamanioArreglo, max, min, new Random());


        final int[] sumaArray = Util.calcularSumaArray(array1, array2);

        Util.imprimirInformacion(array1,array2,sumaArray);
    }
}
