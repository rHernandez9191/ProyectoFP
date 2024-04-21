package fpproyecto;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class FPProyecto {
        
        static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        static PrintStream out = System.out;
        
    public void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);
        Scanner entrada4 = new Scanner(System.in);
        
        ArrayList<String> paises = new ArrayList();
        ArrayList<Integer> oro = new ArrayList();
        ArrayList<Integer> plata = new ArrayList();
        ArrayList<Integer> bronce = new ArrayList();
        ArrayList<Integer> puntajeTotal = new ArrayList();
        
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
                bandera = entrada4.nextInt();
                
                if(bandera == 1)
                {   
                    System.out.println("Cuantos paises desea ingresar");
                    int cantidadPaises = entrada.nextInt();
                    int contador = 0;
                    int numero = 1;
                    while(cantidadPaises != contador)
                    {
                        out.print("Escriba el pais  #"+numero+ " ");
                        String pais = in.readLine();
                        paises.add(pais);
                        contador +=1;
                        numero += 1;   
                    }
                    
                }
                if(bandera == 2)
                {
                   for(int p = 0; p < paises.size(); p++)
                   {
                        int medallaOro, medallaPlata, medallaBronce; 
                        
                        System.out.println("Cuantas medallas de oro para  " + paises.get(p ));
                        medallaOro = entrada.nextInt();
                        oro.add(medallaOro);
                        
                        System.out.println("Cuantas medallas de plata para "+ paises.get(p));
                        medallaPlata = entrada2.nextInt();
                        plata.add(medallaPlata);
        
                        System.out.println("Cuantas medallas de bronce para "+ paises.get(p));
                        medallaBronce = entrada3.nextInt();
                        bronce.add(medallaBronce);
                   }
                }
                if(bandera == 3)
                {
                    for (int i = 0; i < paises.size(); i++)
                    {
                        puntajeTotal.add(oro.get(i)*3 + plata.get(i)* 2 + bronce.get(i));
                    }
                }
                if(bandera == 4)
                {
                    System.out.print("\nTabla de puntaje\n");
                    System.out.print("\nPaises\tpuntajes\n");
                    for(int j = 0; j < paises.size(); j++)
                    {
                        System.out.print(paises.get(j) +"\t"+ puntajeTotal.get(j)+"\n");
                    }
                }
                if(bandera == 5)
                {
                    
                }
                        
            } while (bandera != 10);
  
        System.out.print(paises);
        System.out.print(oro);
        System.out.print(plata);
        System.out.print(bronce);
        System.out.print(puntajeTotal);
    }
}
