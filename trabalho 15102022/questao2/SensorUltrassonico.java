import java.util.*;

class SensorUltrassonico {
    int leiaDistancia(){
        //gera uma distancia aleatória entre 0 e 20
        Random ran = new Random(); 
        int distancia = ran.nextInt(21); 
        return distancia;
    }
}