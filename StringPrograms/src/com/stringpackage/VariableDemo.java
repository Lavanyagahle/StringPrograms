package com.stringpackage;

public class VariableDemo {
int instancevar;
static int  staticVar;
static {
	staticVar= 0;
}
VariableDemo(){
	instancevar=0;
}

void updateData() {
	instancevar++; //0
	staticVar++;  //1
	System.out.println("instancevar="+instancevar); //1
	System.out.println("staticvari="+staticVar);  //1
}

	public static void main(String[] args) {
		VariableDemo ob1=new VariableDemo();
		 ob1.updateData();
		VariableDemo ob2=new VariableDemo();
       
        ob2.updateData();
	}

}