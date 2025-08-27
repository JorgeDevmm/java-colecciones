package dev.jorge.arrays.ejercicios.areaperimetro;

import dev.jorge.arrays.ejercicios.metodosutilitarios.RandomUtilities;
import dev.jorge.arrays.ejercicios.metodosutilitarios.ScannerManager;
import dev.jorge.arrays.ejercicios.metodosutilitarios.Util;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int tamanioArreglo = ScannerManager.leerInt(scanner, "Ingresar el tamaño del array: ");
        final var min = ScannerManager.leerDouble(scanner, "Ingresar el valor minimo de radio: ");
        final var max = ScannerManager.leerDouble(scanner, "Ingresar el valor max de radio: ");

        final var arraysRadios = RandomUtilities.generarRandomArrayDouble(tamanioArreglo,max,min,new Random());

        final var arraysPerimetro = Util.calcularArrayPerimetro(arraysRadios);
        final var arraysArea = Util.calcularArrayArea(arraysRadios);

        Util.imprimirInformacion(arraysRadios, arraysPerimetro,arraysArea);






    }
}
