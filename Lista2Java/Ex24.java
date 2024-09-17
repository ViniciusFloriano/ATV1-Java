package Lista2Java;
import java.util.Scanner;
public class Ex24 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a primeiro nota: ");
		float nota1 = scan.nextFloat();
		System.out.print("Informe a segundo nota: ");
		float nota2 = scan.nextFloat();
		float media = (nota1 + nota2) / 2; 
		if (media >= 7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		scan.close();
	}
}
