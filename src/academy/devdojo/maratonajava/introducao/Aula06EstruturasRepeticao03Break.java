package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao03Break {
    public static void main(String[] args) {
        //IMPRIMA OS PRIMEIROS 25 NUMEROS DE UM DADO VALOR
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                break; //QUEBRA O LAÇO
            }
            System.out.println(i);
        }
    }
}
