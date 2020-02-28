package _01_prime_or_not;

import javax.swing.JOptionPane;

public class primeOrNot {
	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("choose a number");
		int num = Integer.parseInt(number);
		boolean number1 = true;
		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				System.out.println("not prime");
				number1 = false;
				break;
			}
		}
		if (number1 == true) {
			System.out.println("prime");
		}
		
		
	}
}
