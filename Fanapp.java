class fan 
{
	String colour;
	int cost;
	int blades;

	void rotate()
	{
		    System.out.println("fan is rotating");
	}
	void blowsair()
	{
			System.out.println("fan is blowing air");
	}
}
class Fanapp
{

	public static void main(String[] args) 
	{
		fan f1 = new fan();
		fan f2 = new fan();
		

		f1.rotate();
		f1.blowsair();

		f2.rotate();
		f2.blowsair();

	}
}
