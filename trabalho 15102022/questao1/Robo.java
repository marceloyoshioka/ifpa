class Robo{
    private String direcao;
    private int velocidade;
    private int distancia;
    
    Robo(String direcao, int velocidade, int distancia){
        this.direcao = direcao;
        this.velocidade = velocidade;
        this.distancia = distancia;
    }
    
    void aumentaVelocidade(){
        this.velocidade = this.velocidade + 10;
    }
    
    String info(){
        return this.direcao+" "+this.velocidade+" "+this.distancia;
    }
}