package lote_1_3;

/* Luan Cardoso
 * Receba um número. Calcule e mostre os resultados da tabuada desse número.
 */
import javax.swing.JOptionPane;

public class EX37 {

    public static void main(String args[]) {
        int n, i, x;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        String buffer = "";

        for (i = 1; i <= 10; i++) {
            x = n * i;
            buffer += ("\n" + n + " x " + i + " = " + x);
        }

        JOptionPane.showMessageDialog(null, buffer);
    }
}
