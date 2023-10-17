package Constructor;

public class Employee {

	int id;
	String name;
	String department;
	
	public Employee()
	{
		
		
	}
	
	public Employee(int id)
	{
		this.id=id;
	}
	
	public Employee(int id,String department)
	{
		this.id=id;
		this.department=department;
	}
	
	public Employee(int id,String department, String name)
	{
		this.id=id;
		this.department=department;
		this.name=name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=new Employee();
		e1.id=10;
		e1.name="Ram";
		e1.department="IT";
		
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.department);
		
		Employee e2=new Employee(40);
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.department);
		
	}
	

}
