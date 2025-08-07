package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Pedro";
        String endereco = "Rua Antonio Sereno Moretto, 55";
        double salario = 3400.13;
        String data = "07/08/2025";

        String relatorio = ("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + " na data " + data );
        System.out.println(relatorio);
        //ou também:
        //System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + " na data " + data );

    }
}
