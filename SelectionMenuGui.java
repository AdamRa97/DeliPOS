import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class SelectionMenuGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectionMenuGui frame = new SelectionMenuGui();
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
	public SelectionMenuGui() {
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
		
		JLabel lblNewLabel_1 = new JLabel("Selection Menu");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(100, 71, 93, 26);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Hoagie");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(21, 127, 120, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sandwich");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(21, 178, 120, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Kaiser");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(151, 127, 125, 40);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Lunch Meat");
		btnNewButton_3.setBounds(151, 178, 125, 40);
		contentPane.add(btnNewButton_3);
		
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
