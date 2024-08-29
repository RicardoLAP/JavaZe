package Matriz;

import javax.swing.JOptionPane;

/**
 *02 - Faça um algoritmo com uma matriz 5X7 de números inteiros.
     Mostrar os números no final
 */
public class MatrizCincoxSeteInte {
    
    public static void main(String[] args) {
        
           int[][] matriz = new int[5][7];

        // Preencher a matriz com números inteiros
        for (int Lin = 0; Lin < 5; Lin++) {
            for (int Col = 0; Col < 7; Col++) {
                String input = JOptionPane.showInputDialog("Digite um número inteiro para a posição [" + Lin + "][" + Col + "]");
                matriz[Lin][Col] = Integer.parseInt(input);
            }
        }

        // Construir a mensagem com os números da matriz
        StringBuilder mensagem = new StringBuilder("Matriz 5x7 de Números Inteiros:\n");
        for (int Lin = 0; Lin < 5; Lin++) {
            for (int Col = 0; Col < 7; Col++) {
                mensagem.append(String.format("%4d", matriz[Lin][Col])).append("\t");
            }
            mensagem.append("\n");
        }

        // Exibir a matriz usando JOptionPane
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
 }
    

