package Lista2Java;
import java.util.Scanner;
public class Ex33 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a primeira nota: ");
		float nota1 = scan.nextFloat();
		System.out.print("Informe a segunda nota: ");
		float nota2 = scan.nextFloat();
		while (nota1 > 10 || nota2 > 10 || nota1 < 0 || nota2 < 0) {
			System.out.println("Informe notas válidas");
			System.out.print("Informe a primeira nota: ");
			nota1 = scan.nextFloat();
			System.out.print("Informe a segunda nota: ");
			nota2 = scan.nextFloat();
		}
		char conceito = ' ';
		String situacao = "";
		float media = (nota1 + nota2) / 2;
		if (media >= 9 && media <= 10) {
			conceito = 'A';
			situacao = "Aprovado";
		}else if (media >= 7.5 && media < 9) {
			conceito = 'B';
			situacao = "Aprovado";
		}else if (media >= 6 && media < 7.5) {
			conceito = 'C';
			situacao = "Aprovado";
		}else if (media >= 4 && media < 6) {
			conceito = 'D';
			situacao = "Reprovado";
		}else {
			conceito = 'E';
			situacao = "Reprovado";
		}
		System.out.println("Notas: " + nota1 + ", " + nota2);
		System.out.println("Média: " + media);
		System.out.println("Conceito correspondente: " + conceito);
		System.out.println(situacao);
		scan.close();	
	}
}
