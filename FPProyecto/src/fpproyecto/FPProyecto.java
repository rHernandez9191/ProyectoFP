package fpproyecto;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashMap;

public class FPProyecto {
        
        Proceso proceso1 = new Proceso();
        
        static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        static PrintStream out = System.out;
        
    public void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);
        Scanner entrada4 = new Scanner(System.in);
        
        ArrayList<String> paises = new ArrayList();
        ArrayList<String> oro = new ArrayList();
        ArrayList<String> plata = new ArrayList();
        ArrayList<String> bronce = new ArrayList();
        
        int bandera;
        
        do {                
                System.out.println("Eliga una opcion");
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
                   int medallaOro, medallaPlata, medallaBronce;  
                   System.out.println("Cuantas medallas de oro para  " + paises.get(0 ));
                   medallaOro = entrada.nextInt();
                }
                        
            } while (bandera != 10);
  
              
        int total;
        
        Map <String, Integer> resultado = new HashMap <>();
        
       // while () 
        {
            
            
            
            
            
            
        
            //System.out.println("Cuantas medallas de plata:  ");
           // medallaPlata = entrada2.nextInt();
        
            //System.out.println("Cuantas medallas de bronce:  ");
            //medallaBronce = entrada3.nextInt();
            
          // total = (medallaOro * oro) + (medallaPlata * plata) + (medallaBronce * bronce);
            
          //  resultado.put(pais , total);
            
         
        }
        
       // System.out.print(proceso1.mayorPuntaje(resultado));
    }
}
