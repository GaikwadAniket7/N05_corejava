package org.tnif.operators;

import java.util.Scanner;
public class A {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
     
      if(age > 20) 
      {
        System.out.println("Adult");
      }
      else 
      {
        System.out.println("NOT ADULT")
      }
}
}