package Basico;

/**
 *
 * 1. Faça um algoritmo que leia dois números inteiros, trocar o conteúdo desses números.
 */
import javax.swing.JOptionPane;

public class DterceiraClasse {
    
        public static void main(String[] args) {
        
        String inputNumero1 = JOptionPane.showInputDialog("Digite o primeiro número inteiro:");
        int numero1 = Integer.parseInt(inputNumero1);

        String inputNumero2 = JOptionPane.showInputDialog("Digite o segundo número inteiro:");
        int numero2 = Integer.parseInt(inputNumero2);

        
        int temp = numero1;
        numero1 = numero2;
        numero2 = temp;

        
        String mensagem = "Números após a troca:\n" +
                          "Primeiro número: " + numero1 + "\n" +
                          "Segundo número: " + numero2;
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    
}
