package Lista1Java;
import java.util.Scanner;
public class Ex08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Quanto você ganha por hora: ");
		float ganhaHora = scan.nextFloat();
		System.out.print("Quantas horas você trabalha no mês: ");
		int horas = scan.nextInt();
		System.out.println("Você ganha R$" + ganhaHora + " por hora e trabalha " + horas + " horas por mês então o seu salário é: R$" + (ganhaHora * horas));
		scan.close();
	}
}
