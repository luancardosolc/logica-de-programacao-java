package lote_1_3;

/* Luan Cardoso
 Receba 2 números inteiros.
 Verifique e mostre todos os números primos existentes entre eles.
 */
import javax.swing.JOptionPane;

public class EX43 {

    public static void main(String args[]) {
        int a, b;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        if (a >= b) {
            while (b <= a) {
                if (b == 2 || b == 3 || b % 2 != 0 && b % 3 != 0) {
                    System.out.println(b);
                }
                b++;
            }
        } else {
            while (a <= b) {
                if (a == 2 || a == 3 || a % 2 != 0 && a % 3 != 0) {
                    System.out.println(a);
                }
                a++;
            }
        }
    }
}
