package inputString;

import java.util.Scanner;

public class app_Id {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println("\nInput String:");
		System.out.println("Your application has been processed successfully with application ID:"+str);
        
		System.out.println("\nOutput:");
		System.out.println("Application ID: "+str);
	}

}
