import java.util.Random;

public class ExercicioSubtracao2vetores{
    public static void main(String [] args){
        int [] a = new int [10], b = new int[10], c = new int[10];
        Random r = new Random();
        int i;
        for ( i = 0; i<10; i++){
            a[i] = r.nextInt(100);
            b[i] = r.nextInt(100);
            c[i] = a[i] - b[i];
        }
        System.out.println("a = [" );
        for (i=0; i<10; i++){
            System.out.println(a[i] + " ");
        }
        System.out.println("]\nb = [");
        for (i=0; i<10; i++){
            System.out.println(b[i] + " ");
        }
        System.out.println("]\nc = [");
        for (i=0; i<10; i++){
            System.out.println(c[i] + " ");
        }
    }
}