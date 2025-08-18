package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {

    //CONDIÇAO ELSE IF
    public static void main(String[] args) {
        int idade = 12;
        if(idade <15){
            System.out.println("Categoria Infantil");
        }
        else if(idade >= 15 && idade<18){
            System.out.println("Categoria Juvenil");
        }
        else{
            System.out.println("Categoria Adulto");
        }


        //OUTRA FORMA DE REALIZAR A MESMA COISA:

        int idade02 = 16;
        String categoria;

        if(idade02 <15){
            categoria = "Categoria Infantil";
        } else if(idade02 >= 15 && idade02 <18){
            categoria ="Categoria Juvenil";
        } else{
            categoria ="Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
