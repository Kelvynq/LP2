package LP2A4;

public class Aplicacao1 {

    public static void main(String[] args) {

        Imovel vendaNovo1 = new Novo("Bairro: Copacabana  Rua: Ladeira do Leme  N:245", 150000, 15000);
        Imovel vendaNovo2 = new Novo("Bairro: Honório Gurgel  Rua: Crisólia  N:160", 100000, 8000);
        Imovel vendaVelho1 = new Velho("Bairro: Ilha do Governador  Rua: Marau  N:157 ", 120000, 10000);
        Imovel vendaVelho2 = new Velho("Bairro: Leblon  Rua: Dom Pedrito  N:621", 400000, 12000);

        System.out.println("\n====IMOVEL NOVO====");
        System.out.println(vendaNovo1);
        System.out.println(vendaNovo2);

        System.out.println("\n====IMOVEL VELHO====");
        System.out.println(vendaVelho1);
        System.out.println(vendaVelho2);
    }
}
