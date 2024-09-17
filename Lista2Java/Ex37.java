package Lista2Java;
import java.util.Scanner;
public class Ex37 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o dia: ");
		int dia = scan.nextInt();
		System.out.print("Informe o mês: ");
		int mes = scan.nextInt();
		System.out.print("Informe o ano: ");
		int ano = scan.nextInt();
		if (dia > 0 && dia < 32) {
			if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia > 0 && dia < 32)) {
				if (ano > 0 && ano <= 2024) {
					System.out.println("Data Válida");
				}
			}else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia > 0 && dia < 31)) {
				if (ano > 0 && ano <= 2024) {
					System.out.println("Data Válida");
				}
			}else if(dia > 0 && dia < 30 && mes == 2 && (ano % 4 == 0)) {
				System.out.println("Data Válida");
			}else if(dia > 0 && dia < 29 && mes == 2) {
				System.out.println("Data Válida");
			}else {
				System.out.println("Data Inválida");
			}
		}else {
			System.out.println("Data Inválida");
		}
		scan.close();
	}
}
