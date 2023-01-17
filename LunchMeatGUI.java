import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class LunchMeatGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LunchMeatGUI frame = new LunchMeatGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LunchMeatGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("CheckBox.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("My Order");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(325, 15, 85, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Lunch Meat (Turkey)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(102, 61, 93, 26);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Turkey");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(21, 98, 111, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Honey Turkey");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(21, 146, 111, 37);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Turkey Ham");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(156, 100, 111, 32);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Turkey Salami");
		btnNewButton_3.setBounds(21, 194, 111, 37);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Turkey Pastrami");
		btnNewButton_4.setBounds(156, 194, 111, 37);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Oven Roasted Turkey");
		btnNewButton_5.setBounds(156, 146, 111, 37);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_2 = new JLabel("PlaceHolder for Logo");
		lblNewLabel_2.setBounds(90, 11, 105, 39);
		contentPane.add(lblNewLabel_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(300, 45, 125, 200);
		contentPane.add(textArea);
		Border border = BorderFactory.createLineBorder(Color.BLACK);
	    textArea.setBorder(BorderFactory.createCompoundBorder(border,
	            BorderFactory.createEmptyBorder(10, 10, 10, 10)));
	}

}
