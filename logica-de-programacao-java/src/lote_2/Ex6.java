/* Luan Cardoso
 6.Carregar um vetor[50] números inteiros.Classificar o vetor em ordem crescente e apresente os valores.
 */

import javax.swing.JOptionPane;

public class Ex6 {

    public static void main(String args[]) {
        int[] vetor = new int[50];
        int i, j, troca;
        for (i = 0; i < 50; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número:"));
        }
        
        i = 0;
        
        while (i < 49) {
            j = i;
            while (j < 49) {
                if (vetor[i] > vetor[j + 1]) {
                    troca = vetor[i];
                    vetor[i] = vetor[j + 1];
                    vetor[j + 1] = troca;
                }
                j++;
            }
            i++;
        }
        
        for (i = 0; i < 50; i++) {
            System.out.println(vetor[i]);
        }
    }
}
