//Armstrong numbers in  java program

   
//153=>1*1*1+5*5*5+3*3*3=153

public class ArmstrongNumber {

public static void isArmStrong (int num)
{

int cube=0;

int r;
int t;

t=num;

while(num>0) {
	r=num%10;
	num=num/10;
	cube=cube+(r*r*r);
}

if(t==cube) {
	System.out.println("this is a armstrong number");
}else {
	System.out.println("this is not a armstrong number");
}
}
public static void main (String[]args) {
	isArmStrong(153);
	isArmStrong(0);
	isArmStrong(401);
	isArmStrong(1);
}

}