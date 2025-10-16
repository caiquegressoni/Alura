public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;
        System.out.println("Incluído no plano: " + incluidoNoPlano);

        double avaliadorUm = 8.1;
        double avaliadorDois = 6.5;
        double avaliadorTres = 7.9;

        double notaDoFilme = (avaliadorUm + avaliadorDois + avaliadorTres) / 3;
        System.out.println("Nota do filme: " + notaDoFilme);

        String sinopse;

        sinopse = """
                Após mais de trinta anos de serviço como um dos principais aviadores da Marinha,
                Pete "Maverick" Mitchell (Tom Cruise) está onde sempre pertenceu, voando alto
                como um piloto de testes corajoso e destemido. Mas quando ele encontra o
                tenente Bradley Bradshaw (Miles Teller), filho de seu falecido amigo e
                companheiro de vôo Nick "Goose" Bradshaw, Maverick se vê confrontado com
                fantasmas do passado enquanto treina um grupo de graduados da Top Gun para uma
                missão especializada que nenhum piloto vivo jamais viu.
                """;
        System.out.println("Sinopse: " + sinopse);
    }
}
