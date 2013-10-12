package views;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class MainScreenPanel extends JPanel {

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();

    JLabel l2;
    JLabel l4;
    JLabel l6;
    JLabel l8;
    JLabel l1;
    JLabel l3;
    JLabel l5;
    JLabel l7;
    
    JLabel[] labels;

    public void setRaceLabel(int playerNum, String race) {
	labels[playerNum].setText(race);
    }

    public MainScreenPanel() {
	setLayout(new GridLayout(2, 2));
	panel1.setLayout(new GridLayout(1, 2));
	l1 = new JLabel();
	l2 = new JLabel();
	l1.setText("Player 1");
	l2.setText("Race...1");
	panel1.add(l1);
	panel1.add(l2);
	add(panel1);

	panel2.setLayout(new GridLayout(1, 2));
	l3 = new JLabel();
	l4 = new JLabel();
	l3.setText("Player 2");
	l4.setText("Race...2");
	panel2.add(l3);
	panel2.add(l4);
	add(panel2);

	panel3.setLayout(new GridLayout(1, 2));
	l5 = new JLabel();
	l6 = new JLabel();
	l5.setText("Player 3");
	l6.setText("Race...3");
	panel3.add(l5);
	panel3.add(l6);
	add(panel3);

	panel4.setLayout(new GridLayout(1, 2));
	l7 = new JLabel();
	l8 = new JLabel();
	l7.setText("Player 4");
	l8.setText("Race...4");
	panel4.add(l7);
	panel4.add(l8);
	add(panel4);

	labels = new JLabel[4];
	labels[0] = l1;
	labels[1] = l3;
	labels[2] = l5;
	labels[3] = l7;
    }
}
