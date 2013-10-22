import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class FifthScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FifthScreen window = new FifthScreen();
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
	public FifthScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 18));
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 61, 526, 260);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Land Auction #1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 526, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("No Bids Tendered");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 36, 526, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Bids start at");
		lblNewLabel_2.setBounds(10, 357, 287, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(419, 357, 117, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblMoney = new JLabel("Money");
		lblMoney.setBounds(10, 332, 46, 14);
		frame.getContentPane().add(lblMoney);
		
		JLabel label = new JLabel("Money");
		label.setBounds(490, 332, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(101, 332, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(200, 332, 46, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(299, 332, 46, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(386, 332, 46, 14);
		frame.getContentPane().add(label_3);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(447, 382, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JButton btnNext = new JButton("Next>>");
		btnNext.setBounds(335, 382, 89, 23);
		frame.getContentPane().add(btnNext);
		frame.setBounds(100, 100, 562, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
