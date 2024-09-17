package Lista2Java;
import java.util.Scanner;
public class Ex46 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Quantos litros de combustível foram vendidos: ");
		float litros = scan.nextFloat();
		scan.nextLine();
		System.out.print("Qual o tipo do combustível? (A - álcool ou G - Gasolina): ");
		char tipo = scan.nextLine().charAt(0);
		if (tipo == 'A' || tipo == 'a') {
			float valor = litros * 1.90f;
			if (litros > 0 && litros <= 20) {
				System.out.println("Valor a pagar: R$" + (valor - (valor * 0.03)));
			}else {
				System.out.println("Valor a pagar: R$" + (valor - (valor * 0.05)));
			}
		}else if (tipo == 'G' || tipo == 'g'){
			float valor = litros * 2.50f;
			if (litros > 0 && litros <= 20) {
				System.out.println("Valor a pagar: R$" + (valor - (valor * 0.04)));
			}else {
				System.out.println("Valor a pagar: R$" + (valor - (valor * 0.06)));
			}
		}else {
			System.out.println("Tipo de combustível inválido");
		}
		scan.close();
	}
}
