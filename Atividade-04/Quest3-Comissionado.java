package LP2A4;

public class Comissionado extends Funcionario {

    private double comissao;

    public Comissionado(String nome, int cpf, double salBase, double comissao) {
        super(nome, cpf, salBase);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double CalculaRendimento() {
        return (this.comissao + super.getSalBase());
    }
    
    @Override
    public void imprimeDados() {
        System.out.println("\nNome: " + super.getNome());
        System.out.println("Cpf: " + super.getCpf());
        System.out.println("Salário base: " + super.getSalBase());
        System.out.println("Valor final: " + this.CalculaRendimento());
    }
}