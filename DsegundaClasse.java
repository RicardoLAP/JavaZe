package Basico;

/**
 *
 * 12.Faça um programa para cadastrar um professor com os seguintes dados, Nome, endereço, cidade, 
 * UF, CEP, telefone, CPF, carteira de identidade, data de nascimento, grau de escolaridade e curso que leciona. 
 * No final mostrar todos os dados de uma forma organizada.
 */

import javax.swing.JOptionPane;

public class DsegundaClasse {
    
        public static void main(String[] args) {
        
        String Nome = JOptionPane.showInputDialog("Digite o nome do professor:");
        String Endereco = JOptionPane.showInputDialog("Digite o endereço do professor:");
        String Cidade = JOptionPane.showInputDialog("Digite a cidade do professor:");
        String Uf = JOptionPane.showInputDialog("Digite a UF do professor:");
        String Cep = JOptionPane.showInputDialog("Digite o CEP do professor:");
        String Telefone = JOptionPane.showInputDialog("Digite o telefone do professor:");
        String Cpf = JOptionPane.showInputDialog("Digite o CPF do professor:");
        String Rg = JOptionPane.showInputDialog("Digite a carteira de identidade do professor:");
        String DataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento do professor:");
        String GrauEscolaridade = JOptionPane.showInputDialog("Digite o grau de escolaridade do professor:");
        String CursoLeciona = JOptionPane.showInputDialog("Digite o curso que o professor leciona:");

        
        String dadosProfessor = "Dados do Professor:\n" +
                                "Nome: " + Nome + "\n" +
                                "Endereço: " + Endereco + "\n" +
                                "Cidade: " + Cidade + "\n" +
                                "UF: " + Uf + "\n" +
                                "CEP: " + Cep + "\n" +
                                "Telefone: " + Telefone + "\n" +
                                "CPF: " + Cpf + "\n" +
                                "Carteira de Identidade: " + Rg + "\n" +
                                "Data de Nascimento: " + DataNascimento + "\n" +
                                "Grau de Escolaridade: " + GrauEscolaridade + "\n" +
                                "Curso que Leciona: " + CursoLeciona;
        
        JOptionPane.showMessageDialog(null, dadosProfessor);
    }
    
}
