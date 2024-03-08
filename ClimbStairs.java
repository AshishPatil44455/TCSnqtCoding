import java.util.Scanner;

public class ClimbStairs{

public static int climbStairs (int n){

if (n==1) return 1;

int dp[]= new int [n+1];
dp [1]= 1;
dp [2]= 2;

for (int i =3; i<=n; i++){
dp[i] = dp[i-1] + dp[i-2];
}

return dp[n];

}
public static void main (String[] args){
	Scanner Sc= new Scanner(System.in);
	System.out.println("Enter tne number of stairs");
	int n= Sc.nextInt();

	System.out.println("Total number of ways to climb stairs = "+  climbStairs(n));
}
}