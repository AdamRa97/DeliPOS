import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CondimentGui extends JFrame {

	private JPanel contentPane;
	private JTextField jt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CondimentGui frame = new CondimentGui();
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
	public CondimentGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jt = new JTextField();
		jt.setBounds(300, 45, 125, 200);
		jt.setForeground(SystemColor.desktop);
		jt.setBackground(new Color(255, 255, 255));
		jt.setEnabled(false);
		jt.setEditable(false);
		contentPane.add(jt);
		
		JLabel lblNewLabel = new JLabel("My Order");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(325, 15, 85, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Condiments");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(102, 61, 93, 26);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Mayonnaise");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(21, 98, 111, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Yellow Mustard");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(21, 146, 111, 37);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Oil");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(156, 100, 111, 32);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Spicy Mustard");
		btnNewButton_3.setBounds(21, 194, 111, 37);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Russian Dressing");
		btnNewButton_4.setBounds(156, 194, 111, 37);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(156, 146, 111, 37);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_2 = new JLabel("PlaceHolder for Logo");
		lblNewLabel_2.setBounds(90, 11, 105, 39);
		contentPane.add(lblNewLabel_2);
	}
}
