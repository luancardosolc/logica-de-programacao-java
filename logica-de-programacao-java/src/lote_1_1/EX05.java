package lote_1_1;

/* Luan Cardoso
 * Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0).
 * Calcule e mostre as raízes reais (considerar que a equação possue 2 raízes).
 */

import javax.swing.JOptionPane;

public class EX05
{
    public static void main (String args [])
    {
        double delta,a,b,c,x1,x2;
        
        a = Double.parseDouble (JOptionPane.showInputDialog("Digite o A da equação"));
        b = Double.parseDouble (JOptionPane.showInputDialog("Digite o B da equação"));
        c = Double.parseDouble (JOptionPane.showInputDialog("Digite o C da equação"));
        delta = (Math.pow(b,2))- 4*a*c;
        delta = Math.sqrt(delta);
        x1 = (-b + delta)/(2*a);
        x2 = (-b - delta)/(2*a);
        System.out.println ("As raízes da equação são: x1 = " + x1 + "e x2= " + x2);
    }
}

// EXEMPLO 1,10,24
//x1 =  -4
//x2 =  -6