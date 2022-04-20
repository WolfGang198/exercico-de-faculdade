
package javaapplication1;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) 
	{
		Backroon BK = new Backroon();
                Scanner read = new Scanner(System.in);
		int a = 0;
		while(a<=4)
		{
			int number;
			
			System.out.printf("escreva um numero: \n");
			System.out.println("[1] - Média \n");
			System.out.println("[2] - Geométrica \n");
			System.out.println("[3] - média \n");
			System.out.println("[4] - média \n");
			System.out.println("[5] - Sair \n");
		
			number = read.nextInt();
			
			switch(number)
			{
				case 1:
                                    BK.Media();    
				break;
				case 2:
				    BK.Geometrica();
				break;
				case 3:
				    
				break;
				case 4:
				    
				break;
				case 5:
				    System.out.println("Saindo.....");
				break;	
			}
		}
	
	}
}
