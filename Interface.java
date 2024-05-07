interface NewShape
{
	void draw(){System.out.println("arjun");}
}
interface Circle extends NewShape 
{
	void getRadius();
	int radius = 10;
}
class NewCircle implements Circle
{
	public void getRadius()
	{System.out.print(radius);}
	public void draw()
	{System.out.print("hello world");}
}
class Interface extends NewCircle
{
	public static void main(String[] args)
	{
		//Hybrid hb = new Hybrid();
		Circle ab = new NewCircle();
		ab.getRadius();
	}
}