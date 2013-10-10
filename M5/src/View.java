import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;

public class View extends JFrame
{
	JSlider slider;
	JSpinner spinner;
	JButton btnNewButton;

	private JPanel panel;

	public View( JPanel panel )
	{
		setFocusable( true );
		this.setBounds( 100, 100, 450, 300 );
		this.setPreferredSize( new Dimension( 800, 600 ) );
		this.pack();
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		this.panel = panel;
		this.getContentPane().add( panel );
		this.setVisible( true );
	}

	public int getDifficultyValue()
	{
		return ( (GameConfigPanel) panel ).getDifficultyValue();
	}
	
	// STEP 2: IMPLEMENT FUNCTION TO GET THE VALUE FROM VIEW
	public String[] getPlayerNames()
	{
		return ((PlayerConfigPanel) panel).getNames();
	}
	
	public int getNumPlayers() {
		return ((GameConfigPanel) panel).getNumPlayers();
	}

	public void setPanel( JPanel newPanel )
	{
		this.remove( this.panel );
		this.panel = newPanel;

		this.getContentPane().add( newPanel );
		this.revalidate();
		this.repaint();
	}

	public void addActionListener( ActionListener l )
	{
		if (this.panel instanceof GameConfigPanel)
		{
			GameConfigPanel myPanel = (GameConfigPanel) this.panel;
			myPanel.addActionListener( l );
		}
		
		else {
			
			PlayerConfigPanel myPanel = (PlayerConfigPanel) this.panel;
			myPanel.addActionListener( l );
		}
	}

}