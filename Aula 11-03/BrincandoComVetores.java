import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class BrincandoComVetores {
    public static void main(String [] args){
        int[] v;
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        System.out.println("digite um tamanho de vetor para começar: ");
        int t = scanner.nextInt();

        while(t > 0){
            v = new int[t];
            System.out.println("\n O vetor:");

            for(int i = 0; i<t; i++){
                v[i] = r.nextInt(100);
                System.out.print(v[i] + " ");
            }
            int [] a = Arrays.sort(v);
          System.out.println); 

            System.out.println("\n\ndigite outro tamanho, 0 encerra: ");
            t = scanner.nextInt();
        }
    }
    
}
