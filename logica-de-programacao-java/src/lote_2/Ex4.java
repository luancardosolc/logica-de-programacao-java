/* Luan Cardoso
 4.	Carregar  valores inteiros em 2 vetores vta[5] e vtb[10].
 * Concatenar os valores em um terceiro vetor c [15].Mostre seus conteúdos
 */

import javax.swing.JOptionPane;

public class Ex4 {

    public static void main(String args[]) {
        int[] vta = new int[5];
        int[] vtb = new int[10];
        int[] vtc = new int[15];

        for (int j = 0; j < 15; j++) {
            if (j < 5) {
                vta[j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (j + 1) + "º número:"));
                vtc[j] = vta[j];
            }
            if (j > 4 && j < 15) {
                vtb[j - 5] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (j + 1) + "º número:"));
                vtc[j] = vtb[j - 5];
            }
        }

        for (int j = 0; j < 15; j++) {
            System.out.println(vtc[j]);
        }
    }
}
