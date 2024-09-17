package Lista1Java;
import java.util.Scanner;
public class Ex14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Quanto você ganha por hora: ");
		float ganhaHora = scan.nextFloat();
		System.out.print("Quantas horas você trabalha no mês: ");
		int horas = scan.nextInt();
		float salario = ganhaHora * horas;
		System.out.println("+ Salário Bruto: R$" + salario);
		float ir = salario * 0.11f;
		float inss = salario * 0.08f;
		float sindicato = salario * 0.05f;
		System.out.println("- IR: R$" + ir);
		System.out.println("- INSS: R$" + inss);
		System.out.println("- Sindicato: R$" + sindicato);
		System.out.println("= Salário Liquido: R$" + (salario - (ir + inss + sindicato)));
		scan.close();
	}
}
