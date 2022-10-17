import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class LOGIN
{

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					LOGIN window = new LOGIN();
					window.frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	public LOGIN()
	{
		initialize();
	}

	private void initialize()
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 744, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("USER LOGIN");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 55));
		lblNewLabel.setBounds(151, 22, 462, 54);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel_1.setBounds(86, 192, 138, 26);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("USERNAME");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel_2.setBounds(86, 142, 138, 26);
		frame.getContentPane().add(lblNewLabel_2);

		textField = new JTextField();
		textField.setBounds(216, 142, 204, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(216, 192, 204, 26);
		frame.getContentPane().add(passwordField);

		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String username = textField.getText();
				String password = textField.getText();

				if (password.contains("world") && username.contains("hello"))
				{
					textField.setText(null);
					passwordField.setText(null);
				} else
				{
					JOptionPane.showMessageDialog(null, "  INVALID LOGIN  ", " ERROR ", JOptionPane.ERROR_MESSAGE);
					textField.setText(null);
					passwordField.setText(null);

				}
			}
		});
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 18));
		btnNewButton.setBounds(91, 310, 103, 26);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				textField.setText(null);
				passwordField.setText(null);
			}
		});
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		btnNewButton_1.setBounds(259, 310, 103, 26);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("EXIT");
		btnNewButton_2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		btnNewButton_2.setFont(new Font("SansSerif", Font.BOLD, 18));
		btnNewButton_2.setBounds(445, 310, 103, 26);
		frame.getContentPane().add(btnNewButton_2);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 266, 710, 12);
		frame.getContentPane().add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 93, 710, 12);
		frame.getContentPane().add(separator_1);
	}
}
