package org.tnis.challenges;

import java.util.Scanner;

public class MovieTicket {
	
	 static void ticket(int age,float st)
	{
		//adults
		if (age>13)
		{
			if (st>=13.30 && st<=17.59)
				System.out.println("Ticket price adults $5.00");
			else 
				System.out.println("Ticket price for adults $8.00");
			
		}
		//children 
		if(age<13)
		{
			if (st>=13.30 && st<=17.59)
				System.out.println("Ticket price $.00");
			else 
				System.out.println("Ticket price $.00");
		}
	}

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int age=s.nextInt();
		 float st =s.nextInt();
		 ticket(age,st);
		

	}

}
