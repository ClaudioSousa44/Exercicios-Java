import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        System.out.println
        ("Escolha a operação: \n + -> soma \n - -> subtração \n * -> multiplicação \n / -> divisão");
        char opcao = scanner.next().charAt(0);
        double resultado = 0;

        switch (opcao){
            case '+':
            resultado = numero1 + numero2;
            break;
            case '-':
            resultado = numero1 - numero2;
            break;
            case '*':
            resultado = numero1 * numero2;
            break;
            case '/':
            if(numero2 == 0){
                System.out.println("O divisor não pode ser 0");
            }else{
                resultado = numero1 / numero2;
            }
            break;
            default:
            System.out.println("Você não selecionou a operação");
        }

        System.out.println("O resultado é: " + resultado);

        scanner.close();
    }
}
