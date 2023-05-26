

import javax.swing.JOptionPane;
public class distanciaEntreDoisPontos {
     public static void main(String[] args) {
        
        String x = JOptionPane.showInputDialog("Digite o valor de x do primeiro ponto: ");
        Double x1 = Double.parseDouble(x);
        String y = JOptionPane.showInputDialog("Digite o valor de y do primeiro ponto: ");
        Double y1 = Double.parseDouble(y);

        String aux = JOptionPane.showInputDialog("Digite o valor de x do segundo ponto: ");
        Double x2 = Double.parseDouble(aux);
        String aux1 = JOptionPane.showInputDialog("Digite o valor de y do segundo ponto: ");
        Double y2 = Double.parseDouble(aux1);

        Double contaX = Math.sqrt((x1-x2)*(x1-x2) + (y1-y1)*(y1*y2));
        JOptionPane.showMessageDialog(null, "O resultado foi:" + contaX, 
        "Resultado!", 2);
        
    }
}