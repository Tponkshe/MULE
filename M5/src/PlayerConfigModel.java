
public class PlayerConfigModel {
	String name;
	String race;
	String color;

	PlayerConfigModel()
	{
		name = "";
		race = "";
		color = "";
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String n)
	{
		name=n;
	}
	
	public String getRace()
	{
		return race;
	}
	
	public void setRace(String n)
	{
		race =n;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String n)
	{
		color=n;
	}
}
