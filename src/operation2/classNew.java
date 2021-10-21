package operation2;

import java.util.Scanner;

public class classNew {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the  number");
		int a=sc.nextInt();
		int b=a%10;
		int c=a/10;
		int d=c%10;
		int e=c/10;
	    int f=b*100+d*10+e;
		if(a!=f)
		{
           System.out.println("The  number is not palindrom");
		}
		else
		{
           System.out.println("The  number is  palindrom");
		}
		
	//multiplication of number	
		 System.out.println("Enter the number");
		int g=sc.nextInt();
		int h=g%10;
		int j=g/10;
		int k=j%10;
		int l=j/10;
		int m=h*k*l;
		System.out.println("the number is:"+m);
		
	    
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int o=n%10;
		int p=n/10;
		int q=p%10;
		int r=p/10;
		int s=o+q+r;
		System.out.println("the number is:"+s);
		
		
		System.out.println("Enter the number");
		int t=sc.nextInt();
		int u=t%10;
		int v=t/10;
		int w=v%10;
		int x=v/10;
		int y=u-w-x;
		System.out.println("the number is:"+y);
		
		
		System.out.println("Enter the number");
		int g1=sc.nextInt();
		int h2=g1%10;
		int j3=g1/10;
		int k4=j3%10;
		int l5=j3/10;
		int m6=h/k/l;
		System.out.println("the number is:"+m6);
		
}


}
