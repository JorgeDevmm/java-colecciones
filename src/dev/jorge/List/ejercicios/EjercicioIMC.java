package dev.jorge.List.ejercicios;

import dev.jorge.arrays.ejercicios.metodosutilitarios.RandomUtilities;
import dev.jorge.arrays.ejercicios.metodosutilitarios.ScannerManager;

import java.util.*;

public class EjercicioIMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List<String> nombres = new ArrayList<>(Arrays.asList("Carlos", "Antonio", "Jorge", "Ana", "Mayra", "Julieta", "Maria", "Rodrigo", "Anabel", "Luz"));

        final var tamanio = ScannerManager.leerInt(scanner, "Ingresar el tamanio: ");
        final var min = ScannerManager.leerInt(scanner, "Ingresar el minimo: ");
        final var max = ScannerManager.leerInt(scanner, "Ingresar el maximo: ");


        final var IMC = RandomUtilities.generarRandomArrayDouble(tamanio, min, max, random);


        System.out.println(nombres);
        System.out.println(Arrays.toString(IMC));

        List<String> alto = new ArrayList<>();
        List<String> medio = new ArrayList<>();
        List<String> bajo = new ArrayList<>();

        rellenarListasImc(alto, medio, bajo, nombres, IMC);

        System.out.println("lista alto: "+ alto);
        System.out.println("Lista medio: " + medio);
        System.out.println("Lista bajo: " + bajo);

    }

    public static void rellenarListasImc(List<String> alto, List<String> medio, List<String> bajo, List<String> nombres, double[] imc) {
        int longitud = imc.length;

        for (int i = 0; i < longitud; i++) {
            if (imc[i] >= 40) {
                alto.add(nombres.get(i));
            } else if (imc[i] >= 25 && imc[i] < 40) {
                medio.add(nombres.get(i));
            } else if (imc[i] < 25) {
                bajo.add(nombres.get(i));
            }
        }
    }
}
