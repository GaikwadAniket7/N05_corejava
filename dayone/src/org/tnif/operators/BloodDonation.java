package org.tnif.operators;

 import java.util.Scanner;
public class BloodDonation {

	public static void main(String[] args) {
 Scanner s= new Scanner (System.in);
 int age = s.nextInt();
 int weight = s.nextInt();
 
 if (age>=18 && weight>=50)
	 
 {
	 System.out.println("okay");
 }
 else
 {
	 System.out.println("not okay");
 }
	 
	}
	

}
