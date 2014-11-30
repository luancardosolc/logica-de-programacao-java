/* Luan Cardoso
 3.	Carregar um vetor A[20] inteiros (positivos e ou negativos).Calcular a soma seguindo:
 (A[1] – A[21-i])^2

 */

import javax.swing.JOptionPane;

public class Ex3 {

    public static void main(String args[]) {
        int vetor[] = new int[20];
        int soma;

        for (int i = 0; i < 20; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número:"));
        }

        for (int i = 0; i < 10; i++) {
            soma = vetor[i] - vetor[19 - i];
            soma *= soma;
            System.out.println("Soma: (" + vetor[i] + " - " + vetor[19 - i] + ")² = " + soma);
        }

    }
}
