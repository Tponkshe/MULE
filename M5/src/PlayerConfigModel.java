
public class PlayerConfigModel {
	Player[] players;

	PlayerConfigModel()
	{
		players = new Player[4];
		for ( int i = 0; i < 4; i++ )
		{
			players[i] = new Player();
		}
	}
	
	public Player getPlayer(int i) {
		return players[i];
	}
}
