import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		@SuppressWarnings("resource")
 

	
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value...: ");
			int n=sc.nextInt();
			int temp=n;
			int rev=0;
				while(n>0)
			{
				rev=rev*10+n%10;
				n=n/10;
			}
			if(temp==rev)
			{
				System.out.println(temp+"is a Pallindrome Number....!!");
			}
			else
			{
				System.out.println(temp+"is not a Pallindrome Number...!!");
			}
	 
	}

}
