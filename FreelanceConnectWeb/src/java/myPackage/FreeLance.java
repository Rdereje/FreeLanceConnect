package myPackage;
import java.util.*;
public class FreeLance
{       //test comment
	List<Person> Info;
	int IDcount;
	public FreeLance()
	{
		Info = new ArrayList<Person>();
		IDcount = 0;
	}
	//makes a new account
	//takes dispay name and password
	//returns person ID CAN NOT BE CHANGED
	public int Add(String name, String password, String email, String type)
	{
		Info.add(new Person(IDcount, name, password, email, type));
		IDcount++;
		return IDcount-1;
	}
	
	//Adds one tag to the freelancers job description
	//Can call add more
	//if user already has the tag it will return false
	public boolean addTags(int ID, String tag)
	{
		if(Info.get(ID).tags.contains(tag))
		{
			return false;
		}
		Info.get(ID).tags.add(tag);
		return true;
	}
	
	//get user's display name
	public String getName(int ID)
	{
		return Info.get(ID).name;
	}
	
	//remove tags from user description
	//returns false if tag didn't exisit
	public boolean removeTags(int ID, String tag)
	{
		return Info.get(ID).tags.remove(tag);
	}
	
	//returns a string arraylist
	//this arraylist contains the current tags of the freelancer
	ArrayList getTags(int ID)
	{
		return Info.get(ID).tags;
	}
	
	//increase booking information
	public void newCust(int ID)
	{
		Info.get(ID).booking++;
	}
	

	
	//the freelancer's information
	public class Person
	{
		int ID;
		String type;
		String name;
		String password;
		String email;
		int booking;
		int earned;
		ArrayList<String> tags;
		Calendar cal;
		ArrayList<boolean[]> free;
		int current;
		Person(int ID, String name, String password, String email, String type)
		{
			this.ID = ID;
			this.name = name;
			this.password = password;
			this.email = email;
			this.type = type;
			booking = 0;
			earned = 0;
			tags = new ArrayList<String>();
			cal = Calendar.getInstance();
			free = new ArrayList<boolean[]>(90);
			
		}
	}
}