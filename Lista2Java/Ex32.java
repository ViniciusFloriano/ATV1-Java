package Lista2Java;
import java.util.Scanner;
public class Ex32 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a primeira nota: ");
		float nota1 = scan.nextFloat();
		System.out.print("Informe a segunda nota: ");
		float nota2 = scan.nextFloat();
		System.out.print("Informe a terceira nota: ");
		float nota3 = scan.nextFloat();
		System.out.print("Informe a qaurta nota: ");
		float nota4 = scan.nextFloat();
		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		if (media >= 0 && media < 3) {
			System.out.println("Reprovado");
		}else if (media >= 3 && media <= 6.9) {
			System.out.println("Em Exame");
		}else {
			System.out.println("Aprovado");
		}
		scan.close();
	}
}
