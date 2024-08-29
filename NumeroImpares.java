package Matriz;

import javax.swing.JOptionPane;

/**
 *02 - Fazer uma matriz 3X3 para guardar somente números impar Mostrar os números.
 */
public class NumeroImpares {
    
    public static void main(String[] args) {
        
        
          int[][] matriz = new int[3][3];

        // Preenchendo a matriz com números ímpares fornecidos pelo usuário
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num;
                do {
                    String input = JOptionPane.showInputDialog(String.format("Digite um número ímpar para a posição [%d][%d]:", i, j));
                    num = Integer.parseInt(input);
                    if (num % 2 == 0) {
                        JOptionPane.showMessageDialog(null, "Por favor, insira um número ímpar.");
                    }
                } while (num % 2 == 0);
                matriz[i][j] = num;
            }
        }

        // Construindo a string que representa a matriz de números ímpares
        StringBuilder resultado = new StringBuilder("Matriz 3x3 de Números Ímpares:\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultado.append(matriz[i][j]).append("\t");
            }
            resultado.append("\n");
        }

        // Exibindo a matriz de números ímpares
        JOptionPane.showMessageDialog(null, resultado.toString());
        
    }
    
}
