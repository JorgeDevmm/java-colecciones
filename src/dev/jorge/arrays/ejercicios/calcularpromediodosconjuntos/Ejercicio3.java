package dev.jorge.arrays.ejercicios.calcularpromediodosconjuntos;

import dev.jorge.arrays.ejercicios.metodosutilitarios.RandomUtilities;
import dev.jorge.arrays.ejercicios.metodosutilitarios.ScannerManager;
import dev.jorge.arrays.ejercicios.metodosutilitarios.Util;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int tamanioArreglo = ScannerManager.leerInt(scanner, "Ingresar el tamaño del array: ");
        final var min = ScannerManager.leerDouble(scanner, "Ingresar el valor minimo: ");
        final var max = ScannerManager.leerDouble(scanner, "Ingresar el valor max: ");

        scanner.close();

        final var array1 = RandomUtilities.generarRandomArrayDouble(tamanioArreglo, max, min, new Random());
        final var array2 = RandomUtilities.generarRandomArrayDouble(tamanioArreglo, max, min, new Random());

        double promedioSimple = Util.calcularPromedioPonderado(array1, array2);

        Util.imprimirInformacion(array1, array2, promedioSimple);
    }
}
