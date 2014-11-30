/* Luan Cardoso
 7.Em uma eleição para prefeito, haverá 4 candidatos.
 Coletar os votos para os candidatos com uma urna eleitoral.
 A votação se encerra com o código 999.Calcule e mostre :
 Vencedor e quantidade de votos
 vice e quantidade de votos
 números de votos brancos e nulos

 */

import javax.swing.JOptionPane;

public class Ex7 {

    public static void main(String args[]) {
        int[] vetor = new int[6];
        int[] vetor2 = new int[4];
        int i, j, troca;
        int ca = 0, venc, vice, votos, vb, vn;
        
        
        String nomeVenc = "", nomeVice = "";

        
        while (ca != 999) {
            ca = Integer.parseInt(JOptionPane.showInputDialog(
                    "Códigos:         " + "Prefeitos:"
                    + "\n10                     João da Silva"
                    + "\n15                     Maria José"
                    + "\n20                     Marcos Andrade"
                    + "\n30                     Marcelo Souza"
                    + "\n40                     Votos brancos"
                    + "\n50                     Votos nulos\n\n"
                    + "Obs.: Digite 999 para finalizar a votação.\n\n"
                    + "Digite o código do prefeito desejado:"));
            switch (ca) {
                case 10:
                    vetor[0]++;
                    break;
                case 15:
                    vetor[1]++;
                    break;
                case 20:
                    vetor[2]++;
                    break;
                case 30:
                    vetor[3]++;
                    break;
                case 40:
                    vetor[4]++;
                    break;
                case 50:
                    vetor[5]++;
                    break;
                case 999:
                    JOptionPane.showMessageDialog(null, "Votação finalizada!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Código inválido! Digite novamente!");
            }
        }

        
        for (i = 0; i < 4; i++) {
            vetor2[i] = vetor[i];
        }
        i = 0;
        while (i < 2) {
            j = i;
            while (j < 3) {
                if (vetor2[i] < vetor2[j + 1]) {
                    troca = vetor2[i];
                    vetor2[i] = vetor2[j + 1];
                    vetor2[j + 1] = troca;
                }
                j++;
            }
            i++;
        }

        
        if (vetor2[0] == vetor[0]) {
            nomeVenc = "João da Silva";
        }
        
        if (vetor2[0] == vetor[1]) {
            nomeVenc = "Maria José";
        }
        
        if (vetor2[0] == vetor[2]) {
            nomeVenc = "Marcos Andrade";
        }
        
        if (vetor2[0] == vetor[3]) {
            nomeVenc = "Marcelo Souza";
        }
        
        if (vetor2[1] == vetor[0]) {
            nomeVice = "João da Silva";
        }
        
        if (vetor2[1] == vetor[1]) {
            nomeVice = "Maria José";
        }
        
        if (vetor2[1] == vetor[2]) {
            nomeVice = "Marcos Andrade";
        }
        
        if (vetor2[1] == vetor[3]) {
            nomeVice = "Marcelo Souza";
        }

        JOptionPane.showMessageDialog(null, "Vencedor: " + nomeVenc + "   Votos: " + vetor2[0]
                + "\nVice: " + nomeVice + "\nVotos em branco: " + vetor[4] + "\nVotos nulos: " + vetor[5]);
    }
}
