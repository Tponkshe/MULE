
/**
 * @author yee
 * Getters and setters for numPlayers and returns particular player object
 */
public class PlayerConfigModel {
	Player[] players;
	int numPlayers;

	/**
	 * @param numPlayers initializes the players array, initialize a player object for each player in the game
	 * 
	 */
	public PlayerConfigModel( int numPlayers)
	{
	    this.numPlayers = numPlayers;
		players = new Player[4];
		for ( int i = 0; i < 4; i++ )
		{
			players[i] = new Player();
		}
	}
	
	public int getNumPlayers() {
	    return this.numPlayers;
	}
	
	public Player getPlayer(int i) {
		return players[i];
	}
}
