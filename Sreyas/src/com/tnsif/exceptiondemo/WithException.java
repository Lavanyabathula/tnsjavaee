package com.tnsif.exceptiondemo;

import java.io.IOException;
import java.util.Scanner;

//Demo for exception handling
public class WithException {

	public static void main(String[] args) {
      try {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ender a value");
		a=sc.nextInt();
		System.out.println("Ender b value");
		b=sc.nextInt();
		int result=a/b;
      }
      catch(Exception e) {
		System.err.println("Enter integer value");

	}
      finally {
  		System.out.println("Thank you for using application, kindly logout");

      }

}
}
