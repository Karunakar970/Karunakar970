
public class PerfectNumber 
{
    //6--> 1+2+3=6    
//28--> 1+2+4+7+14=28
   public  static void main(String args[]) 
{
	   int n=6;
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				sum += i;
		}
		if(n==sum)
			System.out.println("Its a  Perfect Number");
		else
			System.out.println(" Its not a Perfect Number");
		}
	}
   
	

 