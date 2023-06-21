package com.stringpackage;

import java.util.Scanner;
class Prime{
	int num;
	void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
	}
	void checkPrime() {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
				count++;
			}
	}
		if(count==2) {
			System.out.println("Given number is prime number");
		}else {
			System.out.println("Given number is not prime number");
		}
}
}
public class PrimeNum {
public static void main(String[] args) {
	Prime p=new Prime();
	p.input();
	p.checkPrime();
}
}

