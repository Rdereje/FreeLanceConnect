import java.util.*;
public class FreeLance
{
	List<Person> Info;
	int IDcount;
	FreeLance()
	{
		Info = new ArrayList<Person>();
		IDcount = 0;
	}
	void Add(String name, String password)
	{
		Info.add(new Person(IDcount, name, password));
		IDcount++;
	}
	class Person
	{
		int ID;
		String name;
		String password;
		int booking;
		int earned;
		ArrayList<String> tags;
		Person(int ID, String name, String password)
		{
			this.ID = ID;
			this.name = name;
			this.password = password;
			booking = 0;
			earned = 0;
			tags = new ArrayList<String>();
		}
	}
}