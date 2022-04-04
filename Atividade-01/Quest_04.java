package LP2;

public class Quest_04 {

 public static void main(String[]args){
        int cont_par=0, cont_impar=0, somaImpar=0, somaPar=0, somaTotal;
        
        for(int i = 0; i <= 100; i++){
            if(i % 2 != 0){
                cont_impar++; 
                somaImpar = somaImpar+i;   
            }           
        }
         System.out.println("Quantidade de números impares: "+cont_impar);
         System.out.println("A soma dos números impares é: "+somaImpar);
 
         for(int i=0 ; i<=100; i++){
             if(i%2==0){
                 cont_par++;
                 somaPar = somaPar+i;
             }    
         }
         somaTotal = somaPar+somaImpar;
  
         System.out.println("Quantidade de número pares: "+cont_par);
         System.out.println("A soma dos números pares é: "+somaPar);
         System.out.println("Soma dos números pares e de números impares é: " +somaTotal);
 }
}