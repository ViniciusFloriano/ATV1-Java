package Lista2Java;
import java.util.Scanner;
public class Ex20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe um ano (com os quatro dígitos): ");
		int ano = scan.nextInt();
		if (ano % 4 == 0) {
			System.out.println("O ano " + ano + " é bissexto");
		}else {
			System.out.println("O ano " + ano + " não é bissexto");
		}
		scan.close();
	}
}
