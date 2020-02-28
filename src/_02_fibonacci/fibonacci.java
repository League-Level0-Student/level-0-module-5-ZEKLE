package _02_fibonacci;

public class fibonacci {
public static void main(String[] args) {
	int num  = 0;
	int num1 = 1;
	System.out.println(num);
	System.out.println(num1);
	for (int i = 0; i < 7; i++) {
		System.out.println(num + num1);
		num = num1;
		num1 =  num + num1;
		
	}
}
}
