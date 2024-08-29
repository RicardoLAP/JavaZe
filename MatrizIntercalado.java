package Matriz;

import javax.swing.JOptionPane;

/**
 *
 * 04 - Fazer uma matriz resultante de duas matriz 3X2 COLOCAR DE MODO INTERCALADO. Mostrar todas as matrizes .
 */
public class MatrizIntercalado {
    
     public static void main(String[] args) {
        // Definindo as duas matrizes 3x2
        int[][] matriz1 = {{1, 2}, {3, 4}, {5, 6}};
        int[][] matriz2 = {{7, 8}, {9, 10}, {11, 12}};

        // Criando a matriz resultante intercalando os elementos
        int[][] matrizResultante = new int[matriz1.length + matriz2.length][matriz1[0].length];
        int indice = 0;

        for (int i = 0; i < matriz1.length; i++) {
            matrizResultante[indice] = matriz1[i];
            indice++;
            matrizResultante[indice] = matriz2[i];
            indice++;
        }

        // Mostrando as matrizes originais e a matriz resultante
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Matriz 1:\n");
        mensagem.append(imprimirMatriz(matriz1));
        mensagem.append("\nMatriz 2:\n");
        mensagem.append(imprimirMatriz(matriz2));
        mensagem.append("\nMatriz Resultante Intercalada:\n");
        mensagem.append(imprimirMatriz(matrizResultante));

        JOptionPane.showMessageDialog(null, mensagem.toString());
    }

    // Função para imprimir uma matriz como string
    public static String imprimirMatriz(int[][] matriz) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultado.append(matriz[i][j]).append("\t");
            }
            resultado.append("\n");
        }
        return resultado.toString();
    }
    
}
