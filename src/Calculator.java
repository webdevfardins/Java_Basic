import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two number");
		int a= sc.nextInt();
		int b= sc.nextInt();
		System.out.println("Enter Oprator(+,-,*,/,%)");
		char op=sc.next().charAt(0);
		switch(op) {
		case'+':
			System.out.println(a+b);
			break;
		case'-':
			System.out.println(a-b);
			break;
		case'*':
			System.out.println(a*b);
			break;
		case'/':
			System.out.println(a/b);
			break;
		case'%':
			System.out.println(a%b);
			break;
			default:
				System.out.println("Invalid Operator");

		}

	}

}
