package userAuthenticationUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class User_Authentication_UI {

	private JFrame frame;
	private JTextField textField_Username;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User_Authentication_UI window = new User_Authentication_UI();
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
	public User_Authentication_UI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 341, 276);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel labelUsername = new JLabel("Username");
		labelUsername.setBounds(18, 46, 70, 16);
		frame.getContentPane().add(labelUsername);
		
		JLabel labelPassword = new JLabel("Password");
		labelPassword.setBounds(18, 80, 70, 16);
		frame.getContentPane().add(labelPassword);
		
		final JLabel labelSuccess = new JLabel("");
		labelSuccess.setBounds(110, 208, 117, 16);
		frame.getContentPane().add(labelSuccess);
		labelSuccess.setVisible(true);
		
		textField_Username = new JTextField();
		textField_Username.setBounds(100, 41, 221, 26);
		frame.getContentPane().add(textField_Username);
		textField_Username.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(100, 75, 221, 26);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputUsername = textField_Username.getText();
				String inputPassword = passwordField.getText();
				
				if(inputUsername.equals("Kyle Brent") && inputPassword.equals("hello12345")) {
					System.out.println("Login Success!");
					labelSuccess.setText("Login Success!");
				}
				else {
					System.out.println("Login Failed!");
					labelSuccess.setText("Login Failed!");
				}
			}
		});
		btnLogin.setBounds(100, 113, 117, 29);
		frame.getContentPane().add(btnLogin);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_Username.setText("");
				passwordField.setText("");
			}
		});
		btnClear.setBounds(100, 141, 117, 29);
		frame.getContentPane().add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(100, 167, 117, 29);
		frame.getContentPane().add(btnExit);

	}
}
