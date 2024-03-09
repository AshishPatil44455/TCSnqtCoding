import java.util.Scanner;

public class IsLeapYear{

public static int isLeapYear (int n){

if((n%400==0)||(n%100!=0)&&(n%4==0))
{
	return 1;
}
else{
	return 0;
}
}
public static void main (String[] args){
	Scanner Sc= new Scanner(System.in);
	System.out.println("Enter the year");
	int n= Sc.nextInt();
	int x =isLeapYear(n);
	String y;
	if (x==1){
		 y= "a Leap Year";
	}
	else{
     y ="not a Leap Year";
	}

	System.out.println(n+" Is "+ y );
}
}