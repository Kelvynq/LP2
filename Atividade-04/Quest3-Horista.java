package LP2A4;

public class Horista extends Funcionario {

    private int numHoras;
    private double valorHora;

    public Horista(String nome, int cpf, double salBase, int numHoras, double valorHora) {
        super(nome, cpf, salBase);
        this.numHoras = numHoras;
        this.valorHora = valorHora;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double CalculaRendimento() {
        return ((this.numHoras * this.valorHora) + super.getSalBase());
    }

    @Override
    public void imprimeDados() {
        System.out.println("\nNome: " + super.getNome());
        System.out.println("Cpf: " + super.getCpf());
        System.out.println("Salário base: " + super.getSalBase());
        System.out.println("Valor final: " + this.CalculaRendimento());
    }
}
