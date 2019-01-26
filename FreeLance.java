import java.util.*;
public class FreeLance
{
	FreeLance()
	{
		
	}
	class Person
	{
		int ID;
		String name;
		String password;
		int booking;
		int earned;
		ArrayList<String> tags = new ArrayList<String>();
		Person(int ID, String name, String password)
		{
			this.ID = ID;
			this.name = name;
			this.password = password;
		}
	}
}