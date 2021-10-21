package operation2;
import java.util.Scanner;
public class dataType {
	/*public static void main(String args[])
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no");
      byte inputVar1=sc.nextByte();
      byte inputVar2=sc.nextByte();
	System.out.println("The number is:"+(inputVar1>inputVar2));
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no");
      short inputVar1=sc.nextShort();
      short inputVar2=sc.nextShort();
	System.out.println("The number is:"+(inputVar1>inputVar2));
	}*/
	public static void main(String args[])
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no");
      int inputVar1=sc.nextInt();
      int inputVar2=sc.nextInt();
	System.out.println("The number is:"+(inputVar1>inputVar2));
	
	
	Scanner c=new Scanner(System.in);
    System.out.println("Enter the no");
    double inputVar3=c.nextDouble();
    double inputVar4=c.nextDouble();
	System.out.println("The number is:"+(inputVar3>inputVar4));
	
	Scanner s=new Scanner(System.in);
    System.out.println("Enter the String");
    String inputVar5=s.toString();
   // String inputVar6=sc.toString();
    System.out.println("Enter the String:"+inputVar1);
    
	Scanner scu=new Scanner(System.in);
    System.out.println("Enter the no");
    long inputVar7=scu.nextLong();
    long inputVar8=scu.nextLong();
	System.out.println("The number is:"+(inputVar7>inputVar8));
}
}
