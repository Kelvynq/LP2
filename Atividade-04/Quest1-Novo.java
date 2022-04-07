package LP2A4;

public class Novo extends Imovel {

    private double adicional;

    public Novo(String end, double preco, double adicional) {
        super(end, preco);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    @Override
    public String toString() {
        return super.toString() + " Valor adicional: " + this.getAdicional() + " Valor total: " + (this.getPreco() + this.getAdicional());
    }
}
