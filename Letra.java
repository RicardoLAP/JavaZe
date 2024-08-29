package Basico;

import javax.swing.JOptionPane;

/**
 *
 * @author Dev-Skynet
 */
public class Letra {
    
    public static void main(String[] args) {

        String notaTexto = JOptionPane.showInputDialog("Digite a nota (A, B, C, D ou F):");
        char nota = notaTexto.charAt(0);

        String mensagem = "";

        switch (nota) { 
            case 'A':
                mensagem = "Excelente";
                break;
            case 'B':
                mensagem = "Bom";
                break;
            case 'C':
                mensagem = "Regular";
                break;
            case 'D':
                mensagem = "Ruim";
                break;
            case 'F':
                mensagem = "Reprovado";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nota inválida. Digite A, B, C, D ou F.");
                return;
        }

        JOptionPane.showMessageDialog(null, "A nota " + nota + " é " + mensagem);
    }
}
    

