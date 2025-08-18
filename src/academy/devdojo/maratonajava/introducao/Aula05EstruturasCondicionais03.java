package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

        double salario = 3000;
        String mensagemDoar = "Eu vou doar 500";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";
//        if(salario > 500){
//            System.out.println(mensagemDoar);
//        }else{
//            System.out.println(mensagemNaoDoar);
//        }

        //OPERADOR TERNÁRIO == (condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
        //OUUU
//      System.out.println(salario>500 ? mensagemDoar : mensagemDoar);
    }
}
