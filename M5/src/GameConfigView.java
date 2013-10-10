import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;

public class GameConfigView extends JFrame
{
	JSlider slider;
	JSpinner spinner;
	JButton btnNewButton;

	private JPanel panel;
	
	public GameConfigView(JPanel panel)
	{
		setFocusable( true );
		this.setBounds( 100, 100, 450, 300 );
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		this.panel = panel;
		this.getContentPane().add( panel );
		this.setVisible( true );
	}
	
	public int getDifficultyValue() {
		return ((GameConfigPanel) panel).getDifficultyValue();
	}

	public void addActionListener( ActionListener l)
	{
		if (this.panel instanceof GameConfigPanel)
		{
			GameConfigPanel myPanel = (GameConfigPanel) this.panel;
			myPanel.addActionListener( l );
		}
	}
	


}