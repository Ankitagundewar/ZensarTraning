package OverloadingStaticEncapsulation;

/*2.	Write Employee Class with attributes like employee_id, name, and salary.
Create parameterized constructor to initialize this 3 attributes, 
and write a method to display this information of 5 objects, 
display total no of employees using static method, totalEmp(), which will return total no of employees.*/
public class Employee
{
	private int eid;
	private String ename;
	private String esal;
	
	public Employee(int eid, String ename, String esal)
	{
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	static Employee totalEmp(Employee e)
	{
		return e;
	}
	public static void main(String[] args)
	{
		Employee e=new Employee(1,"ABC","25000");
	}

}
