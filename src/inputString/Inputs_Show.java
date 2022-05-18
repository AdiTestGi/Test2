package inputString;

import java.util.Scanner;

public class Inputs_Show {
	
	
	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		Scanner b= new Scanner(System.in);
		Scanner c= new Scanner(System.in);
		String str1 = a.next();
		String str2 = b.next();
		int I = c.nextInt();
		
		System.out.println("\nInput:");
		System.out.println(str1+" was "+str2+" in "+I);
		
		System.out.println("\nOutput:");
		System.out.println("Current Name:"+str1);
		System.out.println("Last Name:"+str2);
		System.out.println("Change Year:"+I);
		
		a.close();
		b.close();
		c.close();
	
	}

}
