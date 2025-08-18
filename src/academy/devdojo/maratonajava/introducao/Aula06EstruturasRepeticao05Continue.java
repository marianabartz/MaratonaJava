package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao05Continue {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
           if(valorParcela<1000){
               continue; // pula para a próxima iteração do loop, sem imprimir
            }
            System.out.println(parcela + " Parcelas de: " + "R$" + valorParcela);

        }
    }
}
