package fpproyecto;

import java.util.Map;
import java.util.Collections;

        
public class Proceso {
    
        public static String mayorPuntaje(Map<String, Integer>resultado)
        {
            int puntajeMayor = (Collections.max(resultado.values()));
            
            for (Map.Entry <String, Integer> nombrePais: resultado.entrySet())
            {
                if(nombrePais.getValue() == puntajeMayor)
                {
                    return "El pais ganador es: " + nombrePais.getKey() + " con un puntaje de: " + nombrePais.getValue() + "\n";
                }
            }
            return null;
        }
    

}
