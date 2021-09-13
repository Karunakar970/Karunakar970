import java.util.Scanner;

public class ReverseaString {

	public static void main (String[] args) {
		/*String str="ABCD";
		String rev=" ";
		int len=str.length();
		for(int i=len-1; i>=0;i--) {
		rev=rev+str.charAt(i);	
		}
		System.out.println("reverse String value>>>>"+rev);*/
		
		
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string value");
		String str=sc.next();
		//by using StringBuilDer class
		StringBuilder sbl=new StringBuilder();
		sbl.append(str);
	StringBuilder	rev= sbl.reverse();
	System.out.println("reverse a String value"+rev);
	}
}

