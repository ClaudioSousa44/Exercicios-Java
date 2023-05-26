import java.util.Scanner;
public class Equacao {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        double a = scanner.nextDouble();
        System.out.println("Digite o valor de B: ");
        double b =  scanner.nextDouble();

        if(a == 0){
            System.out.println("O valor de A não pode ser 0.");
        }else {
            double x = -b/a;
            System.out.println("O valor de x é: " + x);

        }
        
    }
}
