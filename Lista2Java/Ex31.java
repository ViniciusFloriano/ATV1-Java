package Lista2Java;
import java.util.Scanner;
public class Ex31 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o preço do produto: R$");
		float preco = scan.nextFloat();
		System.out.print("Informe o cófigo de origem: ");
		int cod = scan.nextInt();
		if (cod == 1) {
			System.out.println("Preço: " + preco);
			System.out.println("Código de origem: Sul");
		}else if (cod == 2){
			System.out.println("Preço: " + preco);
			System.out.println("Código de origem: Norte");
		}else if (cod == 3){
			System.out.println("Preço: " + preco);
			System.out.println("Código de origem: Leste");
		}else if (cod == 4){
			System.out.println("Preço: " + preco);
			System.out.println("Código de origem: Oeste");
		}else if (cod == 5 || cod == 6){
			System.out.println("Preço: " + preco);
			System.out.println("Código de origem: Nordeste");
		}else if (cod == 7 || cod == 8){
			System.out.println("Preço: " + preco);
			System.out.println("Código de origem: Centro-Oeste");
		}else {
			System.out.println("Preço: " + preco);
			System.out.println("Código de origem: Importado");
		}
		scan.close();
	}
}