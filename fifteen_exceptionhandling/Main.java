import java.util.Scanner;
public class Main{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a Divisor Value = ");
  int n=10;
  int d=sc.nextInt();
  try{
    int b=n/d;
    System.out.println("\n B value is"+b);
  }catch(ArithmeticException er1){
    System.out.println("\n Division by zero is not possible");
  }finally{
    System.out.println("Thanks");
  }
  System.out.println("Welcome to java");
 }
}
