package org.tnsif.bankexecutordemo;

import org.tnsif.accesspecifier.Bank;

public class BankExecutor {

	public static void main(String[] args) {
		
		/* pinNo and displayPrivate() method are private,\
		 * so we 
		 * can't acces into antoher class
		 * another package, olay we can access private
		 * data members inside the same class*/
		
		//b.pinNo()
        //b.displayPrivate();
		 
		 /* accountNo and display default() method are default that's why,
		  * only we can access within same package
		  */
		//b.accountNo;

	
		Bank b=new Bank();
		b.bankName="SBI";
		b.displayPublic();
		
	}
}
	