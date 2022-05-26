import java.io.*;
class Simple
{
	void m() throws IOException
	{
		IOException err = new IOException("Device ERROR");
		throw err;
	}
	void n() throws IOException
	{
		m();
	}
	void p()
	{
		try
		{
			n();
		}
		catch(Exception e)
		{
			System.out.println("DEVICE ERROR");
		}
	}
	
}
public class Application_throws {

	public static void main(String[] args) {
		Simple obj = new Simple();
		obj.p();
		System.out.println("Normal flow>>>>>");

	}

}