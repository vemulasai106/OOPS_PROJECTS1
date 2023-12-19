package All_programs;

class Student
{
	private int Salary;
	private String Name;
	 public int  getSalary()
	{
		return Salary;
	}
	public void setrollnumber(int Salary)
	{
		this.Salary = Salary;
	}
	public String getName()
	{
		return Name;
	}
	public void setName(String Name)
	{
		this.Name = Name;
	}

}
public class Encapsulation_program {

	public static void main(String[] args) {
		Student s = new Student();
		s.setrollnumber(25000);
		s.setName("Srihari Singireddy");
		System.out.println(s.getSalary());
		System.out.println(s.getName());

	}

}
