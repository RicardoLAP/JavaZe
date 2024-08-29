package Basico;

/**
 *
 * 0 - Faça uma programa que ao ser informado
    um número verifique se é positivo ou negativo.
 */
import javax.swing.JOptionPane;

public class PositivoNegativo {
    
    public static void main(String[] args ){  
       
        String inputNumero = JOptionPane.showInputDialog("Digite um número:");
        double numero = Double.parseDouble(inputNumero);
  
        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "O número informado é positivo.");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "O número informado é negativo.");
        } else {
            JOptionPane.showMessageDialog(null, "O número informado é zero.");
        }
    }
    
}
