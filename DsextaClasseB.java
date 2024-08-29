package Basico;

/**
 *
 * 5. Faça os programas dos cadastros a seguir:
	a) Emissão de Passagem aérea:
	b) Locação de Fita de vídeo uma locadora: 
	c) Empréstimo de Livro de uma biblioteca: 
	d) Cadastro de Carro em uma concessionária: 
	e) Cadastro de Disciplinas de uma escola: 
Obs: No máximo 06 dados para cada um cadastro.
 */
import javax.swing.JOptionPane;

public class DsextaClasseB {
        
    public static void main(String[] args) {
        String tituloFita = JOptionPane.showInputDialog("Digite o título da fita de vídeo:");
        String genero = JOptionPane.showInputDialog("Digite o gênero da fita de vídeo:");
        String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente:");
        String dataLocacao = JOptionPane.showInputDialog("Digite a data de locação (dd/mm/aaaa):");
        String prazoDevolucao = JOptionPane.showInputDialog("Digite o prazo de devolução (dd/mm/aaaa):");

        String mensagem = "Dados da Locação da Fita de Vídeo:\n" +
                          "Título da Fita: " + tituloFita + "\n" +
                          "Gênero: " + genero + "\n" +
                          "Nome do Cliente: " + nomeCliente + "\n" +
                          "Data de Locação: " + dataLocacao + "\n" +
                          "Prazo de Devolução: " + prazoDevolucao;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
