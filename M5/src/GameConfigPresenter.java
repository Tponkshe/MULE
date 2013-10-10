import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class GameConfigPresenter
{

	private GameConfigView view;
	private GameConfigModel model;
	
	public GameConfigPresenter( GameConfigView view, GameConfigModel model )
	{
		this.view = view;
		this.model = model;
		
		this.view.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed( ActionEvent e )
			{
				onSubmit();
			}
		});
	}

	public void onSubmit()
	{
		model.setDifficulty( view.getDifficultyValue() );
		int a =  view.getDifficultyValue();
		System.out.println(a);
		PlayerConfigPresenter p = new PlayerConfigPresenter( view );
	}

	public static void main( String[] args )
	{
		GameConfigPanel panel = new GameConfigPanel();
		GameConfigView view = new GameConfigView( panel );
		GameConfigModel model = new GameConfigModel();
		GameConfigPresenter p = new GameConfigPresenter( view, model );
	}

}
