package lote_1_2;

/* Luan Cardoso
 * Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0.
 * Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
 */
import javax.swing.JOptionPane;

public class EX20 {

    public static void main(String args[]) {
        double delta, a, b, c, x1, x2;

        //Validar o valor de "a" que não pode ser igual a 0
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A:"));
        while (a == 0) {
            a = Double.parseDouble(JOptionPane.showInputDialog("O valor de 'a' não pode ser igual a zero, digite um outro valor: "));
        }

        // Carregando valor de "b" e "c"
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B:"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C:"));

        //Verificando o Discriminante
        delta = (Math.pow(b, 2)) - 4 * a * c;

        //Discriminante menor que zero
        if (delta < 0) {
            JOptionPane.showMessageDialog(null, "O Delta é igual a zero, logo,"
                    + "\n a Equação não tem raízes reais,"
                    + "\n pois não existe raiz quadrada de um número negativo.");
        } //Discriminante diferente de zero
        else {
            double raiz = Math.sqrt(delta);
            x1 = (-b + raiz) / (2 * a);
            x2 = (-b - raiz) / (2 * a);

            JOptionPane.showMessageDialog(null, "x1 = " + x1 + " e x2 = " + x2);

        }
    }
}

// EXEMPLO 1,10,24
//x1 =  -4
//x2 =  -6
