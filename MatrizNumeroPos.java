package Matriz;

import javax.swing.JOptionPane;

/**
 *06 - Fazer uma matriz 4X4 somente de números positivos, que serão informados.
     Mostrar a matriz final.
 */
public class MatrizNumeroPos {
    
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        // Preenchendo a matriz com valores positivos fornecidos pelo usuário
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int valor;
                do {
                    String input = JOptionPane.showInputDialog(String.format("Digite um valor positivo para a posição [%d][%d]:", i, j));
                    valor = Integer.parseInt(input);
                    if (valor <= 0) {
                        JOptionPane.showMessageDialog(null, "Por favor, insira um valor positivo.");
                    }
                } while (valor <= 0);
                matriz[i][j] = valor;
            }
        }

        // Construindo a string que representa a matriz final
        StringBuilder matrizFinal = new StringBuilder("Matriz 4x4:\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizFinal.append(matriz[i][j]).append("\t");
            }
            matrizFinal.append("\n");
        }

        // Exibindo a matriz final
        JOptionPane.showMessageDialog(null, matrizFinal.toString());
    }
    
}
