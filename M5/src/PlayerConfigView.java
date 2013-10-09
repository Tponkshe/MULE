
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class PlayerConfigView extends JFrame {

    	JFrame frame;
    	public PlayerConfigView() {
        	frame = new JFrame();
		frame.setBounds( 100, 100, 450, 300 );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.getContentPane().setLayout( null );
    	}
    	
	public void addActionListener(ActionListener actionListener) {
		// TODO Auto-generated method stub
		
	}

	public String getNameValue() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getRaceValue() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getColorValue() {
		// TODO Auto-generated method stub
		return null;
	}

	public void show() {
	    frame.setVisible(true);
		
	}

}
