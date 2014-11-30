/* Luan Cardoso
 * Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
Se a média for >= 6,0 exibir “APROVADO”;
Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
Se a média for < 3,0 exibir “RETIDO”.
 */

import javax.swing.JOptionPane;

public class EX21 {
    public static void main (String args []) {
        
        double b1,b2,b3,b4,media;


        b1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota no 1° Bim:"));
        b2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota no 2° Bim:"));
        b3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota no 3° Bim:"));
        b4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota no 4° Bim:"));

        media = (b1+b2+b3+b4)/4;

        if (media>=6) {
            JOptionPane.showMessageDialog(null,"Aprovado");
        }
        if (media<6 && media>=3) {
            JOptionPane.showMessageDialog(null,"Exame");
        }
        if (media < 3) {
            JOptionPane.showMessageDialog(null,"Reprovado");
        }
    }
}