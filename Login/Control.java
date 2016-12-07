package Login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class Control implements ActionListener {

	
	JFrame ventana;
	JLabel valor,username,password;
	static String pass="pass";
	static String usernam="usuario";
	JButton ok, cancel, salir;
	JTextField esp1;
	JPasswordField esp2;
	
	

	
	public Control() {
		ventana= new JFrame("Control de acceso");
		ventana.setSize(300, 250);
		ventana.setLocation(100,100);
		ventana.setContentPane(crearPanelVentana());
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	private Container crearPanelVentana() {
		JPanel panel= new JPanel (new BorderLayout(0,10));
		
		panel.setBorder(BorderFactory.createEmptyBorder(20,10,20,10));

		valor= new JLabel();
		
	
		valor.setFont(new Font("arial",Font.BOLD,20));
		valor.setForeground(Color.black);
		valor.setHorizontalAlignment(JLabel.CENTER);
		
		panel.add(valor,BorderLayout.CENTER);
		panel.add(crearPanelBotones(),BorderLayout.SOUTH);
		panel.add(crearPanelBotones2(),BorderLayout.CENTER);
	
		return panel;
	}

	private Component crearPanelBotones() {
		JPanel panel= new JPanel(new GridLayout(1,3,10,10));	

		ok = new JButton ("ok");
		ok.addActionListener(this);
		ok.setActionCommand("ok");
		panel.add(ok);
		
		cancel = new JButton ("cancel");
		cancel.addActionListener(this);
		cancel.setActionCommand("cancel");
		panel.add(cancel);
		
		salir = new JButton ("salir");
		salir.addActionListener(this);
		salir.setActionCommand("salir");
		panel.add(salir);
	
		return panel;
	}

	private Component crearPanelBotones2() {
		
		JPanel panel= new JPanel(new GridLayout(2,2,10,10));
		panel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.RED),BorderFactory.createTitledBorder("Identificacion")));
		
	
		
		
		username = new JLabel ("Usarname");	
		username.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.WHITE,Color.gray));
		panel.add(username);
		
		esp1 = new JTextField ("");
		panel.add(esp1);
		
		password = new JLabel ("Password");
		password.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.WHITE,Color.gray));
		panel.add(password);
		
		esp2= new JPasswordField (10);
		esp2.addActionListener(this);
		esp2.setActionCommand("ok");
		panel.add(esp2);
		
		
		return panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		String usuario, clave;
		switch(e.getActionCommand()) {
		case "ok":
			usuario=esp1.getText();
			clave=String.valueOf(esp2.getPassword());
		
		if (usuario.equals(usernam) && pass.equals(clave)) {
			
			JOptionPane.showMessageDialog(ventana,  "Contraseña correcta!", "Warning", JOptionPane.INFORMATION_MESSAGE);
			ventana.dispose();
		}
		
		else {
			JOptionPane.showMessageDialog(ventana,  "Contraseña incorrecta!", "Warning", JOptionPane.WARNING_MESSAGE);
			esp1.setText("");
			esp2.setText("");
		}
		
		case "cancel" :
			esp1.setText("");
			esp2.setText("");
			
			break;
		
		
		case "salir" :
			ventana.dispose();
			break;
			
		}
	}
	
	
public static void main(String[] args) {
		
		Control ejercicio = new Control();
	}
		
	}


