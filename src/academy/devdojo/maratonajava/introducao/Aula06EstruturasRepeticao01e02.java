package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao01e02 {
    public static void main(String[] args) {
        //while, do while, for
        //WHILE - CONDIÇÃO
        int count = 12;
        while (count < 10) {
            System.out.println(count);
            count += 1;
        }
        //DO-WHILE - independente do retorno booleano, ele será executado pelo menos 1x
        do {
            System.out.println("dentro do do-while");
            count += 1;
        } while (count < 10);

        //FOR - INDICES
        for (int i = 0; i < 10; i++) { //declaracao de variavel, condicao e + incrementacao
            System.out.println("For " + i);
        }

        //EXEMPLO FOR. PEGAR TODOS OS PARES DE 0 A 1000000
        for (int i = 0; i <= 1000000; i++) { //USAMOS O ++ AO INVÉS DE +=2 POIS SE ALTERARMOS O INICIALIZADOR, DARIA ERRO.
            if (i % 2 == 0) { //PEGA SOMENTE OS PARES
                System.out.println(i);
            }


        }


    }
}

