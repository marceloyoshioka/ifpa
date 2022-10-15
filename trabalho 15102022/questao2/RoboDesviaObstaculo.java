class RoboDesviaObstaculo extends Robo{
    SensorUltrassonico sensor;
    
    RoboDesviaObstaculo(SensorUltrassonico sensor){
        super("Robo");
        this.sensor = sensor;
    }
    
    void movimento(){
        int distancia = this.sensor.leiaDistancia();
        System.out.println("Distância é "+distancia);
        if(distancia > 10){
            System.out.println("Avançar");
        } else{
            System.out.println("Parar");
        }
    }
}