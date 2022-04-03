package LP2A2;

public class Automovel {
    public String modelo;
    public int ano;
    public double velocidade;
 
    public void ModeloAut(String modelo){
        this.modelo=modelo;    
}
    public void AtributosAut(String modelo, int ano, double velocidade){
        this.modelo=modelo;
        this.ano=ano;
        this.velocidade=velocidade;
             
    }
    
    void desacelerar(){
        
        velocidade--;
    }
    
    void acelerar(){
        velocidade++;
    }
    
    void info(){
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Ano: " +this.ano);
        System.out.println("Velocidade: " +this.velocidade);
        
    }
    
}
