package dev.jorge.ordenamiento;

import java.util.ArrayList;
import java.util.List;


public class BubbleSort {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<Integer>(List.of(3, 5, 8, 9, 2, 6, 1, 10, 4, 7));

        System.out.println(numeros);

        final var numerosOrdenados = ordenamientoArray(numeros);

        System.out.println(numerosOrdenados);

    }

    public static List<Integer> ordenamientoArray(List<Integer> numeros) {
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
