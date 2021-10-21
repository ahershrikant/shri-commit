package operation2;
import java.util.Scanner;
public class Palindrom {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int a=sc.nextInt();
			int b=a%10;
			int c=a/10;
			int d=c%10;
			int e=c/10;
			int f=b*100+d*10+e;
			if(a==f)
			{
	           System.out.println("The  number is palindrom");
			}
			else
			{
	           System.out.println("The  number is not palindrom");
			}
	}

}
