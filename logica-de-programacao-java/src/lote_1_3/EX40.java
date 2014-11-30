package lote_1_3;

/* Luan Cardoso
 * 11.	Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
 */
import javax.swing.JOptionPane;

public class EX40 {

    public static void main(String Args[]) {
        int n, i = 1, a, b, s;

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N:"));
        a = 0;
        b = 1;
        String buffer = "";

        while (i <= n) {
            s = a + b;
            a = b;
            b = s;
            buffer += ("\n" + s);
            i++;
        }
        JOptionPane.showMessageDialog(null, "A série é:" + buffer);
    }
}
