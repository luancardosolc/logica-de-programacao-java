/* Luan Cardoso
 * Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia
 */

import javax.swing.JOptionPane;

public class EX13 {
    public static void main (String args []) {
        double a,d;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de alimentos em quilos:"));
        
        d = ((a*1000)/50);
        
        System.out.println("Esse alimento durará "+d+" dias.");
        
    }
}
