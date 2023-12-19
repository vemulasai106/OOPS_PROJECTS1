package All_programs;

interface A
{
	void a();
	void b();
	void c();
}
class B implements A
{
	public void a()
	{
		System.out.println("Iam a person of a");
	}
	public void b()
	{
		System.out.println("Iam a person of b");
	}
	public void c()
	{
		System.out.println("Iam a person of c");
	}
}
public class Abstraction_interface {

	public static void main(String[] args)
	{
		B a = new B();
		a.a();
		a.b();
		a.c();
	}
}
