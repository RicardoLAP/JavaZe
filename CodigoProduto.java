package Basico;

import javax.swing.JOptionPane;

/**
 *Crie um programa que leia um código de produto (de 1 a 5) e exiba sua descrição.
Utilize a seguinte tabela:
a) 1: "Produto A"
b) 2: "Produto B"
c) 3: "Produto C"
d) 4: "Produto D"
e) 5: "Produto E"
 */
public class CodigoProduto {
    
    public static void main(String [] args) {
        
         String codigoProduto = JOptionPane.showInputDialog("Digite o código do produto (de 1 a 5):");
        int codigo = Integer.parseInt(codigoProduto);

        String descricao = "";

        switch (codigo) {
            case 1:
                descricao = "Lâmpadas";
                break;
            case 2:
                descricao = "Transformadores";
                break;
            case 3:
                descricao = "Cabos de Energia";
                break;
            case 4:
                descricao = "Baterias";
                break;
            case 5:
                descricao = "Fontes";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Código de produto inválido.");
                return;
        }

        JOptionPane.showMessageDialog(null, "Descrição do produto: " + descricao);
    
    }
    
}
