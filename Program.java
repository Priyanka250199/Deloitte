package sum;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two num");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int sum;
		
		sum = num1+num2;
		 if(sum<0)
			 
			 System.out.println("sum is less than zero");
		 else
			 System.out.println("sum is :" +sum);
			 
	}

}
