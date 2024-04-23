package fpproyecto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FPProyecto {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        ArrayList<String> paises = new ArrayList<>();
        ArrayList<Integer> oro = new ArrayList<>();
        ArrayList<Integer> plata = new ArrayList<>();
        ArrayList<Integer> bronce = new ArrayList<>();
        ArrayList<Integer> puntajeTotal = new ArrayList<>();

        int bandera;

        do {
            System.out.println("\nEliga una opcion");
            System.out.println("""
                    1.Iniciar Programa
                    2.Registrar Informacion
                    3.Calcular Puntaje total
                    4.Imprimir puntaje de cada pais
                    5.Pais con mas medallas de plata
                    6.Promedio de medallas de bronce
                    7.Medallero informativo
                    8.Crear Puntaje total ordenado
                    9.Imprimir puntaje total ordenado
                    10.SALIR \n""");
            bandera = entrada.nextInt();

            switch (bandera) {
                case 1 -> {
                    System.out.println("Cuantos paises desea ingresar");
                    int cantidadPaises = entrada.nextInt();
                    for (int i = 0; i < cantidadPaises; i++) {
                        System.out.print("Escriba el pais #" + (i + 1) + ": ");
                        paises.add(entrada.next());
                    }
                }
                case 2 -> {
                    for (String pais : paises) {
                        System.out.println("Cuantas medallas de oro para " + pais + ": ");
                        oro.add(entrada.nextInt());

                        System.out.println("Cuantas medallas de plata para " + pais + ": ");
                        plata.add(entrada.nextInt());

                        System.out.println("Cuantas medallas de bronce para " + pais + ": ");
                        bronce.add(entrada.nextInt());
                    }
                }
                case 3 -> {
                    for (int i = 0; i < paises.size(); i++) {
                        puntajeTotal.add(oro.get(i) * 3 + plata.get(i) * 2 + bronce.get(i));
                    }
                }
                case 4 -> {
                    System.out.println("\nTabla de puntaje");
                    System.out.printf("%-15s | %-10s%n", "Pais", "Puntaje");
                    for (int j = 0; j < paises.size(); j++) {
                        System.out.printf("%-15s | %-10d%n", paises.get(j), puntajeTotal.get(j));
                    }
                }
                case 5 -> {
                    int maxPlataIndex = plata.indexOf(Collections.max(plata));
                    System.out.println("El país con más medallas de plata es: " + paises.get(maxPlataIndex));
                }
                case 6 -> {
                    int sumaBronce = bronce.stream().mapToInt(Integer::intValue).sum();
                    double promedioBronce = (double) sumaBronce / bronce.size();
                    System.out.println("El promedio de medallas de bronce es: " + promedioBronce);
                }
                case 7 -> {
                    System.out.println("\nMedallero informativo");
                    System.out.printf("%-15s | %-15s | %-15s | %-15s%n", "Pais", "Oro", "Plata", "Bronce");
                    for (int k = 0; k < paises.size(); k++) {
                        System.out.printf("%-15s | %-15d | %-15d | %-15d%n", paises.get(k), oro.get(k), plata.get(k), bronce.get(k));
                    }
                }
                case 8 -> {
                    ArrayList<Integer> puntajeTotalOrdenado = new ArrayList<>(puntajeTotal);
                    Collections.sort(puntajeTotalOrdenado, Collections.reverseOrder());

                    ArrayList<String> paisesOrdenado = new ArrayList<>();
                    for (int puntaje : puntajeTotalOrdenado) {
                        int index = puntajeTotal.indexOf(puntaje);
                        paisesOrdenado.add(paises.get(index));
                    }

                    System.out.println("\nTabla de posiciones");
                    System.out.printf("%-15s | %-10s%n", "Pais", "Puntaje total");
                    for (int m = 0; m < paisesOrdenado.size(); m++) {
                        System.out.printf("%-15s | %-10d%n", paisesOrdenado.get(m), puntajeTotalOrdenado.get(m));
                    }
                }
                case 9 -> {
                    System.out.println("\nTabla de puntaje total ordenado");
                    System.out.printf("%-15s | %-10s%n", "Pais", "Puntaje total");
                    for (int n = 0; n < paises.size(); n++) {
                        System.out.printf("%-15s | %-10d%n", paises.get(n), puntajeTotal.get(n));
                    }
                }
                case 10 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida, por favor seleccione una opción válida.");
            }
        } while (bandera != 10);
    }
}
