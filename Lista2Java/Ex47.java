package Lista2Java;
import java.util.Scanner;
public class Ex47 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Quantos Kg de morangos: ");
		float morango = scan.nextFloat();
		System.out.print("Quantos Kg de maçãs: ");
		float maca = scan.nextFloat();
		if (morango <= 5) {
			float valor = morango * 2.50f;
			System.out.println("Valor a pagar (morango): R$" + valor);
		}else{
			float valor = morango * 2.20f;
			if (morango > 8 || valor > 25) {
				System.out.println("Valor a pagar (morango): R$" + (valor - (valor * 0.10)));
			}else {
				System.out.println("Valor a pagar (morango): R$" + valor);
			}
		}
		if (maca <= 5) {
			float valor = maca * 1.80f;
			System.out.println("Valor a pagar (maçã): R$" + valor);
		}else{
			float valor = maca * 1.50f;
			if (maca > 8 || valor > 25) {
				System.out.println("Valor a pagar (maçã): R$" + (valor - (valor * 0.10)));
			}else {
				System.out.println("Valor a pagar (maçã): R$" + valor);
			}
		}
		scan.close();
	}
}
