package com.stringpackage;

import java.util.Scanner;

public class CheckUserLogin {
String email;
String pass;
void input() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Email");
	email=sc.nextLine();
	System.out.println("Enter Password");
	pass=sc.nextLine();
}
void check() {
	if(email.equalsIgnoreCase("lavanyagahale@gmail.com")&& pass.equals("lavanya22")) {
		System.out.println("Valid user");
	}else {
		System.out.println("User is not valid");
	}
}
public static void main(String[] args) {
	CheckUserLogin cul= new CheckUserLogin();
	cul.input();
	cul.check();
}

}
