//driver class

package org.tnsif.packages;

public class CitizenExecutor {

	private static String Nagpur;

	public static void main(String[] args) {
		
		// default constructor
		
	/*Citizen c= new Citizen();
	c.aadharNo=789456123121L;
	c.citizenType="Adult";
	c.gender="Male";	
	c.city= Nagpur;	*/
		
		
		
		//parameterise constructer
		 
		Citizen c=new Citizen();
		Citizen c1 = new Citizen("Adult",789456123789L,"Female","Nagpur");
		System.out.println(c1);
	}

}
