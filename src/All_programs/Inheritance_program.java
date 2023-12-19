package All_programs;

class Book
{
	public int add(int i,int j)
	{
		return i+j;
	}
}
class Pen extends Book
{
	public int sub(int i,int j)
	{
		return i-j;
	}
}
class Pencil extends Pen
{
	public int mul(int i,int j)
	{
		return i*j;
	}
}
public class Inheritance_program {

	public static void main(String[] args) {
		Pencil p = new Pencil();
		int result1 = p.add(10,20);
		int result2 = p.sub(20,5);
		int result3 = p.mul(10,4);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}
