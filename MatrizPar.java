package Matriz;

import javax.swing.JOptionPane;

/**
 *
 * 03 - Fazer uma matriz 5x5 para guardar somente números par.Mostrar os números.
 */
public class MatrizPar {
    
      public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        // Preenchendo a matriz com números pares
        int numero = 2;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numero;
                numero += 2;
            }
        }

        // Mostrando os números pares da matriz
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Matriz 5x5 com números pares:\n\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                mensagem.append(matriz[i][j]).append("\t");
            }
            mensagem.append("\n");
        }

        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}
    

