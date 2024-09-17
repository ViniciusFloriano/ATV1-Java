package Lista2Java;
import java.util.Scanner;
public class Ex38 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe um número entre 0 a 1000: ");
		int num = scan.nextInt();
		if (num > 0 && num < 1000) {
			int unidade = num % 10;
			int dezena = ((num - unidade) / 10) % 10;
			int centena = (((num - unidade) / 10) - dezena) / 10;
			if (num < 10) {
				System.out.println("O número " + num + " tem: " + unidade + " unidade(s)");
			}else if (num < 100) {
				System.out.println("O número " + num + " tem: " + dezena + " dezena(s) e " + unidade + " unidade(s)");
			}else {
				System.out.println("O número " + num + " tem: " + centena + " centena(s), " + dezena + " dezena(s) e " + unidade + " unidade(s)");
			}
		}else {
			System.out.println("Número inválido, insira um número maior que 0 e menor que 1000");
		}
		scan.close();
	}
}
