package operation2;
import java.util.Scanner;
//The program is MAXIMUM MNIMUM PROGRAM

public class Stack {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("Enter the Two Number");
		int inputNo=sc.nextInt();
		int inputNum1=sc.nextInt();
	//check the condition no.is min or max 
		if(inputNo>inputNum1)
		{
            System.out.println("The Maximum Number Is: "+inputNo);
		}
		else
		{
			
	        System.out.println("The Minimum Number Is: "+inputNum1);
		}  
       	
		
	//using float	
		float num1=4.5f;
		float num2=2.5f;
		
		if(num2>num1)
		{
            System.out.println("The Maximum Number Is: "+num1);
		}
		else
		{
			
	        System.out.println("The Minimum Number Is: "+num2);
		} 
		
	//using double
		
		double num3=46532;
		double num4=46787;
		
		if(num3>num4)
		{
            System.out.println("The Maximum Number Is: "+num4);
		}
		else
		{
			
	        System.out.println("The Minimum Number Is: "+num3);
		}  
	}
}
