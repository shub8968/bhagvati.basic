package bhagvati.basic.statements;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		char c = kb.nextLine().charAt(0);
		kb.close();
		switch (c) {
		case 'C':

			System.out.println("Current Account");
			break;

		case 'S':

			System.out.println("Savings Account");
			break;

		case 'L':
			System.out.println("Loan Account");
			break;

		case 'T':
			System.out.println("Term Deposit Account");
			break;

		default:
			System.out.println("No Match");

		}

	}
}
