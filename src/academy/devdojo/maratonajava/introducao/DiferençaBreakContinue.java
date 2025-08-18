package academy.devdojo.maratonajava.introducao;

public class DiferençaBreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++){
            if (i==5){
                System.out.println("o 5 vai ser pulado");
                continue;
            }
            if (i==7){
                System.out.println("vai parar no 7 ");
                break;
            }
            System.out.println(i);
        }

    }
}
