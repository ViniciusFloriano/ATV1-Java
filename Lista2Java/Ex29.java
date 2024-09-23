package Lista2Java;
import java.util.Scanner;
public class Ex29 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe quanto você ganha por hora: R$");
		float ganhaHora = scan.nextFloat();
		System.out.print("Quantas horas você trabalha por mês: ");
		float horas = scan.nextFloat();
		float salario = ganhaHora * horas;
		float inss = salario * 0.10f;
		float fgts = salario * 0.11f;
		float ir = 0;
		if (salario <= 900) {
			ir = 0;
		}else if (salario > 900 && salario <= 1500){
			ir = salario * 0.05f;
		}else if (salario > 1500 && salario <= 2500){
			ir = salario * 0.10f;
		}else {
			ir = salario * 0.20f;
		}
		System.out.println("Salário bruto: " + salario);
		System.out.println("(-) IR: R$" + ir);
		System.out.println("(-) INSS: R$" + inss);
		System.out.println("FGTS: R$" + fgts);
		System.out.println("Total desconto: R$" + (inss + ir));
		System.out.println("Salário liquido: R$" + (salario - (inss + ir)));
		scan.close();
	}
}
