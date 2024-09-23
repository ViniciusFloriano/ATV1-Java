package Lista2Java;
import java.util.Scanner;
public class Ex28 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe seu salário: R$");
		float salario = scan.nextFloat();
		float valorAumento = 0;
		String percentual = "";
		if (salario < 280) {
			valorAumento = salario * 0.20f;
			percentual = "20%";
		}else if (salario > 280 && salario < 700){
			valorAumento = salario * 0.15f;
			percentual = "15%";
		}else if (salario > 700 && salario < 1500){
			valorAumento = salario * 0.10f;
			percentual = "10%";
		}else {
			valorAumento = salario * 0.05f;
			percentual = "5%";
		}
		System.out.println("Salário antes do ajuste: " + salario);
		System.out.println("Percentual de aumento aplicado: " + percentual);
		System.out.println("Valor do aumento: " + valorAumento);
		System.out.println("Novo salário: " + (salario + valorAumento));
		scan.close();
	}
}
