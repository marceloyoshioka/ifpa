
public class MyClass {
    public static void main(String args[]) {
      SensorUltrassonico sensor = new SensorUltrassonico();
      
      RoboDesviaObstaculo robo = new RoboDesviaObstaculo(sensor);
      robo.movimento();
    }
}