package Lista2Java;
import java.util.Scanner;
public class Ex28 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe seu salário: R$");
		float salario = scan.nextFloat();
		if (salario < 280) {
			System.out.println("Salário antes do ajuste: " + salario);
			System.out.println("Percentual de aumento aplicado: 20%");
			System.out.println("Valor do aumento: " + (salario * 0.20));
			System.out.println("Novo salário: " + (salario + (salario * 0.20)));
		}else if (salario > 280 && salario < 700){
			System.out.println("Salário antes do ajuste: " + salario);
			System.out.println("Percentual de aumento aplicado: 15%");
			System.out.println("Valor do aumento: " + (salario * 0.15));
			System.out.println("Novo salário: " + (salario + (salario * 0.15)));
		}else if (salario > 700 && salario < 1500){
			System.out.println("Salário antes do ajuste: " + salario);
			System.out.println("Percentual de aumento aplicado: 10%");
			System.out.println("Valor do aumento: " + (salario * 0.10));
			System.out.println("Novo salário: " + (salario + (salario * 0.10)));
		}else {
			System.out.println("Salário antes do ajuste: " + salario);
			System.out.println("Percentual de aumento aplicado: 5%");
			System.out.println("Valor do aumento: " + (salario * 0.05));
			System.out.println("Novo salário: " + (salario + (salario * 0.05)));
		}
		scan.close();
	}
}
