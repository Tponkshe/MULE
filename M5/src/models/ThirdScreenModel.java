package models;

public class ThirdScreenModel {
	int money;
	int land;
	int goods;
	
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
