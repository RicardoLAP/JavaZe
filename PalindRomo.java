package Basico;

import javax.swing.JOptionPane;

/**
 *
 * 02) Fazer um programa que leia um valor de 5 dígitos e verifique se é palíndromo
 */
public class PalindRomo {
    
    public static void main ( String args [] )
	{
		int number,		// número inserido pelo usuário
			n1,	// corresponde ao primeiro digito
			n2,	// corresponde ao segundo digito
			n3,	// corresponde ao terceiro digito
			n4,	// corresponde ao quarto digito
			n5;	// corresponde ao quinto digito
		double num = 0;
		
		// recebe o número do usuário
		number = Integer.parseInt (JOptionPane.showInputDialog ("Digite um número com 5 digitos: "));
		
		// verifica se o número tem 5 digitos
		while ( number > 99999 )
		{
			JOptionPane.showMessageDialog ( null, "O número possui mais de cinco dígitos!");
			
			// digita novamente um número
			number = Integer.parseInt (JOptionPane.showInputDialog ("Digite um número com 5 digitos: "));
			
			while ( number <= 9999 )
			{
				JOptionPane.showMessageDialog ( null, "O número possui menos de cinco dígitos!");
				
				// digita novamente um número
				number = Integer.parseInt (JOptionPane.showInputDialog ("Digite um número com 5 digitos: "));
			}
			
		}
		
		while ( number <= 9999 )
		{
			JOptionPane.showMessageDialog ( null, "O número possui menos de cinco dígitos!");
			
			// digita novamente um número
			number = Integer.parseInt (JOptionPane.showInputDialog ("Digite um número com 5 digitos: "));
			
			while ( number > 99999 )
			{
				JOptionPane.showMessageDialog ( null, "O número possui mais de cinco dígitos!");
				
				// digita novamente um número
				number = Integer.parseInt (JOptionPane.showInputDialog ("Digite um número com 5 digitos: "));
			}
			
		}
		
                                                                                                                                                                // fiz um teste com o número 15951
		n1 = number / 10000;					// 15951   / 10000  = 1
		n2 = (number / 1000) - (n1 * 10); 				// 15951   / 1000    = 15    - 10          = 5
		n3 = (number / 100) - (n1 * 100) - (n2 * 10);			// 15951   / 100      = 159  - 100        = 59   - 50   = 9
		n4 = (number / 10) - (n1 * 1000) - (n2 * 100) - (n3 * 10);		// 15951   / 10         = 1595  - 1000   = 595 - 500 = 95  - 90 = 5
		n5 = number - (n1 * 10000) - (n2 * 1000) - (n3 * 100) - (n4 * 10);	// 15951   - 10000   = 5951   - 5000  = 951  - 900 = 51  - 50 = 1
		
		if (n1 == n5)
		{
			if (n2 == n4)
			{
				JOptionPane.showMessageDialog ( null, "O número digitado é um palíndromo!");
			}
			else
			{
				JOptionPane.showMessageDialog ( null, "O número digitado não é um palíndromo!");
			}
		}
		else
		{
			JOptionPane.showMessageDialog ( null, "O número digitado não é um palíndromo!");
		}
		
		System.exit ( 0 );
		
	}
    
}
