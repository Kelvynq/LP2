package LP2A4;

public class Estudante extends Passageiro {

    private String escola;

    public Estudante(double preco, String poltrona, int idade, String escola) {
        super(preco, poltrona, idade);
        this.escola = escola;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    @Override
    public String toString() {
        return "Valor: " + (super.getValor() / 2) + "  Poltrona: " + super.getPoltrona() + "  Idade: " + super.getIdade() + "  Escola: " + this.escola;
    }
}
