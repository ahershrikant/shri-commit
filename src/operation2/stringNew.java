package operation2;
import java.util.Scanner;
public class stringNew {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name");
		String inputW=sc.nextLine();
		String inputW1=sc.nextLine();
		int length=inputW.length();
		int length1=inputW1.length();
		if(length<length1)
            System.out.println("the given name is "+inputW);
		else
			 System.out.println("the given name is "+inputW1);
		
//maximum string
		System.out.println("Enter a name");
		String inputW2=sc.nextLine();
		String inputW3=sc.nextLine();
		int length2=inputW2.length();
		int length3=inputW3.length();
		if(length2>length3)
            System.out.println("the given name is "+inputW2);
		else
			 System.out.println("the given name is "+inputW3);
		
//multiplication of String		
		
		System.out.println("Enter a name");
		String inputW4=sc.nextLine();
		String inputW5=sc.nextLine();
		int length4=inputW4.length();
		int length5=inputW5.length();
		if(length4>length5)
            System.out.println("the given name is "+(inputW4+inputW5));
		else
			 System.out.println("the given name is "+(length4*length5));
	}

}
