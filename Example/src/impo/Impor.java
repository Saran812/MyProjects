package impo;

import java.util.Scanner;
public class Impor {
	public static void main(String[]args) {
		Scanner obj = new Scanner(System.in);
				System.out.println("Enter your details");
				
		String name=obj.nextLine();
		System.out.println("user name: "+name);
		
		int age=obj.nextInt();
		System.out.println("user age: "+age);
		
	}

}
