package Matriz;

import javax.swing.JOptionPane;

/**
 *07 - Fazer uma matriz resultante de duas matriz 3X2. Mostrar todas as matrizes.
 * 
 */
public class MatrizResiltante {
    
     public static void main(String[] args) {
        int[][] matriz1 = new int[3][2];
        int[][] matriz2 = new int[3][2];
        int[][] matrizResultado = new int[3][2];

        // Preenchendo a primeira matriz com valores fornecidos pelo usuário
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog(String.format("Digite o valor para a Matriz 1 [%d][%d]:", i, j));
                matriz1[i][j] = Integer.parseInt(input);
            }
        }

        // Preenchendo a segunda matriz com valores fornecidos pelo usuário
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog(String.format("Digite o valor para a Matriz 2 [%d][%d]:", i, j));
                matriz2[i][j] = Integer.parseInt(input);
            }
        }

        // Calculando a matriz resultante como a soma das duas matrizes
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Construindo a string que representa as matrizes
        StringBuilder resultado = new StringBuilder("Matriz 1:\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                resultado.append(matriz1[i][j]).append("\t");
            }
            resultado.append("\n");
        }

        resultado.append("\nMatriz 2:\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                resultado.append(matriz2[i][j]).append("\t");
            }
            resultado.append("\n");
        }

        resultado.append("\nMatriz Resultante:\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                resultado.append(matrizResultado[i][j]).append("\t");
            }
            resultado.append("\n");
        }

        // Exibindo todas as matrizes
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
    
}
