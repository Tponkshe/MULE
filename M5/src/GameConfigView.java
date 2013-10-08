import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;


public class GameConfigView extends JFrame {
	
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
	import java.awt.EventQueue;



	private JFrame frame;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameGui window = new GameGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public GameConfigView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("M.U.L.E.");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(147, 11, 256, 76);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Select Difficulty Level:");
		lblNewLabel_1.setBounds(10, 98, 142, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblSelectMapType = new JLabel("Select Map type:");
		lblSelectMapType.setBounds(10, 137, 123, 14);
		frame.getContentPane().add(lblSelectMapType);
		
		JLabel lblSelectNoOf = new JLabel("Select no. of players:");
		lblSelectNoOf.setBounds(10, 175, 123, 14);
		frame.getContentPane().add(lblSelectNoOf);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(208, 173, 43, 17);
		frame.getContentPane().add(spinner);
		
		JButton btnNewButton = new JButton("Next >>");
		btnNewButton.setBounds(158, 201, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(257, 201, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(59, 200, 89, 23);
		frame.getContentPane().add(btnClear);
		
		JSlider slider = new JSlider();
		slider.setValue(0);
		slider.setMaximum(2);
		slider.setBounds(162, 92, 150, 20);
		frame.getContentPane().add(slider);
		
		JLabel lblNewLabel_2 = new JLabel("Beginner");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(129, 112, 200, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblshyamakAggarwalTanay = new JLabel(" \u00A9 Shyamak Aggarwal, Tanay Ponkshe, Nikhil Karajgikar, Jerry Yee & Ishaan Grover ");
		lblshyamakAggarwalTanay.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		lblshyamakAggarwalTanay.setBounds(10, 238, 407, 14);
		frame.getContentPane().add(lblshyamakAggarwalTanay);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 235, 393, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Tanay\\workspace\\MuleGame\\src\\mule_mini.jpg"));
		lblNewLabel_3.setBounds(60, 11, 77, 76);
		frame.getContentPane().add(lblNewLabel_3);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(208, 134, 43, 20);
		frame.getContentPane().add(spinner_1);
	}
}



