package All_programs;

public class Polymorphism_overloading {

	public void show()
	{
		System.out.println("The method will be showing a new data");
	}
	public void show(int i)
	{
		System.out.println("overloading"+i);
	}
	public void showing()
	{
		System.out.println("The class will be on a methods");
	}
	public void showing(double j)
	{
		System.out.println("overloading"+j);
	}
	public static void main(String[] args) {
		Polymorphism_overloading obj = new Polymorphism_overloading();
		obj.show();
		obj.showing();
		
	}

}
