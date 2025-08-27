package dev.jorge.ordenamiento;

import dev.jorge.arrays.ejercicios.metodosutilitarios.RandomUtilities;
import dev.jorge.arrays.ejercicios.metodosutilitarios.ScannerManager;
import dev.jorge.arrays.ejercicios.metodosutilitarios.Util;

import java.util.*;


public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final var tamanio = ScannerManager.leerInt(scanner, "Ingresar el tamanio del arreglo: ");
        final var min = ScannerManager.leerInt(scanner, "Ingresar el valor minimo del arreglo: ");
        final var max = ScannerManager.leerInt(scanner, "Ingresar el valor maximo del arreglo: ");

        final var arrayOriginal = RandomUtilities.generarRandomArrayInt(tamanio, min, max, new Random());

        final var arrayOrdenado = ordenarArray(arrayOriginal);

        Util.imprimirInformacion(arrayOriginal,arrayOrdenado,"Array original %s%n","Array ordenado %s%n");



        //List generado con valores predefinidos
//        List<Integer> numeros = new ArrayList<Integer>(List.of(3, 5, 8, 9, 2, 6, 1, 10, 4, 7));

//        final var numerosOrdenados = ordenarArray(numeros);
//
//        System.out.println(numerosOrdenados);

    }

    public static int[] ordenarArray(int[] numeros) {
        int temporal = 0;

        for (int i = 0; i < numeros.length; i++) {//pasos
            for (int j = 0; j < numeros.length - i - 1; j++) {//subpasos
                if (numeros[j] > numeros[j + 1]) {//preguntamos si esta desordenado
                    temporal = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temporal;
                }
            }
        }


        return numeros;

    }


    //Método para tipo integer
    public static List<Integer> ordenarArray(List<Integer> numeros) {
        int contador = 0;

        for (int i = 0; i < numeros.size(); i++) {
            for (int j = 0; j < numeros.size() - 1 - i; j++) {
                if (numeros.get(j) > numeros.get(j + 1)) {
                    contador = numeros.get(j);
                    numeros.set(j, numeros.get(j + 1));
                    numeros.set(j + 1, contador);
                }
            }
        }

        return numeros;
    }


}
