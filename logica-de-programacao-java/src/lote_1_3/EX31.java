/* Luan Cardoso
 2.	Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
 Venda Mensal	Preço Atual	Preço Novo
 < 500	< 30	+ 10%
 >= 500 e < 1000	>= 30 e < 80	+15%
 >= 1000	>= 80	- 5%
 Obs.: para outras condições, preço novo será igual ao preço atual.
 */

import javax.swing.JOptionPane;

public class EX31 {

    public static void main(String args[]) {
        double vm, pa, pn = 0;
        /*legenda
         * pa = preco atual
         * pn = preco novo
         * vm = venda mensal
         */

        vm = Double.parseDouble(JOptionPane.showInputDialog("Digite a venda mensal:"));
        pa = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual:"));

        if (vm < 500 && pa < 30) {
            pn = pa + pa * 10 / 100;
        }
        if (vm >= 500 && vm < 1000 && pa >= 30 && pa < 80) {
            pn = pa + pa * 15 / 100;
        }
        if (vm >= 1000 && pa >= 80) {
            pn = pa - pa * 5 / 100;
        } else {
            pn = pa;
        }
        JOptionPane.showMessageDialog(null, "O novo preço do produto é de R$ " + pn);

    }
}