

//Write a program to print the area of a rectangle by creating a class named
//'Area' taking the values of its length and breadth as parameters of its
//constructor and having a method named 'returnArea' which returns the
//area of the rectangle. Length and breadth of rectangle are entered through
//keyboard



import java.util.*;//Scanner class package to get the arguments from keyboard
class Area
{	int area;//variable declared of area
	 static Scanner sc=new Scanner(System.in);
	 public void Area()
	 {
      System.out.println("Area is"+area);
	 }
	public Area(int length,int breadth)//method of area having two parameters of length and breadth
	{
		area=length*breadth;//formula to calculate area
	}
	public int getArea()
	{
		return area;//return method to get the area
	}
	public static void main(String[] args)
	{
		int length,breadth;
		System.out.println("Mention any Length");
		length=sc.nextInt();
		System.out.println("Mention any Breadth");
		breadth=sc.nextInt();
		Area area=new Area(length,breadth);
		System.out.println("Area of Rectangle is "+area.getArea());
	}

}