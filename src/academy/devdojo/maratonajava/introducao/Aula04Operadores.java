package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / * OPERADORES ARITIMÉTICOS
        double numero1 = 10;
        double numero2 = 20;
        System.out.println(numero1 + numero2);
        System.out.println(numero1 - numero2);
        System.out.println(numero1 / numero2);
        // se tivéssemos declarado os numeros como inteiros, a divisão daria 0, pois divisão de inteiros resulta em numeros inteiros...
        System.out.println(numero1 * numero2);

        // % (RESTO DA DIVISÃO)
        int resto = 20 % 2;
        System.out.println(resto);

        // < > >= >= == != OPERADORES LÓGICOS == SEMPRE RETORNAM VALORES BOLEANOS
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualQueDez = 10 == 10.0;
        boolean isDezDiferenteQueVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualQueDez " + isDezIgualQueDez);
        System.out.println("isDezDiferenteQueVinte " + isDezDiferenteQueVinte);

        // && (AND), || (or), ! (NOT) OPERADORES LÓGICOS
        int idade = 29;
        float salario = 3500F;
        boolean isDentroLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println(isDentroLeiMenorQueTrinta);
        System.out.println(isDentroLeiMaiorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlay = 5080F;
        boolean isPlayCincoCompravel = valorTotalContaCorrente >
    }
}
