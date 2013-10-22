
package models;
/**
 * @author yee
 * Info holder for player's name,race,color
 */
public class Player
{
	String name;
	String race;
	String color;
	int money;
	int land;
	int goods;

	public Player()
	{
		name = "NOT IN GAME";
		race = "NOT IN GAME";
		color = "NOT IN GAME";
		
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
	
	public int getMoney()
	{
		return money;
	}
	
	public int getLand()
	{
		return land;
	}
	
	public int getGoods()
	{
		return goods;
	}
	
	public int getTotal()
	{
		return (money+land+goods);
	}
	
	public void setMoney( int n )
	{
		money = n;
	}
	
	
	
	public void setLand( int n )
	{
		land = n;
	}
	
	public void setGoods( int n )
	{
		goods = n;
	}
}
