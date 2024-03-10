import java.util.Scanner;

public class NumCheck{

public static void numCheck(){
Scanner Sc= new Scanner(System.in);
System.out.println("Enter the number to check :");
int num = Sc.nextInt();

if(num>0){
System.out.println(num +" is a Positive number");
}else if(num==0){
System.out.println(num +"is Zero");
}else{
System.out.println("is a Negetive number");
}
if(num%2==0){
System.out.println(num+" is a Even number");
}
else{
System.out.println(num+" is a Odd number");
}


}
public static void main (String[] args){
numCheck();

}

}