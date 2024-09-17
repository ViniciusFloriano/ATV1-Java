package Lista2Java;
import java.util.Scanner;
public class Ex33 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a primeira nota: ");
		float nota1 = scan.nextFloat();
		System.out.print("Informe a segunda nota: ");
		float nota2 = scan.nextFloat();
		float media = (nota1 + nota2) / 2;
		if (media >= 9 && media <= 10) {
			System.out.println("Notas: " + nota1 + ", " + nota2);
			System.out.println("Média: " + media);
			System.out.println("Conceito correspondente: A");
			System.out.println("APROVADO");
		}else if (media >= 7.5 && media < 9) {
			System.out.println("Notas: " + nota1 + ", " + nota2);
			System.out.println("Média: " + media);
			System.out.println("Conceito correspondente: B");
			System.out.println("APROVADO");
		}else if (media >= 6 && media < 7.5) {
			System.out.println("Notas: " + nota1 + ", " + nota2);
			System.out.println("Média: " + media);
			System.out.println("Conceito correspondente: C");
			System.out.println("APROVADO");
		}else if (media >= 4 && media < 6) {
			System.out.println("Notas: " + nota1 + ", " + nota2);
			System.out.println("Média: " + media);
			System.out.println("Conceito correspondente: D");
			System.out.println("Reprovado");
		}else {
			System.out.println("Notas: " + nota1 + ", " + nota2);
			System.out.println("Média: " + media);
			System.out.println("Conceito correspondente: E");
			System.out.println("Reprovado");
		}
		scan.close();
	}
}
