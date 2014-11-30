/* Luan Cardoso
 * Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa
 */

import javax.swing.JOptionPane;

public class EX15 {
    public static void main (String args []) {
        double a,b,c,h;
        
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro cateto:"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo cateto"));
        
        a = Math.pow(b,2)+Math.pow(c,2);
        
        h = Math.sqrt(a);
        
        System.out.println("O valor da hipotenusa é: "+h);
        
    }
}


//Exemplo: Triangulo a=9,b=12,c=15