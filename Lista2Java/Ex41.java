package Lista2Java;
import java.util.Scanner;
public class Ex41 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe quanto quer sacar (10 a 600): R$");
		int num = scan.nextInt();
		if (num >= 10 && num <= 600) {
			int cem = num / 100;
			int cinquenta = (num - (cem * 100)) / 50;
			int dez = ((num - (cem * 100)) - (cinquenta * 50)) / 10;
			int cinco = (((num - (cem * 100)) - (cinquenta * 50)) - (dez * 10)) / 5;
			int um = ((((num - (cem * 100)) - (cinquenta * 50)) - (dez * 10)) - (cinco * 5));
			if (cem > 0) {
				System.out.print(cem + " nota(s) de 100");
			}
			if (cinquenta > 0) {
				if (cem > 0) {
					System.out.print(", " + cinquenta + " nota(s) de 50");				
				}else {
					System.out.print(cinquenta + " nota(s) de 50");
				}
			}
			if (dez > 0) {
				if (cinquenta > 0 || cem > 0) {
					System.out.print(", " + dez + " nota(s) de 10");				
				}else {
					System.out.print(dez + " nota(s) de 10");
				}
			}
			if (cinco > 0) {
				if (cinquenta > 0 || cem > 0 || dez > 0) {
					System.out.print(", " + cinco + " nota(s) de 5");				
				}else {
					System.out.print(cinco + " nota(s) de 5");
				}
			}
			if (um > 0) {
				if (cinquenta > 0 || cem > 0 || dez > 0 || cinco > 0) {
					System.out.print(" e " + um + " nota(s) de 1");				
				}else {
					System.out.print(um + " nota(s) de 1");
				}
			}
		}else {
			System.out.println("Quantidade para saque invalido, minimo de saque R$10.00 e maximo de saque R$600.00");
		}
		scan.close();
	}
}
