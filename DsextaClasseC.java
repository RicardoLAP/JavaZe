package Basico;

/**
 *5. Faça os programas dos cadastros a seguir:
	a) Emissão de Passagem aérea:
	b) Locação de Fita de vídeo uma locadora: 
	c) Empréstimo de Livro de uma biblioteca: 
	d) Cadastro de Carro em uma concessionária: 
	e) Cadastro de Disciplinas de uma escola: 
Obs: No máximo 06 dados para cada um cadastro.
 */
import javax.swing.JOptionPane;

public class DsextaClasseC {
    
        public static void main(String[] args) {
        String tituloLivro = JOptionPane.showInputDialog("Digite o título do livro:");
        String autor = JOptionPane.showInputDialog("Digite o nome do autor:");
        String nomeUsuario = JOptionPane.showInputDialog("Digite o nome do usuário:");
        String dataEmprestimo = JOptionPane.showInputDialog("Digite a data de empréstimo (dd/mm/aaaa):");
        String prazoDevolucao = JOptionPane.showInputDialog("Digite o prazo de devolução (dd/mm/aaaa):");

        String mensagem = "Dados do Empréstimo do Livro:\n" +
                          "Título do Livro: " + tituloLivro + "\n" +
                          "Autor: " + autor + "\n" +
                          "Nome do Usuário: " + nomeUsuario + "\n" +
                          "Data de Empréstimo: " + dataEmprestimo + "\n" +
                          "Prazo de Devolução: " + prazoDevolucao;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
