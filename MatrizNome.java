package Matriz;

import javax.swing.JOptionPane;

/**
 * 03 - Faça um algoritmo com uma matriz 8X3 de nomes
 *      Mostrar os nomes no final.
 */
public class MatrizNome {

    public static void main(String[] args) {

        String[][] matriz = new String[8][3];

        // Preencher a matriz com nomes
        for (int Lin = 0; Lin < 8; Lin++) {
            for (int Col = 0; Col < 3; Col++) {
                matriz[Lin][Col] = JOptionPane.showInputDialog("Digite um nome para a posição [" + Lin + "][" + Col + "]");
            }
        }

        // Construir a mensagem com os nomes da matriz
        StringBuilder mensagem = new StringBuilder("Matriz 8x3 de Nomes:\n");
        for (int Lin = 0; Lin < 8; Lin++) {
            for (int Col = 0; Col < 3; Col++) {
                mensagem.append(matriz[Lin][Col]).append("\t");
            }
            mensagem.append("\n");
        }

        // Exibir a matriz usando JOptionPane
        JOptionPane.showMessageDialog(null, mensagem.toString());

    }
}
