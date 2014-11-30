/* Luan Cardoso
 5.	Carregar um vetor[5] inteiros com valores positivos entre 1 a 50 .
 * Calcular o fatorial de cada elemento do vetor e apresente o resultado.
 */

import javax.swing.JOptionPane;

public class Ex5 {

    public static void main(String args[]) {
        int[] v = new int[5];
        int f = 1;

        for (int i = 0; i < 5; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número:"));
        }

        for (int i = 0; i < 5; i++) {
            f = 1;
            for (int j = 0; j < v[i]; j++) {
                f *= (j + 1);
            }
            System.out.println(v[i] + "! = " + f);
        }

    }
}
