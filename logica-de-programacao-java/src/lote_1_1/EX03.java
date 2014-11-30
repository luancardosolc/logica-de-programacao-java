package lote_1_1;

/* Luan Cardoso
 * Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
 */

import javax.swing.JOptionPane;

public class EX03 {

    public static void main(String args[]) {
        double base, altura, area;
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo"));
        area = (base * altura) / 2;
        JOptionPane.showMessageDialog(null, "A área do triãngulo é: " + area);

    }

}
