package org.tnsif.encapsulation;

public class encapsulationDemo {

	public static void main(String[] args) {
		
		//setting a value for private members
		HDFC h=new HDFC();
	    h.setAccountNo(123456789654L);
        h.setAccountType("Current Account");
        h.setCvvNo(233);
        h.setPinNo(1221);
        
      /* //accessing and printing all the private members 
        
       System.out.println(h.getAccountNo());
       System.out.println(h.getAccountType());
       System.out.println(h.getCvvNo());
       System.out.println(h.getPinNo());*/
       
    System.out.println(h);

}
}
