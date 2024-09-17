package Lista2Java;
import java.util.Scanner;
public class Ex48 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Qual carne vai levar? (F - File Duplo, A - Alcatra ou P - Picanha): ");
		char tipo = scan.nextLine().charAt(0);
		System.out.print("Sera paco com o cartão Tabajara? (s ou n): ");
		char cartao = scan.nextLine().charAt(0);
		System.out.print("Quantos Kg: ");
		float kg = scan.nextFloat();
		if (tipo == 'F' || tipo == 'f') {
			if (kg <= 5) {
				float valor = kg * 4.90f;				
				if (cartao == 'S' || cartao == 's') {
					System.out.println("Tipo da carne: File Duplo");
					System.out.println("Quantidade: " + kg + "kg");
					System.out.println("Valor total: R$" + valor);
					System.out.println("Tipo de pagamento: Cartão Tabajara");
					System.out.println("Valor do desconto: R$" + (valor * 0.05));
					System.out.println("Valor a pagar: R$" + (valor - (valor * 0.05)));
				}else {
					System.out.println("Tipo da carne: File Duplo");
					System.out.println("Quantidade: " + kg + "kg");
					System.out.println("Valor total: R$" + valor);
					System.out.println("Tipo de pagamento: Dinheiro");
					System.out.println("Valor do desconto: R$" + (valor * 0.05));
					System.out.println("Valor a pagar: R$" + (valor - (valor * 0.05)));
				}				
			}else {
				float valor = kg * 5.80f;				
				if (cartao == 'S' || cartao == 's') {
					System.out.println("Tipo da carne: File Duplo");
					System.out.println("Quantidade: " + kg + "kg");
					System.out.println("Valor total: R$" + valor);
					System.out.println("Tipo de pagamento: Cartão Tabajara");
					System.out.println("Valor do desconto: R$" + (valor * 0.05));
					System.out.println("Valor a pagar: R$" + (valor - (valor * 0.05)));
				}else {
					System.out.println("Tipo da carne: File Duplo");
					System.out.println("Quantidade: " + kg + "kg");
					System.out.println("Valor total: R$" + valor);
					System.out.println("Tipo de pagamento: Dinheiro");
					System.out.println("Valor do desconto: R$" + (valor * 0.05));
					System.out.println("Valor a pagar: R$" + (valor - (valor * 0.05)));
				}
			}
		}else if (tipo == 'A' || tipo == 'A'){
			if (kg <= 5) {
				float valor = kg * 5.90f;				
				if (cartao == 'S' || cartao == 's') {
					System.out.println("Tipo da carne: Alcatra");
					System.out.println("Quantidade: " + kg + "kg");
					System.out.println("Valor total: R$" + valor);
					System.out.println("Tipo de pagamento: Cartão Tabajara");
					System.out.println("Valor do desconto: R$" + (valor * 0.05));
					System.out.println("Valor a pagar: R$" + (valor - (valor * 0.05)));
				}else {
					System.out.println("Tipo da carne: Alcatra");
					System.out.println("Quantidade: " + kg + "kg");
					System.out.println("Valor total: R$" + valor);
					System.out.println("Tipo de pagamento: Dinheiro");
					System.out.println("Valor do desconto: R$" + (valor * 0.05));
					System.out.println("Valor a pagar: R$" + (valor - (valor * 0.05)));
				}				
			}else {
				float valor = kg * 6.80f;				
				if (cartao == 'S' || cartao == 's') {
					System.out.println("Tipo da carne: Alcatra");
					System.out.println("Quantidade: " + kg + "kg");
					System.out.println("Valor total: R$" + valor);
					System.out.println("Tipo de pagamento: Cartão Tabajara");
					System.out.println("Valor do desconto: R$" + (valor * 0.05));
					System.out.println("Valor a pagar: R$" + (valor - (valor * 0.05)));
				}else {
					System.out.println("Tipo da carne: Alcatra");
					System.out.println("Quantidade: " + kg + "kg");
					System.out.println("Valor total: R$" + valor);
					System.out.println("Tipo de pagamento: Dinheiro");
					System.out.println("Valor do desconto: R$" + (valor * 0.05));
					System.out.println("Valor a pagar: R$" + (valor - (valor * 0.05)));
				}
			}
		}else if (tipo == 'P' || tipo == 'P'){
			if (kg <= 5) {
				float valor = kg * 6.90f;				
				if (cartao == 'S' || cartao == 's') {
					System.out.println("Tipo da carne: Picanha");
					System.out.println("Quantidade: " + kg + "kg");
					System.out.println("Valor total: R$" + valor);
					System.out.println("Tipo de pagamento: Cartão Tabajara");
					System.out.println("Valor do desconto: R$" + (valor * 0.05));
					System.out.println("Valor a pagar: R$" + (valor - (valor * 0.05)));
				}else {
					System.out.println("Tipo da carne: Picanha");
					System.out.println("Quantidade: " + kg + "kg");
					System.out.println("Valor total: R$" + valor);
					System.out.println("Tipo de pagamento: Dinheiro");
					System.out.println("Valor do desconto: R$" + (valor * 0.05));
					System.out.println("Valor a pagar: R$" + (valor - (valor * 0.05)));
				}				
			}else {
				float valor = kg * 7.80f;				
				if (cartao == 'S' || cartao == 's') {
					System.out.println("Tipo da carne: Picanha");
					System.out.println("Quantidade: " + kg + "kg");
					System.out.println("Valor total: R$" + valor);
					System.out.println("Tipo de pagamento: Cartão Tabajara");
					System.out.println("Valor do desconto: R$" + (valor * 0.05));
					System.out.println("Valor a pagar: R$" + (valor - (valor * 0.05)));
				}else {
					System.out.println("Tipo da carne: Picanha");
					System.out.println("Quantidade: " + kg + "kg");
					System.out.println("Valor total: R$" + valor);
					System.out.println("Tipo de pagamento: Dinheiro");
					System.out.println("Valor do desconto: R$" + (valor * 0.05));
					System.out.println("Valor a pagar: R$" + (valor - (valor * 0.05)));
				}
			}
		}else{
			System.out.println("Tipo de carne inválido");
		}
		scan.close();
	}
}
