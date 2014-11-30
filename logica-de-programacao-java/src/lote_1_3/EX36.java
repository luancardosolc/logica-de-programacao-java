package lote_1_3;

/* Luan Cardoso36.
 Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
 */
import javax.swing.JOptionPane;

public class EX36 {

    public static void main(String args[]) {
        double n, i, s = 0;

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        s = 1;
        System.out.println("  " + s);

        for (i = 2; i <= n; i++) {
            s = s + 1 / i;
            System.out.println("+ " + s);
        }
        System.out.println("A soma da série é:" + s);
    }
}
