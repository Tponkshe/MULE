package views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class FourthScreenPanel {

	private JFrame frame;
	public JButton[][] buttonArray = new JButton[5][9];
	public String[][] landArr = new String[5][9];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FourthScreenPanel window = new FourthScreenPanel();
					window.frame.setVisible(true);
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FourthScreenPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 850, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		final JPanel panel = new JPanel();
		panel.setBounds(56, 74, 720, 400);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		landArr[0][0]="P";
		landArr[0][1]="P";
		landArr[0][2]="M";
		landArr[0][3]="P";
		landArr[0][4]="R";
		landArr[0][5]="M";
		landArr[0][6]="P";
		landArr[0][7]="P";
		landArr[0][8]="P";
		landArr[1][0]="M";
		landArr[1][1]="M";
		landArr[1][2]="M";
		landArr[1][3]="P";
		landArr[1][4]="R";
		landArr[1][5]="M";
		landArr[1][6]="P";
		landArr[1][7]="P";
		landArr[1][8]="M";
		landArr[2][0]="P";
		landArr[2][1]="M";
		landArr[2][2]="P";
		landArr[2][3]="P";
		landArr[2][4]="R";
		landArr[2][5]="P";
		landArr[2][6]="P";
		landArr[2][7]="M";
		landArr[2][8]="P";
		landArr[3][0]="P";
		landArr[3][1]="P";
		landArr[3][2]="M";
		landArr[3][3]="P";
		landArr[3][4]="R";
		landArr[3][5]="P";
		landArr[3][6]="P";
		landArr[3][7]="M";
		landArr[3][8]="P";
		landArr[4][0]="P";
		landArr[4][1]="P";
		landArr[4][2]="M";
		landArr[4][3]="P";
		landArr[4][4]="R";
		landArr[4][5]="P";
		landArr[4][6]="M";
		landArr[4][7]="P";
		landArr[4][8]="P";
		int n=0;
		for(int i=0;i<5;i++){
			for(int j=0;j<9;j++){
				final JButton button = new JButton("");
				//change directory - nikhils- /Users/nikhilkarajgikar/Dev/CS 2340/MULE/M5
				button.setIcon(new ImageIcon("/Users/nikhilkarajgikar/Dev/M5/src/temp/images/map1_"+(n+1)+".gif"));
				n++;
				button.setBounds(80*j, 80*i, 80, 80);
				button.setName(landArr[i][j]);
				button.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						button.setBorder(BorderFactory.createBevelBorder(1, Color.BLUE, Color.black));
						button.setEnabled(false);
						button.setVisible(true);
						panel.repaint();
					}
				});
				buttonArray[i][j] = button;
				panel.add(button);
			}
		}
		
	}
}
