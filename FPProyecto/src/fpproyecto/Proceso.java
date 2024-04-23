package fpproyecto;

import java.util.Collections;
import java.util.Map;

public class Proceso {

    public static String mayorPuntaje(Map<String, Integer> resultado) {
        int puntajeMayor = Collections.max(resultado.values());

        for (Map.Entry<String, Integer> nombrePais : resultado.entrySet()) {
            if (nombrePais.getValue() == puntajeMayor) {
                return "El pais ganador es: " + nombrePais.getKey() + " con un puntaje de: " + nombrePais.getValue() + "\n";
            }
        }
        return null;
    }

    public static String paisConMasPlata(Map<String, Integer> medallasPlata) {
        int maxPlata = Collections.max(medallasPlata.values());

        for (Map.Entry<String, Integer> entry : medallasPlata.entrySet()) {
            if (entry.getValue() == maxPlata) {
                return "El país con más medallas de plata es: " + entry.getKey();
            }
        }
        return null;
    }

    public static double promedioMedallasBronce(Map<String, Integer> medallasBronce) {
        double suma = 0;
        for (int medallas : medallasBronce.values()) {
            suma += medallas;
        }
        return suma / medallasBronce.size();
    }
}
