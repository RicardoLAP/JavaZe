package Basico;

/**
 *
 * Faça os programas dos cadastros a seguir:
	a) Emissão de Passagem aérea:
	b) Locação de Fita de vídeo uma locadora: 
	c) Empréstimo de Livro de uma biblioteca: 
	d) Cadastro de Carro em uma concessionária: 
	e) Cadastro de Disciplinas de uma escola: 
Obs: No máximo 06 dados para cada um cadastro.
 */
import javax.swing.JOptionPane;

public class DsextaClasseE {
        
         public static void main(String[] args) {
        String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina:");
        String cargaHoraria = JOptionPane.showInputDialog("Digite a carga horária da disciplina:");
        String professor = JOptionPane.showInputDialog("Digite o nome do professor responsável pela disciplina:");
        String turno = JOptionPane.showInputDialog("Digite o turno da disciplina (manhã, tarde, noite):");

        String mensagem = "Dados do Cadastro da Disciplina:\n" +
                          "Nome da Disciplina: " + nomeDisciplina + "\n" +
                          "Carga Horária: " + cargaHoraria + " horas\n" +
                          "Professor Responsável: " + professor + "\n" +
                          "Turno: " + turno;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
