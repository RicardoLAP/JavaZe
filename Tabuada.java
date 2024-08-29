package LacoDeRepeticao;

import javax.swing.JOptionPane;

/**
 *Escreva um programa que imprima a tabuada de um número fornecido pelo usuário.
 */
public class Tabuada {
    
    public static void main(String [] args) {
        
          String input = JOptionPane.showInputDialog("Digite um número para ver sua tabuada:");
        int numero = Integer.parseInt(input);

        StringBuilder tabuada = new StringBuilder();

        tabuada.append("Tabuada do ").append(numero).append(":\n");

        for (int i = 1; i < 10; i++) {
            tabuada.append(numero).append(" x ").append(i).append(" = ").append(numero * i).append("\n");
        }

        JOptionPane.showMessageDialog(null, tabuada.toString());
    }
    
    
}
