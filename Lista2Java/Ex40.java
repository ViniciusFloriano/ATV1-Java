package Lista2Java;
import java.util.Scanner;
public class Ex40 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a primeira nota: ");
		float nota1 = scan.nextFloat();
		System.out.print("Informe a segunda nota: ");
		float nota2 = scan.nextFloat();
		System.out.print("Informe a terceira nota: ");
		float nota3 = scan.nextFloat();
		float media = (nota1 + nota2 + nota3) / 3;
		if (media >= 7) {
			System.out.println("Aprovado");
		}else if (media == 10) {
			System.out.println("Aprovado com Distinção");
		}else {
			System.out.println("Reprovado");
		}
		scan.close();
	}
}
