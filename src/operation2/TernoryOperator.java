package operation2;
import java.util.Scanner;
public class TernoryOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int userAge=sc.nextInt();
		
		if(userAge>18)
			System.out.println("the age is major");
		else
			System.out.println("the age is minor");
	}

}
