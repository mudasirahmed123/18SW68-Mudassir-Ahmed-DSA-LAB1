import java.util.*;//Scanner class package which will take the arguments from the user as the commandline arguments 
class Area
{	int area;//variable of area 
	static Scanner sc=new Scanner(System.in);//scanner object
	public void setDim(int length,int breadth)//method to set two parameters of length and width
	
	{
		area=length*breadth;//area formula
	}
	public double getArea()//method to get the value of area
	{
		return area;
	}
	public static void main(String[] args)//main method
	{
		int length,breadth;//two variables of length and breadth
		System.out.println("Enter Length");//prints to enter the length on the console
		length=sc.nextInt();//it would take the length into integer value
		System.out.println("Enter Breadth");//prints the breadth 
		breadth=sc.nextInt();//get the  breadth value into integer data type
		Area area1=new Area();//object of Area class
		area1.setDim(length,breadth);//it set the given parameters
		System.out.println("Area of Rectangle is "+area1.getArea());//prints the area through getter method
	}

}