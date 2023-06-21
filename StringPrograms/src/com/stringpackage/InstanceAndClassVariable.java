package com.stringpackage;
class Employee{
	int emid;
    String empname;
    float esalary;
    static String cname;
    static {
    	cname="Edubridge";
    }
	public Employee(int emid, String empname, float esalary) {
		super();
		this.emid = emid;
		this.empname = empname;
		this.esalary = esalary;
	}
    void disply() {
    	System.out.println("id "+emid);
    	System.out.println("name "+empname);
    	System.out.println("esalary "+esalary);
    	System.out.println("cname "+cname);
    }
}
public class InstanceAndClassVariable {
	public static void main(String[] args) {
		
	//Employee a=new Employee(1,"Kiran",12667,"Edubridge");
	//Employee b=new Employee(2,"Lavanya",135567,"Edubridge");
	//Employee c=new Employee(3,"Jhansi",345667,"Edubridge");
	//a.disply();
	//b.disply();
	//c.disply();
		
		Employee a=new Employee(1,"Kiran",12667);
		Employee b=new Employee(2,"Lavanya",135567);
		Employee c=new Employee(3,"Jhansi",345667);
		a.disply();
		b.disply();
		c.disply();
	
}

}