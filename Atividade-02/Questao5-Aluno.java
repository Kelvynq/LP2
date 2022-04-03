package LP2A2;

public class Aluno{

    private String nome;	
    private Disciplina disciplina;
    
    public Aluno(String nome, Disciplina disciplina){		
        this.nome = nome;	        
        this.disciplina = disciplina;			
    }
		
    public String getNome(){	
        return this.nome;	
    }
    public void setNome(String nome){	
        this.nome = nome;	
    }
	
    public Disciplina getDisciplina(){	
        return this.disciplina;	
    }	
    public void setDisciplina(Disciplina disciplina){	 
        this.disciplina = disciplina;	
    }

    public void exibirResultado(){	
        System.out.println("Nome: " + getNome());
	System.out.println("Disciplina: " + disciplina.getNome());
        System.out.println("Nota 1: " + disciplina.getNota1());    
        System.out.println("Nota 2: "+ disciplina.getNota2());
	System.out.println("Média: " + disciplina.calcularMedia());			
    }
}

