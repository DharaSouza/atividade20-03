package estruturaCondicional;

import java.util.Scanner;

public class Atividade2º {

	public static void main(String[] args) {
		double a;
	Scanner ler = new Scanner(System.in);
			System.out.println("Informe o valor: ");
			a = ler.nextDouble();
		System.out.println(a % 5 == 0 ? "o numero" + a + "é multiplo de 5 : " : "o numero" + a + "não é multiplo de 5");
		// TODO Auto-generated method stub

	}

}
