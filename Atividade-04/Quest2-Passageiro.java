package LP2A4;

public class Passageiro {

    private double valor;
    private String poltrona;
    private int idade;

    public Passageiro(double valor, String poltrona, int idade) {
        this.valor = valor;
        this.poltrona = poltrona;
        this.idade = idade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(String poltrona) {
        this.poltrona = poltrona;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Valor: " + this.valor + "  Poltrona: " + this.poltrona + "  Idade: " + this.idade;
    }
}
