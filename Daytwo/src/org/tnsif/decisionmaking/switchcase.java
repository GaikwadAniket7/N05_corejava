//To demonstrate switchcase

package org.tnsif.decisionmaking;

import java.util.Scanner;
public class switchcase {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int songno=s.nextInt();
		switch(songno)
		{
		case 1:// if passing any string give ""
			System.out.println("zalak dhiklaja");
			break;
			
		case 2:
			System.out.println("tamma tamma");
			break;
			 
		case 3:
			System.out.println("Oo Avntava");
			break;
		}
	}

}
