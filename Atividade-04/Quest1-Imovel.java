package LP2A4;

public class Imovel {

    private String end;
    private double preco;

    public Imovel(String end, double preco) {
        this.end = end;
        this.preco = preco;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "- ENDEREÇO\n" + this.end + "\nValor: " + this.preco;
    }
}
