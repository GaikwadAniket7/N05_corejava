//program to demonstrate access specifiers

package org.tnsif.accesspecifier;

public class Bank {
	
	//different access specifiers
	public String bankName;
	 
	private int pinNo;
	
	long accountNo;
	
	public void displayPublic()
	{
		System.out.println("Bank name is :"+bankName);
	}
	
    private void displayPrivate()
    {
    System.out.println("pin No is:"+pinNo);
    }
    
    //default method
    
    void displayDefault()
    {
    	System.out.println("Account No is:"+accountNo);
    }
	


}
