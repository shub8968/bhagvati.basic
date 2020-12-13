package bhagvati.basic.programs;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int j = kb.nextInt();
		kb.close();
		double sum = 0;
		while(j>0) {
			sum = sum + Math.pow(j % 10,3);
			j = j/10;
			System.out.println("Value of x "+j);
		}
		System.out.println(sum);
	}
}
