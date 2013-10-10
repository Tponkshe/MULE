import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerConfigPresenter
{

	private View view;
	private PlayerConfigModel model;

	private PlayerConfigPanel panel;
	
	int numPlayers;

	public PlayerConfigPresenter( View view, int numPlayers )
	{
		this.numPlayers = numPlayers;
		this.view = view;
		this.model = new PlayerConfigModel();
		this.panel = new PlayerConfigPanel(numPlayers);

		this.view.setPanel( this.panel );
		this.view.addActionListener( new ActionListener()
		{

			@Override
			public void actionPerformed( ActionEvent arg0 )
			{
				onSubmit();
			}
		} );
	}

	public void onSubmit()
	{
		// STEP 3: UPDATE IN THE MODEL THE VALUE YOU GET FROM VIEW
		for (int i = 0; i < numPlayers; i++) {
			System.out.println("Name set to " + view.getPlayerNames()[i]);
			model.setName( view.getPlayerNames()[i] );
		}
	}

}
