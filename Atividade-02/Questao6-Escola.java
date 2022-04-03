package LP2A2;

public class Escola{
	
    public static void main(String[] args){
		
        Disciplina disciplina1 = new Disciplina("Matemática",6,5);	
        Aluno aluno1 = new Aluno("Pedro Saulo", disciplina1);		
        Disciplina disciplina2 = new Disciplina("Geografia",8,7);	
        Aluno aluno2 = new Aluno("Vitória Santos", disciplina2);
	
	System.out.println("\n=== Aluno 1 === ");
	aluno1.exibirResultado();	
        System.out.println("\n=== Aluno 2 ===");
	aluno2.exibirResultado();

    }	        
}    
