package LacoDeRepeticao;

import javax.swing.JOptionPane;

/**
 *Escreva um programa que calcule a soma dos N primeiros números naturais.
 */
public class NumeroNatural {
    
    public static void main(String [] args) {
           String input;
        int n;

        do {
            input = JOptionPane.showInputDialog("Digite o valor de N para calcular a soma dos N primeiros números naturais:");
            n = Integer.parseInt(input);
        } while (n <= 0);

        int soma = 0;
        int contador = 1;

        do {
            soma += contador;
            contador++;
        } while (contador <= n);

        JOptionPane.showMessageDialog(null, "A soma dos " + n + " primeiros números naturais é: " + soma);
    }
}   
    
