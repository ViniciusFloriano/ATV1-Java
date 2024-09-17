package Lista1Java;
import java.util.Scanner;
public class Ex04 {
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
		System.out.println("A média das notas " + nota1 + ", " + nota2 + ", " + nota3 + " e " + nota4 + " é: " + ((nota1 + nota2 + nota3 + nota4)/4));
		scan.close();
	}
}
