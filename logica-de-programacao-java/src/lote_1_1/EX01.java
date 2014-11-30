/* LUAN CARDOSO
 *1.	Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
 */

import javax.swing.JOptionPane;

public class EX01 {

    public static void main(String args[]) {
        double lado, area;
        lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado do quadrado"));
        area = lado * lado;
        JOptionPane.showMessageDialog(null, "A área do quadrado é: " + area);
    }
}
