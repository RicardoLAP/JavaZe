package Basico;

/**
 *5. Faça os programas dos cadastros a seguir:
	a) Emissão de Passagem aérea:
	b) Locação de Fita de vídeo uma locadora: 
	c) Empréstimo de Livro de uma biblioteca: 
	d) Cadastro de Carro em uma concessionária: 
	e) Cadastro de Disciplinas de uma escola: 
Obs: No máximo 06 dados para cada um cadastro.	
 * 
 */

import javax.swing.JOptionPane;

public class DsextaClasseA {
        public static void main(String[] args) {
        String nomePassageiro = JOptionPane.showInputDialog("Digite o nome do passageiro:");
        String origem = JOptionPane.showInputDialog("Digite a cidade de origem:");
        String destino = JOptionPane.showInputDialog("Digite a cidade de destino:");
        String dataPartida = JOptionPane.showInputDialog("Digite a data de partida (dd/mm/aaaa):");
        String horarioPartida = JOptionPane.showInputDialog("Digite o horário de partida (hh:mm):");
        String numeroVoo = JOptionPane.showInputDialog("Digite o número do voo:");

        String mensagem = "Dados da Passagem Aérea:\n" +
                          "Nome do Passageiro: " + nomePassageiro + "\n" +
                          "Origem: " + origem + "\n" +
                          "Destino: " + destino + "\n" +
                          "Data de Partida: " + dataPartida + "\n" +
                          "Horário de Partida: " + horarioPartida + "\n" +
                          "Número do Voo: " + numeroVoo;
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
