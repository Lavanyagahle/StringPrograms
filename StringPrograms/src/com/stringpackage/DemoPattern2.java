package com.stringpackage;

import java.util.Scanner;

public class DemoPattern2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size;
	System.out.println("Enter size");
	size=sc.nextInt(); 

	int arr[]=new int[size];
	for(int i=0;i<=arr.length;i++) {
		arr[i]=sc.nextInt();
		for(int j=1;i<=arr[i];i++) {
	    	for(int b=1;b<=arr[i]-i;b++) {
	    		System.out.print(" ");
	    	}
	    	for(int n=1; n<=i;n++) {
	    		System.out.print(arr[i]+" ");
	    	}
	    	System.out.println();
	    }
	  
		for(int j=1;i<=arr[i];i++) {
	    	for(int b=1;b<=arr[i]-i;b++) {
	    		System.out.print(" ");
	    	}
	    	for(int n=1; n<=i;n++) {
	    		System.out.print(arr[i]+" ");
	    	}
	    	System.out.println();
	    }
	  
		for(int j=1;i<=arr[i];i++) {
	    	for(int b=1;b<=arr[i]-i;b++) {
	    		System.out.print(" ");
	    	}
	    	for(int n=1; n<=i;n++) {
	    		System.out.print(arr[i]+" ");
	    	}
	    	System.out.println();
	    }
	  
	}
}
}
