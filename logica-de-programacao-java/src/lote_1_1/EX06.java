package lote_1_1;

/* Luan Cardoso
 * Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
 */
import javax.swing.JOptionPane;

public class EX06 {

    public static void main(String args[]) {
        double x, y, aux;
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° Número"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° Número"));
        aux = x;
        x = y;
        y = aux;
        System.out.println("Estes são os conteúdos trocados: " + x + " e " + y);

    }
}
