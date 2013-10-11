
/**
 * @author yee
 * Info holder for player's name,race,color
 */
public class Player
{
	String name;
	String race;
	String color;

	public Player()
	{
		name = "";
		race = "";
		color = "";
	}

	public String getName()
	{
		return name;
	}

	public void setName( String n )
	{
		name = n;
	}

	public String getRace()
	{
		return race;
	}

	public void setRace( String n )
	{
		race = n;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor( String n )
	{
		color = n;
	}
}
