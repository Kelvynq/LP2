package LP2A4;

public class Velho extends Imovel {

    private double desconto;

    public Velho(String end, double preco, double desconto) {
        super(end, preco);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return super.toString() + " Desconto: " + this.getDesconto() + " Valor total: " + (this.getPreco() - this.getDesconto());
    }
}
