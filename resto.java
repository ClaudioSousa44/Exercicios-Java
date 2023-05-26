import java.util.Scanner;

public class resto{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor que voce deseja que seja dividido");
        int x = scanner.nextInt();

        System.out.println("Digite o divisor:");
        int divisor = scanner.nextInt();

        int divisao = x / divisor;
        int resto = x % divisor;

        System.out.println("O valor da divisão é: " + divisao + "\n" +
        "O valor do resto é: " + resto);
    }
}