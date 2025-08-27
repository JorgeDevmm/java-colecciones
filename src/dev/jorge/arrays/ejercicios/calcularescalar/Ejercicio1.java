package dev.jorge.arrays.ejercicios.calcularescalar;

import dev.jorge.arrays.ejercicios.metodosutilitarios.Util;
import dev.jorge.arrays.ejercicios.metodosutilitarios.RandomUtilities;
import dev.jorge.arrays.ejercicios.metodosutilitarios.ScannerManager;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        final int tamanioArreglo = ScannerManager.leerInt(scanner, "Ingresar el tamaño del array: ");
        final int min = ScannerManager.leerInt(scanner, "Ingresar el valor minimo: ");
        final int max = ScannerManager.leerInt(scanner, "Ingresar el valor max: ");
        final int escalar = ScannerManager.leerInt(scanner, "Ingresar el valor del escalar: ");

        scanner.close();

        final int[] array = RandomUtilities.generarRandomArrayInt(tamanioArreglo, max, min, new Random());

        System.out.println("===================");

        int[] nuevoArray = Util.calcularProductoEscalar(array, escalar);
        Util.imprimirInformacion(array, nuevoArray);


    }
}
