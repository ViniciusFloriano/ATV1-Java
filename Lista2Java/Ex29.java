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
		if (salario <= 900) {
			System.out.println("Salário bruto: " + salario);
			System.out.println("(-) IR (isento): R$0.0");
			System.out.println("(-) INSS (10%): R$" + inss);
			System.out.println("FGTS (11%): R$" + fgts);
			System.out.println("Total desconto: R$" + (inss + 0));
			System.out.println("Salário liquido: R$" + (salario - (inss + 0)));
		}else if (salario > 900 && salario <= 1500){
			float ir = salario * 0.05f;
			System.out.println("Salário bruto: " + salario);
			System.out.println("(-) IR (5%): R$" + ir);
			System.out.println("(-) INSS (10%): R$" + inss);
			System.out.println("FGTS (11%): R$" + fgts);
			System.out.println("Total desconto: R$" + (inss + ir));
			System.out.println("Salário liquido: R$" + (salario - (inss + ir)));
		}else if (salario > 1500 && salario <= 2500){
			float ir = salario * 0.10f;
			System.out.println("Salário bruto: " + salario);
			System.out.println("(-) IR (10%): R$" + ir);
			System.out.println("(-) INSS (10%): R$" + inss);
			System.out.println("FGTS (11%): R$" + fgts);
			System.out.println("Total desconto: R$" + (inss + ir));
			System.out.println("Salário liquido: R$" + (salario - (inss + ir)));
		}else {
			float ir = salario * 0.20f;
			System.out.println("Salário bruto: " + salario);
			System.out.println("(-) IR (20%): R$" + ir);
			System.out.println("(-) INSS (10%): R$" + inss);
			System.out.println("FGTS (11%): R$" + fgts);
			System.out.println("Total desconto: R$" + (inss + ir));
			System.out.println("Salário liquido: R$" + (salario - (inss + ir)));
		}
		scan.close();
	}
}
