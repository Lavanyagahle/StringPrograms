package com.stringpackage;

import java.util.Scanner;

public class ReverseNum {
public static void main(String[] args) {
	String str;
	String revstr="";

	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Number");
	String k=sc.nextLine();
	str =String.valueOf(k);
	for(int i=str.length()-1;i>=0;i--) {
		char ch=str.charAt(i);
		revstr= revstr+ch;
	}
	System.out.println(revstr);
	System.out.println("Reverse Number is "+Integer.valueOf(revstr));
	if(str.equals(revstr)) {
		System.out.println("Given string is pallindrome");
	}else {
		System.out.println("Given string is not pallindrome");
	}	
}
}
