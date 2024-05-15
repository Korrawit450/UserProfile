package userprofile;
import java.awt.*;
import javax.swing.*;

public class UserGUI {
	private JFrame frame;
	
	public UserGUI() {
		frame = new JFrame();
		frame.setTitle("Java GUI");
		frame.setSize(400, 300);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new UserGUI();
	}

}
