package views;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;


public class ThirdScreenPanel {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThirdScreenPanel window = new ThirdScreenPanel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ThirdScreenPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 581, 694);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 78, 542, 125);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblPlayer = new JLabel("Player 1 Name");
		lblPlayer.setBounds(74, 11, 301, 14);
		panel.add(lblPlayer);
		
		JLabel lblNewLabel = new JLabel("Money");
		lblNewLabel.setBounds(74, 36, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Land");
		lblNewLabel_1.setBounds(74, 61, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Goods");
		lblNewLabel_2.setBounds(74, 86, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Total");
		lblNewLabel_3.setBounds(74, 111, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(314, 36, 159, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(314, 61, 159, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(314, 86, 159, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(314, 111, 159, 14);
		panel.add(lblNewLabel_7);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 214, 542, 125);
		frame.getContentPane().add(panel_1);
		
		JLabel lblPlayerName = new JLabel("Player 2 Name");
		lblPlayerName.setBounds(74, 11, 301, 14);
		panel_1.add(lblPlayerName);
		
		JLabel label_1 = new JLabel("Money");
		label_1.setBounds(74, 36, 46, 14);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("Land");
		label_2.setBounds(74, 61, 46, 14);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("Goods");
		label_3.setBounds(74, 86, 46, 14);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Total");
		label_4.setBounds(74, 111, 46, 14);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setBounds(314, 36, 159, 14);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setBounds(314, 61, 159, 14);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setBounds(314, 86, 159, 14);
		panel_1.add(label_7);
		
		JLabel label_8 = new JLabel("New label");
		label_8.setBounds(314, 111, 159, 14);
		panel_1.add(label_8);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(10, 350, 542, 125);
		frame.getContentPane().add(panel_2);
		
		JLabel lblPlayerName_1 = new JLabel("Player 3 Name");
		lblPlayerName_1.setBounds(74, 11, 301, 14);
		panel_2.add(lblPlayerName_1);
		
		JLabel label_9 = new JLabel("Money");
		label_9.setBounds(74, 36, 46, 14);
		panel_2.add(label_9);
		
		JLabel label_10 = new JLabel("Land");
		label_10.setBounds(74, 61, 46, 14);
		panel_2.add(label_10);
		
		JLabel label_11 = new JLabel("Goods");
		label_11.setBounds(74, 86, 46, 14);
		panel_2.add(label_11);
		
		JLabel label_12 = new JLabel("Total");
		label_12.setBounds(74, 111, 46, 14);
		panel_2.add(label_12);
		
		JLabel label_13 = new JLabel("New label");
		label_13.setBounds(314, 36, 159, 14);
		panel_2.add(label_13);
		
		JLabel label_14 = new JLabel("New label");
		label_14.setBounds(314, 61, 159, 14);
		panel_2.add(label_14);
		
		JLabel label_15 = new JLabel("New label");
		label_15.setBounds(314, 86, 159, 14);
		panel_2.add(label_15);
		
		JLabel label_16 = new JLabel("New label");
		label_16.setBounds(314, 111, 159, 14);
		panel_2.add(label_16);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(10, 486, 542, 125);
		frame.getContentPane().add(panel_3);
		
		JLabel lblPlayerName_2 = new JLabel("Player 4 Name");
		lblPlayerName_2.setBounds(74, 11, 301, 14);
		panel_3.add(lblPlayerName_2);
		
		JLabel label_17 = new JLabel("Money");
		label_17.setBounds(74, 36, 46, 14);
		panel_3.add(label_17);
		
		JLabel label_18 = new JLabel("Land");
		label_18.setBounds(74, 61, 46, 14);
		panel_3.add(label_18);
		
		JLabel label_19 = new JLabel("Goods");
		label_19.setBounds(74, 86, 46, 14);
		panel_3.add(label_19);
		
		JLabel label_20 = new JLabel("Total");
		label_20.setBounds(74, 111, 46, 14);
		panel_3.add(label_20);
		
		JLabel label_21 = new JLabel("New label");
		label_21.setBounds(314, 36, 159, 14);
		panel_3.add(label_21);
		
		JLabel label_22 = new JLabel("New label");
		label_22.setBounds(314, 61, 159, 14);
		panel_3.add(label_22);
		
		JLabel label_23 = new JLabel("New label");
		label_23.setBounds(314, 86, 159, 14);
		panel_3.add(label_23);
		
		JLabel label_24 = new JLabel("New label");
		label_24.setBounds(314, 111, 159, 14);
		panel_3.add(label_24);
		
		JButton btnNewButton = new JButton("<<Back");
		btnNewButton.setBounds(265, 622, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Next>>");
		btnNewButton_1.setBounds(364, 622, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(463, 622, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblStatusSummary = new JLabel("Status Summary #0");
		lblStatusSummary.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatusSummary.setBounds(10, 53, 542, 14);
		frame.getContentPane().add(lblStatusSummary);
		
		JLabel lblNewLabel_8 = new JLabel("M.U.L.E.");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(115, 11, 437, 31);
		frame.getContentPane().add(lblNewLabel_8);
	}
}
