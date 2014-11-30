package lote_1_1;

/* Luan Cardoso
 * Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
 */
import javax.swing.JOptionPane;

public class EX11 {

    public static void main(String args[]) {
        double c, r;
        r = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio:"));

        c = 2 * 3.1416 * r;

        System.out.println("O valor da circunferência é de: " + c);

    }
}
