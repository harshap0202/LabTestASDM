import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int exit = 0;
		while (exit != 7) {
		System.out.println("Select an option");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Square of a number");
		System.out.println("6. a^b");
		System.out.println("7. Exit");
		int opt = s.nextInt();

		switch (opt)
		{
		case 1: 
			System.out.println("For addition enter 1st Number : ");
			int num1 = s.nextInt();
			System.out.println("Enter 2nd Number : ");
			int num2 = s.nextInt();
			System.out.println("Ans => "+num1+" + "+num2+" = "+(num1+num2));
			break;
		case 2: 
			System.out.println("For Subtraction enter 1st Number : ");
			int num3 = s.nextInt();
			System.out.println("Enter 2nd Number : ");
			int num4 = s.nextInt();
			System.out.println("Ans => "+num3+" - "+num4+" = "+(num3-num4));
			break;
		case 3: 
			System.out.println("For Multiplication enter 1st Number : ");
			int num5 = s.nextInt();
			System.out.println("Enter 2nd Number : ");
			int num6 = s.nextInt();
			System.out.println("Ans => "+num5+" x "+num6+" = "+(num5*num6));
			break;
		case 4:
			System.out.println("For Division enter 1st Number : ");
			int num7 = s.nextInt();
			System.out.println("Enter 2nd Number : ");
			int num8 = s.nextInt();
			if (num8 == 0) {
				System.out.println("Error: Division by zero");
			} else {
				System.out.println("Ans => "+num7+" / "+num8+" = "+((double)num7/num8));
			}
			break;
		case 5:
			System.out.println("Enter a number to find its square: ");
			int num9 = s.nextInt();
			System.out.println("Ans => "+num9+" ^ 2 = "+(num9*num9));
			break;
		case 6:
			System.out.println("Enter the value of a: ");
			double a = s.nextDouble();
			System.out.println("Enter the value of b: ");
			double b = s.nextDouble();
			System.out.println("Ans => "+a+" ^ "+b+" = "+Math.pow(a, b));
			break;
		case 7:
			exit = 7;
			break;
		default:
			System.out.println("Wrong Selection. \nTry again\n");
			break;
			}	
		}
		System.out.println("Session Terminated");
	}
}
