package Basico;

/**
 *
 * Uma lanchonete serve os seguintes produtos com os respectivos preços:
 
•	X burguer	R$ 2,50
•	X frango	R$ 2,00
•	X salada	R$ 1,50
•	Batata frita	R$ 0,80
•	Sucos	        R$ 0,90
•	Refrigerantes	R$ 1,20
 */

import javax.swing.JOptionPane;

public class DquintaClasse {
    
        public static void main(String[] args) {
        
        float precoXburguer = 2.50f;
        float precoXfrango = 2.00f;
        float precoXsalada = 1.50f;
        float precoBatataFrita = 0.80f;
        float precoSuco = 0.90f;
        float precoRefrigerante =  1.20f;

        
        int qtdXburguer = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de X-burguer desejada:"));
        int qtdXfrango = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de X-frango desejado:"));
        int qtdXsalada = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de X-salada desejado:"));
        int qtdBatataFrita = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Batata Frita desejada:"));
        int qtdSuco = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Sucos desejada:"));
        int qtdRefrigerante = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Refrigerantes desejada:"));

        
        float valorTotal = (qtdXburguer * precoXburguer) +
                            (qtdXfrango * precoXfrango) +
                            (qtdXsalada * precoXsalada) +
                            (qtdBatataFrita * precoBatataFrita) +
                            (qtdSuco * precoSuco) +
                            (qtdRefrigerante * precoRefrigerante);

        
        String mensagem = "Valor total do pedido: R$ " + valorTotal;
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
