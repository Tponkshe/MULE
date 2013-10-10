import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class GameConfigPresenter
{

	private View view;
	private GameConfigModel model;

	public GameConfigPresenter( View view, GameConfigModel model )
	{
		this.view = view;
		this.model = model;

		this.view.addActionListener( new ActionListener()
		{
			@Override
			public void actionPerformed( ActionEvent e )
			{
				onSubmit();
			}
		} );
	}

	public void onSubmit()
	{
		model.setDifficulty( view.getDifficultyValue() );

		if (view.getNumPlayers() == 0)
		{
			System.out.println( "num players cant be 0 dummy" );
		}
		else
		{
			PlayerConfigPresenter p = new PlayerConfigPresenter( view,
					view.getNumPlayers() );
		}
	}

	public static void main( String[] args )
	{
		GameConfigPanel panel = new GameConfigPanel();
		View view = new View( panel );
		GameConfigModel model = new GameConfigModel();
		GameConfigPresenter p = new GameConfigPresenter( view, model );
	}

}
