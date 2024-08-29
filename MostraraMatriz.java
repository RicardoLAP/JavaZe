
package Matriz;

import javax.swing.JOptionPane;

/**
 *
 *09 - Fazer uma matriz 4X4 mostrar a matriz
     - A diagonal principal
     - Quais os números da diagonais secundárias
     - Quais os números acima das diagonais secundárias
     - Qual o número que faz parte da diagonal principal e secundária
     - Quais os números abaixo da diagonal principal e secundária.
     - Quais os números acima da diagonal principal e secundária. 

 */
public class MostraraMatriz {
    
       public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        // Preenchendo a matriz com valores fornecidos pelo usuário
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                String input = JOptionPane.showInputDialog(String.format("Digite o valor para a posição [%d][%d]:", i, j));
                matriz[i][j] = Integer.parseInt(input);
            }
        }

        // Construindo a string que representa a matriz
        StringBuilder matrizStr = new StringBuilder("Matriz 4x4:\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizStr.append(matriz[i][j]).append("\t");
            }
            matrizStr.append("\n");
        }

        // Diagonal principal
        StringBuilder diagonalPrincipal = new StringBuilder("Diagonal Principal: ");
        for (int i = 0; i < 4; i++) {
            diagonalPrincipal.append(matriz[i][i]).append(" ");
        }

        // Diagonal secundária
        StringBuilder diagonalSecundaria = new StringBuilder("Diagonal Secundária: ");
        for (int i = 0; i < 4; i++) {
            diagonalSecundaria.append(matriz[i][3 - i]).append(" ");
        }

        // Números acima da diagonal secundária
        StringBuilder acimaDiagonalSecundaria = new StringBuilder("Acima da Diagonal Secundária: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 3 - i; j < 4; j++) {
                acimaDiagonalSecundaria.append(matriz[i][j]).append(" ");
            }
        }

        // Número que faz parte da diagonal principal e secundária
        int numDiagonalComum = matriz[1][1];

        // Números abaixo da diagonal principal e secundária
        StringBuilder abaixoDiagonais = new StringBuilder("Abaixo da Diagonal Principal e Secundária: ");
        for (int i = 2; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                abaixoDiagonais.append(matriz[i][j]).append(" ");
            }
            for (int j = 4 - i; j < 4; j++) {
                abaixoDiagonais.append(matriz[i][j]).append(" ");
            }
        }

        // Números acima da diagonal principal e secundária
        StringBuilder acimaDiagonais = new StringBuilder("Acima da Diagonal Principal e Secundária: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <= i; j++) {
                acimaDiagonais.append(matriz[i][j]).append(" ");
            }
            for (int j = 3 - i; j < 4; j++) {
                acimaDiagonais.append(matriz[i][j]).append(" ");
            }
        }

        // Exibindo todos os resultados
        JOptionPane.showMessageDialog(null, matrizStr.toString());
        JOptionPane.showMessageDialog(null, diagonalPrincipal.toString());
        JOptionPane.showMessageDialog(null, diagonalSecundaria.toString());
        JOptionPane.showMessageDialog(null, acimaDiagonalSecundaria.toString());
        JOptionPane.showMessageDialog(null, "Número na Diagonal Principal e Secundária: " + numDiagonalComum);
        JOptionPane.showMessageDialog(null, abaixoDiagonais.toString());
        JOptionPane.showMessageDialog(null, acimaDiagonais.toString());
    }
    
}
