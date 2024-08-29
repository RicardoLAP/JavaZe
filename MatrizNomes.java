package Matriz;

import javax.swing.JOptionPane;

/**
 
 */
public class MatrizNomes {
    
    public static void main(String [] args) {
        
          String[][] nomes = new String[2][2];

        // Preenchendo a matriz com nomes fornecidos pelo usuário
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                nomes[i][j] = JOptionPane.showInputDialog(String.format("Digite o nome para a posição [%d][%d]:", i, j));
            }
        }

        // Construindo a string que representa a matriz de nomes
        StringBuilder resultado = new StringBuilder("Matriz 2x2 de Nomes:\n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado.append(nomes[i][j]).append("\n");
            }
            resultado.append("\n");
        }

        // Exibindo a matriz de nomes
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
    
}
