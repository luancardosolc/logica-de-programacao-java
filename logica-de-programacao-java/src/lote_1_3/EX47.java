package lote_1_3;

/* Luan Cardoso
 Receba o número da base e do expoente. Calcule e mostre o valor da potência.
 */
import javax.swing.JOptionPane;

public class EX47 {

    public static void main(String args[]) {
        int p, e, b;
        /*legenda:
         * b= base
         * e= espoente
         * p = potencia
         */
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base:"));
        e = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do expoente:"));
        p = b;
        if (e == 0) {
            p = 1;
        } else {
            for (int i = 2; i <= e; i++) {
                p *= b;
            }
        }
        JOptionPane.showMessageDialog(null, b + "^" + e + " = " + p);
    }
}
