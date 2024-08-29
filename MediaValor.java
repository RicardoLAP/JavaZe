package LacoDeRepeticao;

import javax.swing.JOptionPane;

/**
 *Faça um programa ler 10 valores, calcular e escrever a média aritmética destes valores
 */
public class MediaValor {
    
     public static void main(String[] args) {
        double soma = 0;

        for (int i = 1; i <= 10; i++) {
            String input = JOptionPane.showInputDialog("Digite o valor " + i + " de 10:");
            double valor = Double.parseDouble(input);
            soma += valor;
        }

        double media = soma / 10;

        JOptionPane.showMessageDialog(null, "A média aritmética dos valores é: " + media);
    }
    
}
