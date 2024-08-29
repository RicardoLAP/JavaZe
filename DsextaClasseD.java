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

public class DsextaClasseD {
        public static void main(String[] args) {
        String marca = JOptionPane.showInputDialog("Digite a marca do carro:");
        String modelo = JOptionPane.showInputDialog("Digite o modelo do carro:");
        String anoFabricacao = JOptionPane.showInputDialog("Digite o ano de fabricação:");
        String cor = JOptionPane.showInputDialog("Digite a cor do carro:");
        String placa = JOptionPane.showInputDialog("Digite a placa do carro:");
        String preco = JOptionPane.showInputDialog("Digite o preço do carro:");

        String mensagem = "Dados do Cadastro do Carro:\n" +
                          "Marca: " + marca + "\n" +
                          "Modelo: " + modelo + "\n" +
                          "Ano de Fabricação: " + anoFabricacao + "\n" +
                          "Cor: " + cor + "\n" +
                          "Placa: " + placa + "\n" +
                          "Preço: R$ " + preco;
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
