package Calculatordev;
import java.util.Scanner;

public class Calculatordev {
	public static int add(int number1, int number2) {
		return number1 + number2;
	}

	public static int sub(int number1, int number2) {
		return (number1 - number2);

	}

	public static int mul(int number1, int number2) {
		return number1 * number2;
	}

	public static double div(double number1, double number2) {
		if (number2 == 0) {
			throw new IllegalArgumentException("Number can not be divide by 0!");
		}

		return number1 / number2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int input = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Second Number : ");
		int input1 = sc.nextInt();
		
		System.out.println("The Addition is : " + Calculatordev.add(input, input1));
		System.out.println("The Substraction is : " + Calculatordev.sub(input, input1));
		System.out.println("The Multiplication is : " + Calculatordev.mul(input, input1));
		System.out.println("The Division is : " + Calculatordev.div(input, input1));
		
		
	}


}
