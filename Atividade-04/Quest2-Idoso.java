package LP2A4;

public class Idoso extends Passageiro {

    public Idoso(double preco, String poltrona, int idade) {
        super(preco, poltrona, idade);
    }

    @Override
    public String toString() {
        return "Valor: " + (super.getValor() * 0.7) + "  Poltrona: " + super.getPoltrona() + "  Idade: " + super.getIdade();
    }
}
