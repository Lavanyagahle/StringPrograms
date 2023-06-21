package com.stringpackage;

public class DifferentBlocks {
	int i;
	static String cname;
	{
		System.out.println("Annonymous Block , Execute before constructor");
	}
	{
		System.out.println("Annonymous Block2");
	}
	static {
		cname="TCS";
		System.out.println("Company Name is "+cname);
	}
	public static void main(String[] args) {
		System.out.println("Main");
		DifferentBlocks db=new DifferentBlocks();
		System.out.println(db.i);
	}
	
}
