package backroon;

import java.util.Scanner;

public class back
{
	Scanner read = new Scanner(System.in);
	
	public void Media() 
	{
		int num = 0;
		int number1 = 0;
		int result = 0;
		int a = 0;
		int media;
		System.out.printf("Deseja continuar ?\n");
		System.out.printf("[1] - Sim\n");
		System.out.printf("[2] - Não\n");
		
		num = read.nextInt();
		
		switch(num)
		{
			case 1:
				System.out.printf("Digite um numero: \n");
			    number1 = read.nextInt();
				result = result + number1;
				a++;
			break;	
			case 2:
				media = result / a;
				System.out.printf("Média: %d\n", media);
				System.out.printf("Fechando...\n");
			break;	
		}
		
	}

}		
	

