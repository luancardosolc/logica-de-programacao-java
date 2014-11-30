/* Luan Cardoso
30.Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos).
   Calcule e mostre a velocidade média em km/h.
*/

import javax.swing.JOptionPane;

public class EX30 {
    public static void main (String args []) {
        double v,c,d,vm;
        /*v = voltas
         * c = circuito
         * d = duração
         * vm = velocidade média
         */
        
        v = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de voltas:"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensão do circuito em metros"));
        d = Double.parseDouble(JOptionPane.showInputDialog("Digite a duração em minutos:"));
        
        vm = ((v*c)/1000)/(d/60);
        
        JOptionPane.showMessageDialog(null,"A velocida média é de "+vm+" km/h");       
    }
}
