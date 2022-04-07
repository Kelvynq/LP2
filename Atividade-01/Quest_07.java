package LP2;

public class Quest_07 {
    public static void main(String[] args){
 
        int ano=1998;
        
        if(ano % 400 == 0 || (ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println(ano + " é um ano bissexto!!");           
        } else 
            System.out.println(ano + " não é um ano bissexto!!");
        }
    }
