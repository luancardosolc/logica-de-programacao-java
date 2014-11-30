package lote_1_3;

/* Luan Cardoso
 * Receba um número inteiro. Calcule e mostre o seu fatorial.
 */
import javax.swing.JOptionPane;

public class EX35 {

    public static void main(String args[]) {
        int n, x = 1, i = 1;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        while (i <= n) {
            x = x * i;
            i++;
        }
        JOptionPane.showMessageDialog(null, "O fatorial é: " + x);
    }
}
