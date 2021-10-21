package operation2;

import java.util.Scanner;

public class FibonacciSeriese {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("Enter the ending seriese  number");
		int inputNo=sc.nextInt();
		System.out.println("the fobonacci seriese start from: ");
       int inputNum1=sc.nextInt();
       System.out.println("Enter the all no.of seriese: ");
       for(number=inputNum1;number<inputNo;number++)
        
          System.out.println(number+(number+1));

	}

}
