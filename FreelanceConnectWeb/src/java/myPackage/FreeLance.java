package myPackage;
import java.util.*;
import java.lang.Math;
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
	public ArrayList<Person> tagMatch(String tag)
	{
		ArrayList<Person> workers = new ArrayList<Person>();
		for(int i = 0; i < Info.size(); i++)
		{
			if(Info.get(i).type.equals("freelancerTpye"))
			{
				if(findTag(Info.get(i).tags,tag))
				{
					workers.add(Info.get(i));
				}
			}
		}
		return workers;
	}
	
	boolean findTag(ArrayList<String> tagList, String tag)
	{
		//coverts the array list to a string array
		String tagText = tagList.toArray().toString();
		
		//converts everything to lowercase values
		tagText.toLowerCase();
		tag.toLowerCase();
		
		//prime values
		int prime = 13;
		
		//number of typeable characters
		int letters = 256;
		
		//size of text file filled with all tags belonging to freelancer
		int textSize = tagText.length();
		
		//size of tag being searched for
		int findSize = tag.length();
		int hashText = 0;
		int hashFind = 0;
		
		
		int h = (int)Math.pow(letters, findSize-1) %prime;
		
		//hash value for the tag being searched
		//hash value of first box in text file
		for(int i = 0; i < findSize; i++)
		{
			hashFind = (letters*hashFind+tag.charAt(i))%prime;
			hashText = (letters*hashText+tagText.charAt(i))%prime;
			
		}
		
		//the box will scroll through the text string till it finds a match
		for(int i = 0; i <= textSize-findSize; i++)
		{
			//if hash values match will do a character by character comprasion
			if(hashFind == hashText)
			{
				int j;
				for(j = 0; j < findSize; j++)
				{
					if(tagText.charAt(i+j)!= tag.charAt(j))
					{
						break;
					}
				}
				if(j == findSize)
				{
					return true;
				}
			}
			//else it will subtract to first char from the has value and
			//add the next char in
			if(i < textSize-findSize)
			{
				hashText = (letters*(hashText-tagText.charAt(i)*h)+tagText.charAt(i+findSize))%prime;
				
				if(hashText<0)
				{
					hashText = (hashText+ prime);
				}
			}
		}
		return false;
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
	public String[] getTags(int ID)
	{
		int length = Info.get(ID).tags.size();
		String[] tags = new String[length];
		for(int i = 0; i < length; i++)
		{
			tags[i] = Info.get(ID).tags.get(i);
		}
		return tags;
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
		//customerType
		//freelancerTpye
		//investorType
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