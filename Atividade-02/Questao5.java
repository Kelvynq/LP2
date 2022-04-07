package LP2A2;

public class Questão5 {
   
     public static void main(String[] args){
         
        Automovel automovel = new Automovel();
        automovel.modelo = "Uno";
        automovel.ano = 2015;
        automovel.velocidade = 80;
        System.out.println("===AUTOMÓVEL===");
        automovel.info();
        System.out.println("\nAcelerando:");
        automovel.acelerar();
        automovel.info();
        System.out.println("\nDesacelerando:");
        automovel.desacelerar();
        automovel.info();
     }
}
