/* Luan Cardoso
 * Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
 */ 

import javax.swing.JOptionPane;

public class EX07
{
    public static void main (String args[])
    {
    double comprimento, largura, altura, volume;
    comprimento = Double.parseDouble(JOptionPane.showInputDialog ("Digite o comprimento"));
    largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura"));
    altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
    volume = comprimento*altura*largura;
    System.out.println("O Volume é: "+volume);
    
    }
}

