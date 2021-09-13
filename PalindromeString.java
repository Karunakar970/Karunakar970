import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		 
		
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in); 

		
		  
		System.out.println("the palindrome value is>>> ");
		 
			  	String str = sc.next();

		//by using StringBuilder class
		StringBuilder sbl=new StringBuilder();

		sbl.append(str);
		StringBuilder rev =sbl.reverse();


		System.out.println("the palindrome value is>>>"+rev);

	}

}
