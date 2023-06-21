/*
 * H
 * HE
 * HEL
 * HELL
 * HELLO
 */
package com.stringpackage;

import java.util.Scanner;

public class PatternProgram {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String");
	String str= sc.nextLine();
	
	
	//String str= "HELLO";
	//System.out.println(str.substring(0, 1));
	//System.out.println(str.substring(0, 2));
	//System.out.println(str.substring(0, 3));
	//System.out.println(str.substring(0, 4));
	//System.out.println(str.substring(0, 5));
	
	//for(int i=0;i<str.length();i++) {
		//System.out.println(str.substring(0, (i+1)));
	//}
	for(int i=str.length()-1;i>=0;i--) {
		System.out.println(str.substring(0, (i+1)));
	}
}
}
