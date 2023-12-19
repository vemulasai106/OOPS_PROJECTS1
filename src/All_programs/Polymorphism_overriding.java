package All_programs;

class Goat
{
	public void drink()
	{
		System.out.println("The burger items are overrided at A");
	}
	class Dog extends Goat
	{
		public void eat()
		{
			System.out.println("The salad's and milkshakes are very tasty");
		}
	}
}
public class Polymorphism_overriding {

	public static void main(String[] args) {
		Goat g = new Goat();
		g.drink();

	}

}
