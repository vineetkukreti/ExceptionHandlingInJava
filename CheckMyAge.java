import java.util.Scanner;
class AgeException extends Exception
{
	int age;
	AgeException(int age)
	{
		this.age =age;
	}
	public String toString()
	{
		return "Age cannot be negative";
	}
}
class ExcessAge extends Exception
{
	int age;
	ExcessAge(int age)
	{
		this.age = age;
	}
	public String toString()
	{
		return "Age cannot exceed 150";
	}
}

class IncorrectType extends Exception
{
	int age;
	IncorrectType(int age)
	{
		this.age = age;
	}
	public String toString()
	{
		return "Data of age can only int";
	}
}

public class CheckMyAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age : ");
		int age = sc.nextInt();
		try
		{
		 if(age<0)
		 {
			 throw new AgeException(age);
		 }
		 else if(age>150)
		 {
			 throw new ExcessAge(age);
		 }
		//else if(age)
		 else
		 {
			 System.out.println("Your age has been registered");
		 }
			
		}
		catch(AgeException e)
		{
			System.out.println(e);
		}
		
		catch(ExcessAge e)
		{
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("Your program worked");
		}
	}

}