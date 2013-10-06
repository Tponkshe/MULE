public class GameConfigModel {
	private int difficulty;
	private int mapType;
	private int numberOfPlayers;
	
	public GameConfigModel()
	{
		difficulty = 0;
		mapType = 0;
		numberOfPlayers = 0;
	}
	
	public int getDifficulty()
	{
		return difficulty;
	}
	
	public void setDifficulty(int difficulty)
	{
		this.difficulty = difficulty;
	}
	
	public int getMapType()
	{
		return mapType;
	}
	
	public void setMapType(int mapType)
	{
		this.mapType = mapType;
	}
	
	public int getNumberOfPlayers()
	{
		return numberOfPlayers;
	}
	
	public void setNumberOfPlayers(int numberOfPlayers)
	{
		this.numberOfPlayers = numberOfPlayers;
	}
	
}

