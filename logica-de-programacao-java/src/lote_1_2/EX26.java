/* Luan Cardoso
 * Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
 */

import javax.swing.JOptionPane;

public class EX26 {

    public static void main(String args[]) {
        int x, y, resto;
        
        JOptionPane.showMessageDialog(null,"Digite dois números em qualquer ordem, para verificar se o maior é multiplo do menor:");
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));

        if (x > y) {
            resto = x % y;
            if (resto == 0) {
                JOptionPane.showMessageDialog(null, x + " é multiplo de " + y);
            } else {
                JOptionPane.showMessageDialog(null, x + " não é multiplo de " + y);
            }
        } else {
            resto = y % x;
            if (resto == 0) {
                JOptionPane.showMessageDialog(null, y + " é multiplo de " + x);
            } else {
                JOptionPane.showMessageDialog(null, y + " não é multiplo de " + x);
            }
        }
    }
}