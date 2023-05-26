import java.util.Scanner;

public class Exercicio18array {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int i;
        int [] v = new int[10];
        System.out.println("Digite 10 valores");
        for ( i = 0; i < 10; i++ ){
            System.out.print((i + 1) + "º:");
            v[i] = scanner.nextInt();
        }
        System.out.println("Digite o valor para busca");
        int x = scanner.nextInt();
        int cont = 0;
        System.out.println("\nProcurando os multiplos de " + x);
        for (i = 0; i < 10; i++){
            if(v[i] % x == 0){
                System.out.println(v[i] + " ");
                cont++;
            }
        }

        System.out.println("\n Foram encontrados " + cont + " multiplos");
        scanner.close();


    }
}
