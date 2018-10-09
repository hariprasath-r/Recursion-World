import java.util.Scanner;

public class PowersOfNumber {
	
	static int powerByLoop(int number, int power) {
		int result = number;
		for(int i = 1; i < power; i++) {
			result *= number;
		}
		return result;
	}
	
	static int powerByRecusion(int number, int power) {
		if(power == 1)
			return number;
		else
			return number * powerByRecusion(number, power - 1);
	}

	public static void main(String[] args) {

		int num = 0;
		int power = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(">---Enter the number : ");
		num = scan.nextInt();
		
		System.out.println(">---Enter power : ");
		power = scan.nextInt();
		
		long startTime = System.currentTimeMillis();
		System.out.println(">--- Power by loop = " + powerByLoop(num, power));
		System.out.println(">---Time Taken = " + (System.currentTimeMillis() - startTime));
		
		startTime = System.currentTimeMillis();
		System.out.println(">--- Power by recursion = " + powerByRecusion(num, power));
		System.out.println(">---Time Taken = " + (System.currentTimeMillis() - startTime));

		scan.close();
	}

}
