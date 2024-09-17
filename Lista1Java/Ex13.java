package Lista1Java;
import java.util.Scanner;
public class Ex13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o peso (peso de peixes): ");
		float peso = scan.nextFloat();
		System.out.println("peso de peixes: " + peso);
		float excesso = peso - 50;
		float multa = excesso * 4;
		System.out.println("excesso: " + excesso);
		System.out.println("multa: R$" + multa);
		scan.close();
	}
}
