package Lista2Java;
import java.util.Scanner;
public class Ex49 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Qual a resposta da questão 1? ");
		char q1 = scan.nextLine().charAt(0);
		System.out.print("Qual a resposta da questão 2? ");
		char q2 = scan.nextLine().charAt(0);
		System.out.print("Qual a resposta da questão 3? ");
		char q3 = scan.nextLine().charAt(0);
		System.out.print("Qual a resposta da questão 4? ");
		char q4 = scan.nextLine().charAt(0);
		System.out.print("Qual a resposta da questão 5? ");
		char q5 = scan.nextLine().charAt(0);
		System.out.print("Qual a resposta da questão 6? ");
		char q6 = scan.nextLine().charAt(0);
		System.out.print("Qual a resposta da questão 7? ");
		char q7 = scan.nextLine().charAt(0);
		System.out.print("Qual a resposta da questão 8? ");
		char q8 = scan.nextLine().charAt(0);
		System.out.print("Qual a resposta da questão 9? ");
		char q9 = scan.nextLine().charAt(0);
		System.out.print("Qual a resposta da questão 10? ");
		char q10 = scan.nextLine().charAt(0);
		int result = 0;
		if (q1 == 'A' || q1 == 'a') {
			System.out.println("Q1: " + q1 + " : Correto");
			result += 1;
		}else {
			System.out.println("Q1: " + q1 + " : Errado, respota correta (a)");
		}
		if (q2 == 'A' || q2 == 'a') {
			System.out.println("Q2: " + q2 + " : Correto");
			result += 1;
		}else {
			System.out.println("Q2: " + q2 + " : Errado, respota correta (a)");
		}
		if (q3 == 'B' || q3 == 'b') {
			System.out.println("Q3: " + q3 + " : Correto");
			result += 1;
		}else {
			System.out.println("Q3: " + q3 + " : Errado, respota correta (b)");
		}
		if (q4 == 'B' || q4 == 'b') {
			System.out.println("Q4: " + q4 + " : Correto");
			result += 1;
		}else {
			System.out.println("Q4: " + q4 + " : Errado, respota correta (b)");
		}
		if (q5 == 'C' || q5 == 'c') {
			System.out.println("Q5: " + q5 + " : Correto");
			result += 1;
		}else {
			System.out.println("Q5: " + q5 + " : Errado, respota correta (c)");
		}
		if (q6 == 'C' || q6 == 'c') {
			System.out.println("Q6: " + q6 + " : Correto");
			result += 1;
		}else {
			System.out.println("Q6: " + q6 + " : Errado, respota correta (c)");
		}
		if (q7 == 'D' || q7 == 'd') {
			System.out.println("Q7: " + q7 + " : Correto");
			result += 1;
		}else {
			System.out.println("Q7: " + q7 + " : Errado, respota correta (d)");
		}
		if (q8 == 'd' || q8 == 'd') {
			System.out.println("Q8: " + q8 + " : Correto");
			result += 1;
		}else {
			System.out.println("Q8: " + q8 + " : Errado, respota correta (d)");
		}
		if (q9 == 'E' || q9 == 'e') {
			System.out.println("Q9: " + q9 + " : Correto");
			result += 1;
		}else {
			System.out.println("Q9: " + q9 + " : Errado, respota correta (e)");
		}
		if (q10 == 'E' || q10 == 'e') {
			System.out.println("Q10: " + q10 + " : Correto");
			result += 1;
		}else {
			System.out.println("Q10: " + q10 + " : Errado, respota correta (e)");
		}
		System.out.println("Pontuação Final: " + result);
		scan.close();
	}
}
