/* Luan Cardoso
 * Receba 2 números reais. Calcule e mostre a diferença dos custos desses valores.
 */ 

import javax.swing.JOptionPane;

public class EX10
{
    public static void main (String args [])
    {
        double x,y,d;
        
        //Entrada dos valores
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
                
        //Cálculo da diferença
        if (x>y) 
        {
            d = x-y;
        }
        else
        {
            d = y-x;
        }
        
        //Saída de dados
        System.out.println("A diferença entre os números é: "+d);
    }
}
