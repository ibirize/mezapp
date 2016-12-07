package Login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
	final private String LOG_IN = "LOG IN";
	final private String SIGN_UP = "SIGN UP";
	
	public Login(){
		this.setTitle(LOG_IN);
		this.setLocation(100,100);
		this.setSize(350, 185);
		this.setContentPane(createWindowContent());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public Container createWindowContent(){
		JPanel panel = new JPanel(new BorderLayout(10, 10));
		
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		panel.add(createLogger(), BorderLayout.CENTER);
		panel.add(createButtons(), BorderLayout.SOUTH);
		
		return panel;
	}

	public Component createLogger(){
		JPanel logger = new JPanel(new GridLayout(2, 2,10,10));
		JLabel lUser = new JLabel("User");
		JLabel lPassword = new JLabel("Password");
		JTextField tUser = new JTextField();
		JPasswordField pPassword = new JPasswordField();
		
		logger.setBorder(BorderFactory.createTitledBorder(LOG_IN));
		
		lUser.setHorizontalAlignment(JLabel.CENTER);
		lPassword.setHorizontalAlignment(JLabel.CENTER);
		
		tUser.setActionCommand(LOG_IN);
		pPassword.setActionCommand(LOG_IN);
		
		logger.add(lUser);
		logger.add(tUser);
		logger.add(lPassword);
		logger.add(pPassword);
	
		return logger;
	}
	
	public Component createButtons(){
		JPanel buttons = new JPanel(new GridLayout(1,2));
		JPanel pLogin = new JPanel(new FlowLayout());
		JPanel pSignup = new JPanel(new FlowLayout());
		JButton bLogin = new JButton(LOG_IN);
		JButton bSignup = new JButton(SIGN_UP);
		
		bLogin.setActionCommand(LOG_IN);
		pLogin.add(bLogin);
		
		bSignup.setActionCommand(SIGN_UP);
		pSignup.add(bSignup);
		
		buttons.add(pLogin);
		buttons.add(pSignup);
		
		return buttons;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login l = new Login();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
