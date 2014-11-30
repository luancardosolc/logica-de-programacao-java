package lote_1_2;

/* Luan Cardoso
 * Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.
 */
import javax.swing.JOptionPane;

public class EX18 {

    public static void main(String Args[]) {

        double x, y, z = 0;

        x = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        if (x > y) {
            z = x - y;
        }

        if (x < y) {
            z = y - x;
        }

        JOptionPane.showMessageDialog(null, "A diferença entre os números é: " + z);

    }

}
