/* Luan Cardoso
 * Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 */

import javax.swing.JOptionPane;

public class EX22 {
    public static void main (String args []) {
        
        Integer a,b,aux;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        
        while (a == b) {
            JOptionPane.showMessageDialog(null,"Os números não podem ser iguais! Digite outros valores:");
            a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número qualquer:"));
            b = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor diferente do anterior"));
        }

        if (a>b) {
            aux = b;
            b = a;
            a = aux;
        }

        JOptionPane.showMessageDialog(null,"Os números em Ordem Crescente são: "+a+" e "+b);

    }
}