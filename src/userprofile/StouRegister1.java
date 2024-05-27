package userprofile;
import java.awt.*;
import javax.swing.*;

public class StouRegister1 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private Font myFont = new Font("TH SarabunPSK", Font.PLAIN,20);
	
	public StouRegister1() {
		
		UIManager.put("Label.font", myFont);
		UIManager.put("TextField.font", myFont);
		UIManager.put("Button.font", myFont);
		
		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		JPanel userInformPanel = new JPanel();
		userInformPanel.setLayout(new GridBagLayout());
		gbc.insets = new Insets(2, 5, 2, 5);
		gbc.gridx = 0;
		gbc.gridy = 0;
		inputPanel.add(userInformPanel, gbc);
		
		JButton btnOK = new JButton("ตกลง");
		gbc.gridx = 0;
		gbc.gridy = 1;
		inputPanel.add(btnOK, gbc);
		
		JLabel lbID = new JLabel("รหัสนักศึกษา");
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridx = 0;
		gbc.gridy = 0;
		userInformPanel.add(lbID, gbc);
		
		JTextField tfID = new JTextField(15);
		gbc.gridx = 1;
		gbc.gridy = 0;
		userInformPanel.add(tfID, gbc);
		
		JLabel lbName = new JLabel("ชื่อ-นามสกุล");
		gbc.gridx = 0;
		gbc.gridy = 1;
		userInformPanel.add(lbName, gbc);
		
		JTextField tfName = new JTextField(15);
		gbc.gridx = 1;
		gbc.gridy = 1;
		userInformPanel.add(tfName, gbc);
		
		getContentPane().add(inputPanel);
	}
		
	public static void main(String[] args) {
		StouRegister1 frame = new StouRegister1();
		frame.setSize(400,250);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
	}

}
