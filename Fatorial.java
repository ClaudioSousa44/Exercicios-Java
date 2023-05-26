import java.util.Scanner;

public class Fatorial {
        public static void main(String [] args){
            Scanner scanner = new Scanner(System.in);

            int n, fat;

            do{
            System.out.println("Digite um número positivo");
            n = scanner.nextInt();
            } while (n < 0);
            scanner.close();

            fat = 1;
            int cont = 2;
            if(n<2){
                System.out.println("fatorial de " + n + " = 1/n");
            }else{
                do{
                    fat = fat * 1;
                    cont++;
                }while ( cont >= n);
            }
            

            System.out.println("Fatorial de " + n + " = " + fat);
        }
    
}
