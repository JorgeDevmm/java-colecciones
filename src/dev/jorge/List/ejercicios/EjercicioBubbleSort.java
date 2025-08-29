package dev.jorge.List.ejercicios;

import dev.jorge.arrays.ejercicios.metodosutilitarios.RandomUtilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EjercicioBubbleSort {


    public static void main(String[] args) {

        List<Integer> listaAleatoria = generarListAleatorio();

        System.out.println("La lista aleatoria es: " + imprimirLista(listaAleatoria));

        ordenarLista(listaAleatoria);
        System.out.println("La lista ordenada es: " + imprimirLista(listaAleatoria));

    }

    public static List<Integer> imprimirLista(List<Integer> listaAleatorios) {
        return listaAleatorios;
    }

    public static List<Integer> generarListAleatorio() {
        List<Integer> listaAleatoria = new ArrayList<>(30);

        final var listaPrimitiva = RandomUtilities.generarRandomArrayInt(30, 50, 500, new Random());


        for (int i = 0; i < 30; i++) {
            listaAleatoria.add(listaPrimitiva[i]);
        }

        return listaAleatoria;
    }

    public static void ordenarLista(List<Integer> lista) {
        int temporal = 0;

        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size() - i - 1; j++) {

                if (lista.get(j) > lista.get(j + 1)) {
                    temporal = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temporal);
                }

            }
        }
    }
}
