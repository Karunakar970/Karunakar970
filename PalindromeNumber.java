import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		
		System.out.println("this is a palindrome number");
	int	num = sc.nextInt();

	//by using StringBuilder class
	  StringBuilder sbl=new StringBuilder();

		sbl.append(num);
		StringBuilder rev =sbl.reverse();


		System.out.println("the palindrome value is>>>"+rev);  

	 
	}

}
