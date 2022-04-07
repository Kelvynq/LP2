package LP2A4;

public class CLT extends Funcionario {

    private double atributo;

    public CLT(String nome, int cpf, double salBase, double atributo) {
        super(nome, cpf, salBase);
        this.atributo = atributo;
    }

    public double getAtributo() {
        return atributo;
    }

    public void setAtributo(double atributo) {
        this.atributo = atributo;
    }

    @Override
    public double CalculaRendimento() {
        return (super.getSalBase() - this.atributo);
    }

    @Override
    public void imprimeDados() {
        System.out.println("\nNome: " + super.getNome());
        System.out.println("Cpf: " + super.getCpf());
        System.out.println("Salário base: " + super.getSalBase());
        System.out.println("Valor final: " + this.CalculaRendimento());
    }
}
