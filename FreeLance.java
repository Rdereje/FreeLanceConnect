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
	int Add(String name, String password)
	{
		Info.add(new Person(IDcount, name, password));
		IDcount++;
		return IDcount-1;
	}
	boolean addTags(int ID, String tag)
	{
		if(Info.get(ID).tags.contains(tag))
		{
			return false;
		}
		Info.get(ID).tags.add(tag);
		return true;
	}
	String getName(int ID)
	{
		return Info.get(ID).name;
	}
	boolean removeTags(int ID, String tag)
	{
		return Info.get(ID).tags.remove(tag);
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