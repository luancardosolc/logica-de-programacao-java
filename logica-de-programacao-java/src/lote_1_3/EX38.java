package lote_1_3;

/* Luan Cardoso
 * Receba 2 números inteiros, verifique qual o maior entre eles.
 * Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
 */
import javax.swing.JOptionPane;

public class EX38 {

    public static void main(String Args[]) {
        int x, y, s = 0;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        if (x <= y) {
            for (int i = x + 1; i < y; i++) {
                if (i % 2 != 0) {
                    s = s + i;
                }
            }
        } else {
            for (int i = y + 1; i < x; i++) {
                if (i % 2 != 0) {
                    s = s + i;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Somatória dos números impares é = " + s);

    }
}
