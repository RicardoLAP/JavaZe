package Basico;

/**
 9- Faça um programa que irá cadastrar clientes e produtos para uma determinada empresa, onde a empresa precisa os dados:
Cliente
Produto
 */
import javax.swing.JOptionPane;

public class NonaClasse {
    
    public static void main(String[] args) {
        String[] Clientes = new String[100];
        String[] Produtos = new String[100];
        int numClientes = 0;
        int numProdutos = 0;

        boolean continuarCadastro = true;

        while (continuarCadastro) {
            String Opcao = JOptionPane.showInputDialog("Escolha uma opção:\n" +
                                                        "1 - Cadastrar Cliente\n" +
                                                        "2 - Cadastrar Produto\n" +
                                                        "3 - Finalizar Cadastro");

            switch (Opcao) {
                case "1":
                    String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente:");
                    Clientes[numClientes] = nomeCliente;
                    numClientes++;
                    break;
                case "2":
                    String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto:");
                    Produtos[numProdutos] = nomeProduto;
                    numProdutos++;
                    break;
                case "3":
                    continuarCadastro = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Por favor, escolha uma opção válida.");
                    break;
            }
        }

        // Exibe os clientes cadastrados
        StringBuilder clientesCadastrados = new StringBuilder("Clientes cadastrados:\n");
        for (int i = 0; i < numClientes; i++) {
            clientesCadastrados.append(Clientes[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, clientesCadastrados.toString());

        // Exibe os produtos cadastrados
        StringBuilder produtosCadastrados = new StringBuilder("Produtos cadastrados:\n");
        for (int i = 0; i < numProdutos; i++) {
            produtosCadastrados.append(Produtos[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, produtosCadastrados.toString());
    }
    
    
}
