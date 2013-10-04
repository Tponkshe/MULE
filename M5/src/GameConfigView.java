import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GameConfigView extends JFrame {
	JButton button = new JButton();
	public void addActionListener(ActionListener listener)
	{
		button.addActionListener(listener);
	}
	
	public int getDifficultyValue()
	{
		return 0;
	}
	
	public int getNumberOfPlayersValue()
	{
		return 0;
	}
	
	public int getMapTypeValue()
	{
		return 0;
	}
	
	public void show()
	{
		
	}

}

