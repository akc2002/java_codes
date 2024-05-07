 interface Intra {

	void display();
}

class Demo implements Intra
{
	public void display(){System.out.println("hello");}
}

public class Outer
{	
	public static void main(String[] args)
	{
		Demo outer = new Demo();
		Intra obj = outer;
		outer.display();
	}
}
