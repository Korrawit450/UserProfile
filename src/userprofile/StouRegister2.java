package userprofile;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StouRegister2 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private Font myFont = new Font("TH SarabunPSK", Font.PLAIN, 20);
	private CardLayout card = new CardLayout();
	private JPanel inputPanel;
	private JPanel outputPanel;
	
	private JLabel lbShowID;
	private JLabel lbShowName;
	
	public StouRegister2() {
		UIManager.put("Label.font", myFont);
		UIManager.put("TextField.font", myFont);
		UIManager.put("Button.font", myFont);
		
		getContentPane().setLayout(card);
		
		createInputPanel();
		createOutputPanel();
		
		getContentPane().add(inputPanel, "page 1");
		getContentPane().add(outputPanel, "page 2");
	}
	
	private void createInputPanel() {
		
		inputPanel = new JPanel();
		inputPanel.setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		JPanel userInformPanel = new JPanel();
		userInformPanel.setLayout(new GridBagLayout());
		gbc.insets = new Insets(2,5,2,5);
		
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
		
		btnOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lbShowID.setText("รหัสนักศึกษา : "+tfID.getText());
				lbShowName.setText("ชื่อ-นามสกุล : "+tfName.getText());
				
				card.show(getContentPane(), "page 2");
			}
		});
		
	}
	
	private void createOutputPanel() {
		
		outputPanel = new JPanel();
		outputPanel.setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		JLabel header = new JLabel("สรุปการกรอกข้อมูล");
		gbc.insets = new Insets(2,0,2,0);
		
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridx = 0;
		gbc.gridy = 0;
		outputPanel.add(header, gbc);
		
		lbShowID = new JLabel();
		gbc.gridx = 0;
		gbc.gridy = 1;
		outputPanel.add(lbShowID, gbc);
		
		lbShowName = new JLabel();
		gbc.gridx = 0;
		gbc.gridy = 2;
		outputPanel.add(lbShowName, gbc);
		
		JButton btnEdit = new JButton("แก้ไข");
		gbc.gridx = 0;
		gbc.gridy = 3;
		outputPanel.add(btnEdit, gbc);
		
		btnEdit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				card.show(getContentPane(), "page 1");
				
			}
		});
		
	}
	
	public static void main(String[] args) {
		StouRegister2 frame = new StouRegister2();
		frame.setSize(400,250);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}