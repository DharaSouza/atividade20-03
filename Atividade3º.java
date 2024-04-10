package estruturaCondicional;

import java.util.Scanner;

public class Atividade3º {

public static void main(String[] args) {
Scanner ler = new Scanner (System.in);
System.out.println("Informe quantos anos de trabalho você tem: ");
int tp = ler.nextInt();
String msg = tp <= 3 ? "Seu bônus salarial é de 5%" : "Seu bônus salarial é de 7%";
System.out.println(msg);

}

}

