package dev.jorge.arrays.ejercicios.metodosutilitarios;

import java.util.Arrays;

public class Util {

    public static int[] calcularProductoEscalar(int[] array, int escalar) {
        final var n = array.length;
        final var nuevoArray = new int[n];


        for (int i = 0; i < n; i++) {
            nuevoArray[i] = array[i] * escalar;
        }

        return nuevoArray;
    }

    public static int[] calcularSumaArray(int[] array1, int[] array2) {
        /**
         *obtenemos la longitud del array1 que seria igual al nuevo array de las sumas
         */
        int[] sumaArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            sumaArray[i] = array1[i] + array2[i];
        }

        return sumaArray;
    }

    public static double calcularPromedioPonderado(double[] array1, double[] array2) {

        double promedioSimple = 0.0;

        for (int i = 0; i < array1.length; i++) {

            promedioSimple += array1[i] * array2[i];
        }

        return promedioSimple / array1.length;
    }

    public static double[] calcularArrayPerimetro(double[] arraysRadios) {
        double[] arraysPerimetro = new double[arraysRadios.length];
        final var PI = 3.1416;

        for (int i = 0; i < arraysRadios.length; i++) {
            double conversionDecimal = Math.pow(10, 2);
            arraysPerimetro[i] = Math.round((2 * PI * arraysRadios[i]) * conversionDecimal )/ conversionDecimal;
        }

        return arraysPerimetro;

    }

    public static double[] calcularArrayArea(double[] arraysRadios) {
        double[] arraysArea = new double[arraysRadios.length];
        final var PI = 3.1416;

        for (int i = 0; i < arraysRadios.length; i++) {
            double conversionDecimal = Math.pow(10, 2);
            arraysArea[i] = Math.round(PI * Math.pow(arraysRadios[i], 2) * conversionDecimal) / conversionDecimal;/*redondea a decimal con dos digitos*/
        }


        return arraysArea;

    }

    public static void imprimirInformacion(int[] array, int[] nuevoArray) {

        System.out.printf("Array original %s%n", Arrays.toString(array));
        System.out.printf("Array nuevo %s%n", Arrays.toString(nuevoArray));
    }

    public static void imprimirInformacion(int[] array1, int[] array2, int[] sumaArray) {

        System.out.printf("Valores del array 1 %s%n", Arrays.toString(array1));
        System.out.printf("Valores del array 2 %s%n", Arrays.toString(array2));
        System.out.printf("Suma de los valores del anteriores array %s%n", Arrays.toString(sumaArray));
    }


    public static void imprimirInformacion(double[] array1, double[] array2, double promedioSimple) {

        System.out.printf("Valores del array 1 %s%n", Arrays.toString(array1));
        System.out.printf("Valores del array 2 %s%n", Arrays.toString(array2));
        System.out.printf("El promedio simple de los dos array seria %.2f%n", promedioSimple);
    }

    public static void imprimirInformacion(double[] arraysRadio, double[] arraysPerimetro, double[] arraysArea) {

        System.out.printf("Mostrar array de radio %s%n", Arrays.toString(arraysRadio));
        System.out.printf("Mostrar array de perimetro %s%n", Arrays.toString(arraysPerimetro));
        System.out.printf("Mostrar array de áreas %s%n", Arrays.toString(arraysArea));

    }


}
