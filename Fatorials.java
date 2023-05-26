public class Fatorials {
    public static void main(String[] args) {
        int n;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro positivo"));
        } while (n < 0);
        for (int i = 0; i <= n; i++) {
            int cont = 2;
            int fat = 1;
            while (cont <= 1) {
                fat = fat * cont;
                cont++;
            }
            JOptionPane.showMessageDialog(null, "fatorial de " + i + " = " + fat);

        }

    }
}
