package LP2A4;

public class Aplicacao2 {

    public static void main(String[] args) {

        Passageiro[] passageiros = new Passageiro[6];

        passageiros[0] = new Idoso(50, "B1", 65);
        passageiros[1] = new Estudante(50, "C3", 15, "Escola Estrela felix");
        passageiros[2] = new Passageiro(50, "B2", 36);
        passageiros[3] = new Idoso(50, "C1", 72);
        passageiros[4] = new Estudante(50, "A3", 18, "Escola Fernando Almeida");
        passageiros[5] = new Passageiro(50, "B2", 36);

        System.out.println("\n===Passageiros===\n");
        for (int i = 0; i < 6; i++) {
            System.out.println(i + 1 + "- " + passageiros[i].toString());
        }
    }
}
