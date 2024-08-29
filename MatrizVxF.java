package Matriz;

import javax.swing.JOptionPane;

/**
 * 04 - Faça um algoritmo com uma matriz 3X3 de tipo Lógico
 *      Respondendo VERDADEIRO OU FALSO para a seguinte pergunta
 *      Gostaram de Lógica de programação?
 */
public class MatrizVxF {

    public static void main(String[] args) {

        boolean[][] matriz = new boolean[3][3];

        // Preencher a matriz com respostas verdadeiras ou falsas
        for (int lin = 0; lin < 3; lin++) {
            for (int col = 0; col < 3; col++) {
                String resposta = JOptionPane.showInputDialog("Gostaram de Lógica de programação? (VERDADEIRO/FALSO) para a posição [" + lin + "][" + col + "]");
                matriz[lin][col] = resposta.equalsIgnoreCase("VERDADEIRO");
            }
        }

        // Construir a mensagem com as respostas da matriz
        StringBuilder mensagem = new StringBuilder("Matriz 3x3 de Respostas:\n");
        for (int lin = 0; lin < 3; lin++) {
            for (int col = 0; col < 3; col++) {
                mensagem.append(matriz[lin][col] ? "VERDADEIRO" : "FALSO").append("\t");
            }
            mensagem.append("\n");
        }

        // Exibir a matriz usando JOptionPane
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}
