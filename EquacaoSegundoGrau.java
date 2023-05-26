import java.util.Scanner;
public class EquacaoSegundoGrau {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o valor de A: ");
        double a = scanner.nextDouble();

        if(a == 0){
            System.out.println("Não é uma equação de segundo grau");

        }else{
            System.out.println("Digite o valor de B:");
            double b = scanner.nextDouble();
            System.out.println("Digite o valor de C: ");
            double c = scanner.nextDouble();

            double delta = b*b + (-4*a*c);
            if(delta < 0){
                System.out.println("Não tem raiz real");

            }else{
                double x1 = (-b + Math.sqrt(delta)) / 2*a;
                double x2 = (-b - Math.sqrt(delta)) / 2*a;
                System.out.println("O valor de x1 é: " + x1 + " O valor de x2 é: " + x2);
            }
        }
    }
}
