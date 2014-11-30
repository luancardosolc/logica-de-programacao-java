/* Luan Cardoso
Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento.
* Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%.
* Demais tipos não serão considerados
*/

import javax.swing.JOptionPane;

public class EX29 {
    public static void main (String args []) {
        int ti;
        double v;
        /*Legenda:
         * ti = tipo de investimento
         * v = valor
         */
        
        ti = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Poupança e 2 para Renda Fixa:"));
        
        while (ti != 1 && ti !=2) {
            ti = Integer.parseInt(JOptionPane.showInputDialog("Opção inválida! Digite 1 para Poupança e 2 para Renda Fixa:"));
        }
        
        if (ti == 1) {
            v = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor:"));
            v = v+v*3/100;
            JOptionPane.showMessageDialog(null,"O valor corrigido para o periodo de 30 dias será de: R$ "+v);
        }
        if (ti == 2) {
            v = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor:"));
            v = v+v*5/100;
            JOptionPane.showMessageDialog(null,"O valor corrigido para o periodo de 30 dias será de R$ "+v);
        }
    }
}
