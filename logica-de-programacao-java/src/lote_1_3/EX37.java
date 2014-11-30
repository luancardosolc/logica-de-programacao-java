/* Luan Cardoso
 * Receba um número. Calcule emostre os resultados da tabuada desse número.
 */

import javax.swing.JOptionPane;

public class EX37 {
    public static void main (String args []) {
        int n,i,x;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        
        for (i=1;i<=10;i++) {
            x = n * i;
            System.out.println(n+" x "+i+" = "+x);
        }
    }
}
