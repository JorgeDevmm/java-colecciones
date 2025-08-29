package dev.jorge.List.ejercicios;

import dev.jorge.arrays.ejercicios.metodosutilitarios.RandomUtilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class EjercicioNotasNombres {

    public static void main(String[] args) {

        final String[] arrayNombres = crearArrayNombres();
        final int[] arrayNotas = crearArrayNotas();

        List<String> bajo = new ArrayList<>();
        List<String> medio = new ArrayList<>();
        List<String> alto = new ArrayList<>();


        rellenarListasNotas(bajo, medio, alto, arrayNombres, arrayNotas);


        System.out.println(Arrays.toString(arrayNombres));
        System.out.println(Arrays.toString(arrayNotas));

        System.out.println("List alto" + alto);
        System.out.println("List medio" + medio);
        System.out.println("List bajo" + bajo);

    }


    public static String[] crearArrayNombres() {
        String[] nombres = {"Carlos", "Antonio", "Jorge", "Ana", "Mayra", "Julieta", "Maria", "Rodrigo", "Anabel", "Luz"};

        return nombres;
    }

    public static int[] crearArrayNotas() {

        final var arrayNotas = RandomUtilities.generarRandomArrayInt(10, 1, 20, new Random());
        return arrayNotas;
    }

    public static void rellenarListasNotas(
            List<String> bajo,
            List<String> medio,
            List<String> alto,
            String[] arrayNombres,
            int[] arrayNotas
    ) {

        for (int i = 0; i < arrayNombres.length; i++) {
            if (arrayNotas[i] >= 16) {
                alto.add(arrayNombres[i]);
            } else if (arrayNotas[i] >= 10) {
                medio.add(arrayNombres[i]);
            } else {
                bajo.add(arrayNombres[i]);
            }
        }
    }
}
