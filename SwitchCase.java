import javax.swing.JOptionPane;
public class SwitchCase {
    public static void main(String [] args){
        int diaSemana = Integer.parseInt(JOptionPane
        .showInputDialog("Digite um valor de 1 a 7"));
        String res;

        switch (diaSemana) {
            case 1:
            res = "Domingo";
            break;
            case 2:
            res = "Segunda";
            break;
            case 3:
            res = "Terça";
            break;
            case 4:
            res = "Quarta";
            break;
            case 5:
            res = "Quinta";
            break;
            case 6:
            res = "Sexta";
            break;
            case 7:
            res = "Sábado";
            default:
            res = "Você não selecionou um dia da semana";
            break;
        }
         JOptionPane.showMessageDialog(null, res);
    }
    
}
