/* Luan Cardoso
 * Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
 */

import javax.swing.JOptionPane;

public class EX12 {

    public static void main(String args[]) {
        int ano_nasc, ano_atual, idade, idade_final;

        //Receber as datas
        ano_nasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:"));
        ano_atual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));

        //Cálculo da idade
        idade = ano_atual - ano_nasc;
        idade_final = idade + 17;

        //Saída de dados
        System.out.println("A idade atual é : " + idade+" anos");
        System.out.println("A idade daqui a 17 anos será: " + idade_final+" anos");

    }
}
