package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao04ExerBreak {
    public static void main(String[] args) {
        //DADO UM VALOR DE UM CARRO, DESCUBRA QUANTAS VEZES ELE PODE SER PARCELADO
        //CONDICAO VALORPARCELA >= 1000

        double valorTotal = 30000;
        for (int parcela = 1; parcela <valorTotal; parcela++){
            double valorParcela = valorTotal/parcela;
            if (valorParcela< 1000){
                break;
            }
            System.out.println(parcela + " Parcelas de: " + "R$" + valorParcela);

        }

    }
}
