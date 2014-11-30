package lote_1_2;

/* Luan Cardoso
 * Receba 2 valores reais. Calcule e mostre o maior deles.
 */
import javax.swing.JOptionPane;

public class EX19 {

    public static void main(String Args[]) {

        double x, y;

        x = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        if (x > y) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + x);
        }

        if (y > x) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + y);
        }

    }
}
