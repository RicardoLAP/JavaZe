
package Matriz; 
import javax.swing.JOptionPane;

/**
 *05 - Faça um algoritom com uma matriz 5X5, achar:
     Diagonal principal e a Diagonal Secundária
 */
public class MatrizDiagonal {
    public static void main(String[] args) {
           int[][] matriz = new int[5][5];
           for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                String input = JOptionPane.showInputDialog(String.format("Digite o valor para a posição [%d][%d]:", i, j));
                matriz[i][j] = Integer.parseInt(input);
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                String input = JOptionPane.showInputDialog(String.format("Digite o valor para a posição [%d][%d]:", i, j));
                matriz[i][j] = Integer.parseInt(input);
            }
        }

        // Encontrando a diagonal principal
        StringBuilder diagonalPrincipal = new StringBuilder("Diagonal Principal: ");
        for (int i = 0; i < 5; i++) {
            diagonalPrincipal.append(matriz[i][i]).append(" ");
        }

        // Encontrando a diagonal secundária
        StringBuilder diagonalSecundaria = new StringBuilder("Diagonal Secundária: ");
        for (int i = 0; i < 5; i++) {
            diagonalSecundaria.append(matriz[i][4 - i]).append(" ");
        }

        // Exibindo as diagonais
        JOptionPane.showMessageDialog(null, diagonalPrincipal.toString() + "\n" + diagonalSecundaria.toString());
                
                }
}