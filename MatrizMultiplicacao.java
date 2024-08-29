package Matriz;

import javax.swing.JOptionPane;

/**
 *00-fazer duas matrizes de 3x6 que a multiplicação das mesmas resultará em uma terceira matriz.
 */
public class MatrizMultiplicacao {
    
    public static void main(String [] args) {
           int[][] matriz1 = new int[3][6];
        int[][] matriz2 = new int[3][6];
        int[][] matrizResultado = new int[3][6];

        // Preenchendo a primeira matriz com valores fornecidos pelo usuário
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                String input = JOptionPane.showInputDialog(String.format("Digite o valor para a Matriz 1 [%d][%d]:", i, j));
                matriz1[i][j] = Integer.parseInt(input);
            }
        }

        // Preenchendo a segunda matriz com valores fornecidos pelo usuário
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                String input = JOptionPane.showInputDialog(String.format("Digite o valor para a Matriz 2 [%d][%d]:", i, j));
                matriz2[i][j] = Integer.parseInt(input);
            }
        }

        // Calculando a matriz resultante como a multiplicação elemento por elemento das duas matrizes
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                matrizResultado[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }

        // Construindo a string que representa as matrizes
        StringBuilder resultado = new StringBuilder("Matriz 1:\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                resultado.append(matriz1[i][j]).append("\t");
            }
            resultado.append("\n");
        }

        resultado.append("\nMatriz 2:\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                resultado.append(matriz2[i][j]).append("\t");
            }
            resultado.append("\n");
        }

        resultado.append("\nMatriz Resultante (Multiplicação Elemento por Elemento):\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                resultado.append(matrizResultado[i][j]).append("\t");
            }
            resultado.append("\n");
        }

        // Exibindo todas as matrizes
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
    
}
