import java.util.Scanner;

public class Reverseanumber {

	public static void main(String [] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");
	
	
	int num=sc.nextInt();
	
	
	//Using String Builder class
	
	StringBuilder sbl =new StringBuilder();
	sbl.append(num);
	
	
StringBuilder	rev =sbl.reverse();


System.out.println(" reverse a number value>>> "+rev);
	}
}
 