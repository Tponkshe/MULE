import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class PlayerConfigPresenter
{

	private GameConfigView view;
	private PlayerConfigModel model;
	
	private PlayerConfigPanel panel;

	public PlayerConfigPresenter( GameConfigView view )
	{
		this.view = view;
		this.model = new PlayerConfigModel();
		this.panel = new PlayerConfigPanel();
		this.view.getContentPane().add( this.panel );
		

	}

	public void onSubmit()
	{
		model.setName( panel.getNameValue() );
		model.setRace( panel.getRaceValue() );
		model.setColor( panel.getColorValue() );
	}

}
