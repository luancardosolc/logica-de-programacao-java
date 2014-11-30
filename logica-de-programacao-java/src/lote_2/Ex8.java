/* Luan Cardoso
 8.Coletar 100 valores de um lance em um leilão 
 Calcule e mostre:
 maior valor, 2 maior valor, media dos valores
 */

import javax.swing.JOptionPane;

public class Ex8 {

    public static void main(String args[]) {
        int[] vetor = new int[100];
        int i, j, troca;
        double media = 0;

        for (i = 0; i < 100; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor:"));
            media += vetor[i];
        }

        i = 0;

        while (i < 2) {
            j = i;
            while (j < 99) {
                if (vetor[i] < vetor[j + 1]) {
                    troca = vetor[i];
                    vetor[i] = vetor[j + 1];
                    vetor[j + 1] = troca;
                }
                j++;
            }
            i++;
        }

        media /= 100;

        JOptionPane.showMessageDialog(null, "Maior valor: " + vetor[0] + "\n2º maior valor: " + vetor[1] + "\nMédia dos valores: " + media);
    }
}
