import java.util.Scanner;

public class MainClass {
	
	static int sum(int input) {
		int n = input;
		int total = 0;
		if(n == 0) {
			return 0;
		}
		else {
			for(int i = 1; i <= n; i++) {
				total = total + (i*i);
			}
			return total;
		}
	}
	
	static int product(int input) {
		int n = input;
		int total = 1;
		if(n == 0) {
			return 0;
		}
		else {
			for(int i = 1; i <= n; i++) {
				total = total * i;
			}
			return total;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number upto which you want to calculate: ");
		int input = sc.nextInt();
		
		System.out.println("Sum = " + sum(input));
		System.out.println("Product = " + product(input));
		System.out.println("It is successful");

		System.out.println("from branch test-anik");

	}	
	

}