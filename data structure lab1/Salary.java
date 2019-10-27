//1.   Write a program by creating an 'Employee' class having the following
//methods and print the final salary.
//1 - 'getInfo()' which takes the salary, number of hours of work per day of
//employee as parameter





class Employee//defintion of the class
{	//

	int numofHours;//declares an int type to show the number of hours
	int salary;//declares salary of int type(it would be in whole number)
	public void getInfo(int salary,int numOfHours)//method which has two parameters
	{
		this.numofHours=numofHours;//shows the current object of hours
		this.salary=salary;//shows the current object of salary
	}
	public void addSalary()//method to add salary
	{
		if(salary<10000)//checks the condition if salary is less than 10000
		{
			salary+=100;//it adds 100 in the salary
		}
	}
	public void addWork()//method showing add work 
	{
		if(numofHours>1)//checks the condition if number of hours is greater than 1
		{
			salary+=7;//it will add 7 in the salary by increasing the hours of 7
		}
	}
	public void printSalary()//method to print the salary
	{
		System.out.println("The Final/total Salary is "+salary);//prints on the console the final salary
	}
	public static void main(String args[])//main method to take arguments 
	{
		Employee ob=new Employee();//creates the object of employee class
		ob.getInfo(1050,3);
		ob.addSalary();
		ob.addWork();
		ob.printSalary();
	}

}