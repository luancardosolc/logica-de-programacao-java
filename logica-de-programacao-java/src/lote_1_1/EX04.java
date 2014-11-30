package lote_1_1;

/* Luan Cardoso
 * Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit
(F = (9*C+160)/5.
 */

import javax.swing.JOptionPane;

public class EX04
{
    public static void main (String args [])
    {
        double celsius, fahrenheit;
        celsius = Double.parseDouble (JOptionPane.showInputDialog("Digite a temperatura em Celsius"));
        fahrenheit = (9 * celsius + 160) / 5;
        System.out.println ("A temperatura em fanrenheit é: " + fahrenheit);
        
    }
    
}
