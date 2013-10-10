import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class PlayerConfigView extends JFrame
{


	public PlayerConfigView()
	{
		this.setBounds( 100, 100, 450, 300 );
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		this.getContentPane().setLayout( null );
	}

	public void addActionListener( ActionListener actionListener )
	{
		// TODO Auto-generated method stub

	}

	public String getNameValue()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public String getRaceValue()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public String getColorValue()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public void show()
	{
		this.setVisible( true );
	}

}
