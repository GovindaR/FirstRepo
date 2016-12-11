import java.util;
import java.util.awt;

class Box
{
private int l;
private int b;
private int h;

public void setData(int x,int y,int z)
{
	l=x;
	b=y;
	h=z;
}

public int findArea()
{
	return l*b;
	
}

public int findVolumn()
{
	return l*b*h;
}

class BoxDemo
{
	public static void main(String arg[])
	{
		BoxDemo b = new BoxDemo();
		b.setData(6,6);
		int Area = b.findArea();
		System.out.println("Area is"+Area);
		int Volumn = b.findVolumn();
		System.out.println("Volumn is"+Volumn);
	}
}
}