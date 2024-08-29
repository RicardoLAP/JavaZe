package Matriz;

import javax.swing.JOptionPane;

/**
 *
 * 08 - Fazer uma matriz de média de duas notas, no final mostrar, nome do aluno,
 *   notas, médias, status(aprovado, reprovado, recuperação). 
 *  Para aprovado >=7, reprovado < 6, recuperação > 6 < 7.
 */
public class NotaAluno {
    
    public static void main(String[] args) {
        String[] nomes = new String[5];
        float[][] notas = new float[5][2];
        float[] medias = new float[5];
        String[] status = new String[5];

        // Preenchendo os dados dos alunos
        for (int i = 0; i < 5; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome do aluno " + (i + 1) + ":");
            for (int j = 0; j < 2; j++) {
                String notaStr = JOptionPane.showInputDialog(String.format("Digite a nota %d do aluno %s:", j + 1, nomes[i]));
                notas[i][j] = Float.parseFloat(notaStr);
            }
        }

        // Calculando as médias e determinando o status dos alunos
        for (int i = 0; i < 5; i++) {
            medias[i] = (notas[i][0] + notas[i][1]) / 2;
            if (medias[i] >= 7) {
                status[i] = "Aprovado";
            } else if (medias[i] < 6) {
                status[i] = "Reprovado";
            } else {
                status[i] = "Recuperação";
            }
        }

        // Construindo a string que representa os resultados
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            resultado.append(String.format("Nome: %s\nNota 1: %.2f\nNota 2: %.2f\nMédia: %.2f\nStatus: %s\n\n",
                    nomes[i], notas[i][0], notas[i][1], medias[i], status[i]));
        }

        // Exibindo os resultados
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
    
}
