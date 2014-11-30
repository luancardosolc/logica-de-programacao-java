package lote_1_3;

/* Luan Cardoso
 * Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor.
 Obs.: somente valores positivos.
 */
import javax.swing.JOptionPane;

public class EX41 {

    public static void main(String args[]) {
        int n, ma = 1, me = 1;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N:"));
        if (n > -1) {
            ma = n;
            me = n;
        }
        for (int i = 1; i < 10; i++) {
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N:"));
            if (n > ma) {
                ma = n;
            }
            if (n < me) {
                me = n;
            }
        }
        System.out.println("O maior número é:" + ma);
        System.out.println("O menor número é:" + me);
    }
}
