package dev.jorge.arrays.ejercicios.metodosutilitarios;

import javax.management.StandardMBean;
import java.util.Random;

public class RandomUtilities {

    /*Almacenar y devolver un numero array con valor int alearorio y unicos*/
    public static int[] generarRandomArrayInt(int tamanioArreglo, int min, int max, Random random) {
        int[] array = new int[tamanioArreglo];
        int i = 0;

        if (max - min + 1 < tamanioArreglo) {
            throw new IllegalArgumentException("El rango es demasiado pequeño para generar valores únicos");
        }

        while (i < tamanioArreglo) {
            int aleatorio = generarAleatorioInt(min, max, random);

            if (!existeNumero(array, i, aleatorio)) {
                array[i] = aleatorio;
                i++;
            }

        }
        return array;
    }

    /**
     * Almacenar y devolver un numero array con valor double
     */
    public static double[] generarRandomArrayDouble(int tamanioArreglo, double min, double max, Random random) {
        double[] array = new double[tamanioArreglo];
        int i = 0;

        if (max - min + 1 < tamanioArreglo) {
            throw new IllegalArgumentException("El rango es demasiado pequeño para generar valores únicos");
        }

        while (i < tamanioArreglo) {
            double aleatorio = generarAleatorioDouble(min, max, random);

            if (!existeNumeroDouble(array, i, aleatorio)) {
                array[i] = aleatorio;
                i++;
            }

        }
        return array;
    }

    /*validación aplicando busqueda secuencial para arrya primitivo si elemento existe en un array */
    public static boolean existeNumero(int[] array, int hastaIndice, int valor) {
        for (int i = 0; i < hastaIndice; i++) {
            if (array[i] == valor) {
                return true;
            }

        }
        return false;
    }

    public static boolean existeNumeroDouble(double[] array, int hastaIndice, double valor) {
        for (int i = 0; i < hastaIndice; i++) {
            if (array[i] == valor) {
                return true;
            }

        }
        return false;
    }


    /*Generar un número aleatorio de tipo int*/
    public static int generarAleatorioInt(int min, int max, Random random) {

        if (min > max) {
            throw new IllegalArgumentException("el valor máximo deber ser mayor o igual al minimo");
        }

        return random.nextInt(max - min + 1) + min;
    }


    /*Generar un número aleatorio de tipo double*/
    public static double generarAleatorioDouble(double min, double max, Random random) {
        if (min > max) {
            throw new IllegalArgumentException("el valor máximo deber ser mayor o igual al minimo");
        }

        double conversionDecimal = Math.pow(10, 2);
        double numeroAleatorio = random.nextDouble(max - min + 1) + min;
        return Math.round(numeroAleatorio * conversionDecimal) / conversionDecimal;
    }

}
