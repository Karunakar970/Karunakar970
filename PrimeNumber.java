//Natural Number>1
//which has only two factors 1 and itself
//19=>1 and 19=>Prime number 
 

public class PrimeNumber {
	public static void main(String args[]) {
		int num=17;
		int count=0;
	if(num>1)
	{
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		if(count==2)
		{
		System.out.println("this is a prime number");				
   
 }
else
{
	System.out.println("this is not a prime number");
		}
	}
	else
	{
		System.out.println("this is not a prime number");
	}
	}
		}
		
		
	

 