package estruturaCondicional;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int nota1,nota2,nota3,nota4,result;

		System.out.println("Digite a primeira nota");
		nota1= ler.nextInt();
		System.out.println("Digite a segunda nota");
		nota2 = ler.nextInt();
		System.out.println("Digite a terceira nota");
		nota3 = ler.nextInt();
		System.out.println("Digite a quarta nota");
		nota4 = ler.nextInt();
		
		result =( nota1+nota2+nota3+nota4)/4;
		
		if(result >= 6) {
			System.out.println("aprovado" + result);
		} 
		else {
			System.out.println("reprovado" + result);
		}

		ler.close();
	}
	
		
		
		


	}

