package lote_1_2;

/* Luan Cardoso
 * Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
 */
import javax.swing.JOptionPane;

public class EX24 {

    public static void main(String args[]) {
        double x, resto3, resto2;

        x = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para verificar se o mesmo é divisível por 2 e/ou 3:"));

        resto2 = x % 2;
        resto3 = x % 3;

        if (resto2 == 0 && resto3 == 0) {
            JOptionPane.showMessageDialog(null, x + " É divisível por 2 e 3!");
        } else {
            if (resto2 != 0 && resto3 != 0) {
                JOptionPane.showMessageDialog(null, x + " Não é divisível nem por 2 e nem por 3!");
            } else {
                if (resto2 != 0) {
                    JOptionPane.showMessageDialog(null, x + " É divisível por 3 mas não é por 2!");
                } else {
                    JOptionPane.showMessageDialog(null, x + " É divisível por 2 mas não é por 3");
                }
            }
        }
    }
}
