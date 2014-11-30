/* Luan Cardoso
 * Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos).
 * Calcule e mostre a velocidade média em km/h.
 */

import javax.swing.JOptionPane;

public class EX27 {
    public static void main (String args []) {
        double v,c,d,vm;
        /*legenda:
         * v = voltas
         * c = circuito
         * d = duração
         * vm = velocidade média
         */
        
        v = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de voltas:"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensão do circuito em metros:"));
        d = Double.parseDouble(JOptionPane.showInputDialog("Digite a tempo de duração em minutos:"));
        
        c = c/1000;
        d = d/60;
        vm = v*c/d;
        
        System.out.println("A velocidade média é de "+vm+" km/h");
        
    }
}
