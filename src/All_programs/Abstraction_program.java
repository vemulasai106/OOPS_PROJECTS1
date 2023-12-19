package All_programs;

abstract class Bike 
{
	abstract void run();
}
class Honda extends Bike
{
	public void run()
	{
		System.out.println("Honda bike is running");
	}
}
abstract class Teacher
{
	abstract void student();
}
class School extends Teacher
{
	public void student()
	{
		System.out.println("Student was present in today");
	}
}
public class Abstraction_program {

	public static void main(String[] args) {
		Honda h = new Honda();
		School s = new School();
		h.run();
		s.student();

	}

}
