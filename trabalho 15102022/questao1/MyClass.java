public class MyClass {
    public static void main(String args[]) {
      Robo r1 = new Robo("Frente",100,50);
      System.out.println(r1.info());
      r1.aumentaVelocidade();
      System.out.println(r1.info());
    }
}