/* Luan Cardoso
 2.	Carregar um vetor[20] inteiros somente com positivos >= 1 e <= 100 os demais não carregar.
 Exibir:
 Soma dos números entre 10 a 30 e ímpares entre 40 a 10

 */

import javax.swing.JOptionPane;

public class Ex2 {

    public static void main(String args[]) {
        int vetor[] = new int[20];
        int num, soma = 0, somaImpar = 0;
        int i = 0;

        while (i < 20) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número:"));
            if (num >= 1 && num <= 100) {
                vetor[i] = num;

                if (vetor[i] >= 10 && vetor[i] <= 30) {
                    soma += vetor[i];
                }
                if (vetor[i] >= 40 && vetor[i] <= 100) {
                    if (vetor[i] % 2 != 0) {
                        somaImpar += vetor[i];
                    }
                }
                i++;
            } else {
                System.out.println("Digite número entre 1 e 100.");
            }
        }
        System.out.println("Soma dos números entre 10 e 30: " + soma + "\nSoma dos números ímpares entre 40 e 100: " + somaImpar);
    }
}
