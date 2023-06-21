package com.stringpackage;

import java.util.Arrays;

public class CopyCharArray {
public static void main(String[] args) {
	char ch[]= {'e','d','u','b','r','i','d','g','e'};
	char[] ch1= new char[ch.length];
	for(int i=0;i<ch.length;i++) {
		ch1[i]=ch[i];
	}
	//System.out.println("Copied char array");
	//for(int i=0;i<ch.length;i++) {
		//System.out.println(ch[i]);
	//}
	
	//Another way to copy
	char ch2[]=Arrays.copyOf(ch, ch.length);
	System.out.println(ch2);
	
}

}
