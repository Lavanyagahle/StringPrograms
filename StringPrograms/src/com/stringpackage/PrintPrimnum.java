package com.stringpackage;

public class PrintPrimnum {
public static void main(String[] args) {
	int count;
	for(int num=1;num<=100;num++) {
		count=0;
		for(int j=1;j<=num;j++) {
			if(num%j==0) {
				count++;
			}
		}
	
		if(count==2) {
			System.out.println(num);
		}
	}
	
}
}
