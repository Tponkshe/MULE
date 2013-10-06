import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GameConfigView extends JFrame {
	JButton button = new JButton();
	public void addActionListener(ActionListener listener)
	{// TODO set to your submit button
		button.addActionListener(listener);
	}
	
	public int getDifficultyValue()
	{
// TODO IMPLEMENT
		return 0;
	}
	
	public int getNumberOfPlayersValue()
	{// TODO IMPLEMENT
		return 0;
	}
	
	public int getMapTypeValue()
	{// TODO IMPLEMENT
		return 0;
	}
	
	public void show()
	{// TODO IMPLEMENT
		
	}

}

