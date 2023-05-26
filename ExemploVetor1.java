// Ler um vetor de um tamanho escolhido pelo user e depois exibir os valores na ordem inversa
import java.util.Scanner;
public class ExemploVetor1 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int tamanho;
        System.out.println("Digite o tamanho do vetor: ");
        tamanho = scanner.nextInt();
        int[] v = new int [tamanho];
   
        System.out.println("Agora digite " + tamanho + " valores");
        int boiadeira = 0;
        while(boiadeira < tamanho ){
            System.out.println("posição " + boiadeira + ": ");
            v[boiadeira] = scanner.nextInt();
            boiadeira++;
        }
        int i = tamanho - 1;
        while(i >= 0){
            System.out.println("posição " + i + " = " + v[i] );
            i--;
        }
        scanner.close();
    }
}
