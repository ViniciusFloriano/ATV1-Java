package Lista1Java;
import java.util.Scanner;
public class Ex16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Qual a área em metros quadrados a ser pintada: ");
		float metros = scan.nextFloat();
		System.out.println("Você precisa de " + (metros / 6) + "L para pintar os " + metros + "m²");
		System.out.println("Uma lata tem 18L então você precisa comprar " + ((metros / 6) / 18) + " latas");
		System.out.println("Cada lata custa R$80,00 então o preço total sera: R$" + (((metros / 6) / 18) * 80));
		System.out.println("Ou você pode comprar galões que tem 3,6L então você precisa comprar " + ((metros / 6) / 3.6) + " latas");
		System.out.println("Cada galão custa R$25,00 então o preço total sera: R$" + (((metros / 6) / 3.6) * 25));
		scan.close();
	}
}
