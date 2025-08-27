package dev.jorge.arrays.ejercicios.metodosutilitarios;

import java.util.Random;

public class RandomUtilities {

    public static int[] generarRandomArrayInt(int tamanioArreglo, int max, int min, Random random) {
        int[] array = new int[tamanioArreglo];

        array[0]=0;
        for (int i = 0; i < tamanioArreglo; i++) {
            /*array[i] = generarAleatorioInt(max, min, random);*/
            int aleatorio = generarAleatorioInt(max, min, random);
            if(aleatorio!=array[i]){
                array[i] = aleatorio;
            }
        }

        return array;
    }

    public static double[] generarRandomArrayDouble(int tamanioArreglo, double max, double min, Random random) {
        double[] array = new double[tamanioArreglo];

        for (int i = 0; i < tamanioArreglo; i++) {
            array[i] = generarAleatorioDouble(max, min, random);
        }

        return array;
    }


    public static int generarAleatorioInt(int max, int min, Random random) {
        if (min > max) {
            throw new IllegalArgumentException("el valor máximo deber ser mayor o igual al minimo");
        }
        return random.nextInt(max - min + 1) + min;
    }

    public static double generarAleatorioDouble(double max, double min, Random random) {
        if (min > max) {
            throw new IllegalArgumentException("el valor máximo deber ser mayor o igual al minimo");
        }

        double conversionDecimal = Math.pow(10, 2);
        double numeroAleatorio =random.nextDouble(max - min + 1) + min;
        return Math.round(numeroAleatorio * conversionDecimal) / conversionDecimal;
    }

}
