import java.util.Scanner;
class NoJaiHind extends  Exception
{
	private String s;
	NoJaiHind(String s)
	{
		this.s = s;
	}
	public String toString()
	{
		return "Wrong String Named "+s;
	}
}
public class MyNation {

	public static void main(String[] args) {
		try{
	 Scanner sc = new Scanner(System.in);
	// System.out.println('Enter the string :');
	 String word = sc.nextLine();
	 String valid ="JAI HIND";
	 if(valid.equalsIgnoreCase(word))
	 {
		 System.out.println("String is correct");
	 }
	 else
	 {
		 throw new NoJaiHind(word);
	 }
		}
		catch(NoJaiHind a)
		{
			System.out.println(a);
		}
	finally
	{
		//sc.close();
		System.out.println("Your finnally worked");
	}
	}

}