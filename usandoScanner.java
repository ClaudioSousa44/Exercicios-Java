import java.util.Scanner;

// ler o premio da mega-sena e dividi-lo entre 3 jogadores:
// 1- 46
// 2- 32%
// 3- restante

public class usandoScanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o valor do premio? ");
        double valorPremio = scanner.nextDouble();

        double primeiroGanhador = (valorPremio * 46) / 100;
        double segundoGanhador = (valorPremio * 32) / 100;
        double terceiroGanhador = (valorPremio - segundoGanhador - primeiroGanhador);

        System.out.println("O primeiro ganhador fica com: " + String.format("%.2f", primeiroGanhador ) +
        " o segundo ganhador fica com: " +  String.format("%.2f", segundoGanhador ) + 
        " o terceiro ganhador fica com: " +  String.format("%.2f", terceiroGanhador ));

    }
    
}
