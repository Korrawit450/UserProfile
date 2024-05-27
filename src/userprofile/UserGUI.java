package userprofile;
import java.awt.*;
import javax.swing.*;

public class UserGUI {
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	private JLabel label;
	private JTextField textField;
	
	public UserGUI() {
		frame = new JFrame();
		frame.setTitle("Java GUI");
		frame.setSize(400, 300);
		
		panel = new JPanel();
		button = new JButton("Click Me");
		label = new JLabel("Name : ");
		textField = new JTextField(15);
		labelHi = new JLabel("");
		
		panel.add(label);
		panel.add(textField);
		panel.add(button);
		panel.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new UserGUI();
	}

}
