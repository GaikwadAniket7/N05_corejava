/*pratik is so much intrested in garderning hence he plants more trees in his garden
 * He plants tress in rectringular manner in the oreder of rows and coloum and numbres the trees in row wise order
 * he planted mango tree in the first row and first coloum.and in last coloum
 * so, given the tree no and row and colums your task is to find out wheter the given tree is mango tree or not
 * I/P= n=5 (n= rows and coloum)
 * t=11(tree no)
 * 
 */
package org.tnis.challenges;
import java.util.Scanner;
public class MangoTreeExecutor {

	static void isMangoTree(int n,int t)
	{
		if (t%n==0 || t%n==1 || t<=n)
		{
			System.out.println("Mango Tree");
		}
		else 
		{
			System.out.println("Not a mango tree");
		}
	}
	
	public static void main (String[] arges) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter thr values of n and t:");
		int n=s.nextInt();
		int t=s.nextInt();
		isMangoTree(n,t);
	}
	
}
