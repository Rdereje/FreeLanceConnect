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
	//makes a new account
	//takes dispay name and password
	//returns person ID CAN NOT BE CHANGED
	int Add(String name, String password)
	{
		Info.add(new Person(IDcount, name, password));
		IDcount++;
		return IDcount-1;
	}
	
	//Adds one tag to the freelancers job description
	//Can call add more
	//if user already has the tag it will return false
	boolean addTags(int ID, String tag)
	{
		if(Info.get(ID).tags.contains(tag))
		{
			return false;
		}
		Info.get(ID).tags.add(tag);
		return true;
	}
	
	//get user's display name
	String getName(int ID)
	{
		return Info.get(ID).name;
	}
	
	//remove tags from user description
	//returns false if tag didn't exisit
	boolean removeTags(int ID, String tag)
	{
		return Info.get(ID).tags.remove(tag);
	}
	
	//returns a string arraylist
	//this arraylist contains the current tags of the freelancer
	ArrayList getTags(int ID)
	{
		return Info.get(ID).tags;
	}
	
	//the freelancer's information
	class Person
	{
		int ID;
		String name;
		String password;
		int booking;
		int earned;
		ArrayList<String> tags;
		Calendar cal;
		ArrayList<Times> free;
		int current;
		Person(int ID, String name, String password)
		{
			this.ID = ID;
			this.name = name;
			this.password = password;
			booking = 0;
			earned = 0;
			tags = new ArrayList<String>();
			cal = Calendar.getInstance();
			free = new ArrayList<Times>(90);
		}
	}
	class Times
	{
		boolean Moring;
		boolean Afternoon;
		boolean Evening;
		Times()
		{
			Moring = false;
			Afternoon = false;
			Evening = false;
		}
	}
}