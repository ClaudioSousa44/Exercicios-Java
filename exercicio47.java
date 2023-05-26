import java.util.Scanner;

public class exercicio47{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 4 dígitos:");
        int number = scanner.nextInt();

        int mil = number / 1000;
        int cent = number % 100;
        int dez = number / 10;
        int rest = number % 10;

        System.out.println(" a resposta é: " + rest + dez   + cent + mil);
    }
}