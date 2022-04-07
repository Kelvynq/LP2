package LP2A4;

public class Aplicacao3 {

    public static void main(String[] args) {

        Funcionario horista = new Horista("Juliette", 254236845, 1500, 5, 12);
        Funcionario clt = new CLT("Fiuk", 12587946, 1500, 100);
        Funcionario comissionado = new Comissionado("Camila de Lucas", 874452456, 1500, 150);

        System.out.println("\n===FUNCIONÁRIOS===");
        horista.imprimeDados();
        clt.imprimeDados();
        comissionado.imprimeDados();
    }
}