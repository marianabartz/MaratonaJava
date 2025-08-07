package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean

        //criação de variável:
        int idade = 10; //valores inteiros
        long numeroLongo = 100000;
        double salarioDouble = 2000.0; //valores decimais
        float salarioFloat = 2500.0F; //valores decimais, precisa do F quando for float
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean falso = false;
        boolean verdadeiro = true;
        char caractere = '\u0041';
        String nome = "Mariana";

        System.out.println("A idade é " + idade + " anos");
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println(nome);


    }
}
