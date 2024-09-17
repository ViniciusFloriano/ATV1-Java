package Lista1Java;
import java.util.Scanner;
public class Ex15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Qual a área em metros quadrados a ser pintada: ");
		float metros = scan.nextFloat();
		System.out.println("Você precisa de " + (metros / 3) + "L para pintar os " + metros + "m²");
		System.out.println("Uma lata tem 18L então você precisa comprar " + ((metros / 3) / 18) + " latas");
		System.out.println("Cada lata custa R$80,00 então o preço total sera: R$" + (((metros / 3) / 18) * 80));
		scan.close();
	}
}
