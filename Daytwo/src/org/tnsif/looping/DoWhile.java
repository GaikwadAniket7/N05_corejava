//To demonstrate Do While loop

package org.tnsif.looping;
import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		do {
			System.out.println("Value of n is:"+n);
			n++;

		}while(n<14);
	}

}