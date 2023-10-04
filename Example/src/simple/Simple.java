package simple;

import java.util.Scanner;
public class Simple {

	public static void main(String[]args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=obj.nextInt();
		System.out.println(" the a value is :" +a);
		int b= obj.nextInt();
		System.out.println(" the b value is :"+b);
		System.out.println("Add:"+( a+b));
		System.out.println("Sub:"+( a-b));
		System.out.println("Mul:"+( a*b));		
		
		
}
}