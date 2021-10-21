package operation2;
import java.util.Scanner;
public class stringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String inputName="SHRIKANT";
   int var=inputName.length();
    int var1=inputName.indexOf(var);
    // int var2=inputName.codePointAt(var);
     int var3=inputName.hashCode();
      System.out.println("The length are:"+var);
      System.out.println("The index of are:"+var1);
     // System.out.println("The length are:"+var2);
      System.out.println("The hashcode are:"+var3);
      
    //user input
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a name");
       String inputName1=sc.nextLine();
       System.out.println("My name is:"+inputName1);
    //
       //Scanner sc=new Scanner(System.in);
       System.out.println("Enter a name");
       String inputName2=sc.nextLine();
       int n=inputName2.length(); 
       int var4=inputName2.lastIndexOf(n);
       int num=inputName2.indexOf(n);
       System.out.println("My index is:"+n);
       System.out.println("My index is:"+var4);
       System.out.println("My index is:"+num); 
	}
 
}
