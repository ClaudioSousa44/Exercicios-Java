import javax.swing.JOptionPane;

public class precoProduto {
    public static void main(String[] args){
        double preco = Double
        .parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
        double desconto = Double
        .parseDouble(JOptionPane.showInputDialog("Digite o desconto: "));
        double precoDesconto = (preco * desconto) / 100;
        double precoFinal = preco - precoDesconto;

        JOptionPane.showMessageDialog
        (null, "O valor com desconto é: " + precoFinal, 
        "Resultado ", 0);
    }
}
