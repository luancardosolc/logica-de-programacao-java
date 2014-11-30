package lote_3;

/* Luan Cardoso
 * Método para calcular a Ex_01_quantidade.
 */

import javax.swing.*;

public class Ex_01_quantidade {

    static int m[][] = new int[4][3];

    static void ManipulaQuantidade() {
        for (int i = 0; i <= 3; i++) {
            for (int k = 0; k <= 2; k++) {
                m[i][k] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos vendidos na " + (i + 1) + " semana de código " + (k + 1)));
            }
        }
    }

    static void venda_mes() {
        int s = 0;

        for (int k = 0; k <= 2; k++) {
            for (int i = 0; i <= 3; i++) {
                s = s + m[i][k];
            }
            System.out.println("A quantidade do produto de código " + (k + 1) + " vendidos no mês é " + s);
            s=0;
        }
    }

    static void venda_semana() {
        int s = 0;
        for (int i = 0; i <= 3; i++) {

            for (int k = 0; k <= 2; k++) {
                s = s + m[i][k];
                System.out.println("A quantidade de produtos vendidos na semana " + (i + 1) + " de código " + (k + 1) + " é " + s);
                s = 0;
            }
        }
    }

    static void total() {
        int s = 0;
        for (int i = 0; i <= 3; i++) {
            for (int k = 0; k <= 2; k++) {
                s = s + m[i][k];
            }
        }
        System.out.println("O total de produtos é " + s);

    }
}