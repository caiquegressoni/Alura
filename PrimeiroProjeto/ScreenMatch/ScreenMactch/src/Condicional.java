public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1986;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;

        String tipoPlano = "plus";

        if(anoDeLancamento >= 2022){
            System.out.println("Filmes recentes");
        }else{
            System.out.println("Filmes antigos");
        }

        if(incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        }else{
            System.out.println("Deve pagar a locação do filme");
        }
    }
}
