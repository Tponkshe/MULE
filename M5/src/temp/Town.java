import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import javax.swing.JFormattedTextField;


public class Town {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Town window = new Town();
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
	public Town() {
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
		
		JLabel lblNewLabel = new JLabel("                          M.U.L.E.");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(163, 11, 339, 49);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TOWN");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(163, 71, 339, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 96, 492, 285);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(10, 11, 65, 57);
		panel.add(lblNewLabel_2);
		
		JLabel muleE1 = new JLabel("New label");
		muleE1.setBounds(417, 11, 65, 57);
		panel.add(muleE1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(10, 136, 91, 138);
		panel.add(lblNewLabel_4);
		
		JLabel muleE2 = new JLabel("New label");
		muleE2.setBounds(269, 11, 65, 57);
		panel.add(muleE2);
		
		JLabel muleStore = new JLabel("New label");
		muleStore.setBounds(376, 136, 106, 138);
		panel.add(muleStore);
		
		JButton btnPub = new JButton("");
		btnPub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPub.setIcon(new ImageIcon("C:\\Users\\Tanay\\workspace\\MULE\\src\\miniPub.jpg"));
		btnPub.setBounds(235, 150, 99, 111);
		panel.add(btnPub);
		
		JButton btnLand = new JButton("");
		btnLand.setIcon(new ImageIcon("C:\\Users\\Tanay\\workspace\\MULE\\src\\miniLand.jpg"));
		btnLand.setBounds(111, 150, 99, 111);
		panel.add(btnLand);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(111, 28, 65, 57);
		panel.add(btnNewButton_1);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(413, 392, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JButton btnNewButton = new JButton("Next>>");
		btnNewButton.setBounds(314, 392, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\Tanay\\workspace\\MuleGame\\src\\mule_mini.jpg"));
		lblNewLabel_10.setBounds(57, 11, 77, 74);
		frame.getContentPane().add(lblNewLabel_10);
	}
}
