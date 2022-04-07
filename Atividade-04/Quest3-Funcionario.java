package LP2A4;

public class Funcionario {

    private String nome;
    private int cpf;
    private double salBase;

    public Funcionario(String nome, int cpf, double salBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salBase = salBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public double getSalBase() {
        return salBase;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    public double CalculaRendimento() {
        return salBase;
    }

    public void imprimeDados() {
        System.out.println("\nNome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Salário base: " + this.salBase);
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " Salário: " + this.salBase;
    }
}